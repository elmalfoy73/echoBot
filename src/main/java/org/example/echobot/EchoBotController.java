package org.example.echobot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/callback")
public class EchoBotController {

    @Value("${vk.confirmation.code}")
    private String confirmationCode;

    @Autowired
    private EchoBotService echoBotService;

    @PostMapping
    public String callback(@RequestBody VkRequest request) {
        if ("confirmation".equals(request.getType())) {
            return confirmationCode;
        }

        if ("message_new".equals(request.getType())) {
            VkMessage message = request.getObject().getMessage();
            int userId = message.getFromId();
            String text = message.getText();

            echoBotService.sendMessage(userId, text);
        }

        return "ok";
    }
}
