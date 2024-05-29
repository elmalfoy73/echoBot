package org.example.echobot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

@Service
public class EchoBotService {

    @Value("${vk.api.token}")
    private String token;
    private final RestTemplate restTemplate;
    private final Logger logger = Logger.getLogger(EchoBotService.class.getName());

    public EchoBotService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendMessage(int userId, String text) {
        try {
            String message =  "Вы сказали: " + text;
            String url = String.format("https://api.vk.com/method/messages.send?user_id=%d&message=%s&random_id=%d&access_token=%s&v=5.130",
                    userId, message, System.currentTimeMillis(), token);
            String response = restTemplate.getForObject(url, String.class);
            logger.info("VK API response: " + response);
        } catch (Exception e) {
            logger.severe("Error sending message: " + e.getMessage());
        }
    }
}

