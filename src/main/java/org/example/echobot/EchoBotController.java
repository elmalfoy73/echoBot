package org.example.echobot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/callback")
public class EchoBotController {

    @Value("${vk.api.token}")
    private String token;

    @Value("${vk.group.id}")
    private String groupId;

    @PostMapping
    public String callback(@RequestBody VkRequest request) {
        if ("confirmation".equals(request.getType())) {
            return "5a5feac3";
        }

        if ("message_new".equals(request.getType())) {
            VkMessage message = request.getObject().getMessage();
            int userId = message.getFromId();
            String text = message.getText();
            System.out.println("Parsed userId: " + userId);
            System.out.println("Parsed text: " + text);

            String responseMessage = "Вы сказали: " + text;

            sendMessage(userId, responseMessage);
        }

        return "ok";
    }

    private void sendMessage(int userId, String message) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("https://api.vk.com/method/messages.send?user_id=%d&message=%s&random_id=%d&access_token=%s&v=5.130",
                userId, message, System.currentTimeMillis(), token);

        try {
            String response = restTemplate.getForObject(url, String.class);
            System.out.println("VK API response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
