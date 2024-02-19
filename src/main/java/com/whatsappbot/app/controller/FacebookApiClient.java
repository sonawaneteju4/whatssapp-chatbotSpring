package com.whatsappbot.app.controller;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.whatsappbot.app.bean.FacebookLanguage;
import com.whatsappbot.app.bean.FacebookMessageRequest;
import com.whatsappbot.app.bean.FacebookTemplate;

public class FacebookApiClient {

    private static final String FACEBOOK_GRAPH_API_URL = "https://graph.facebook.com/v12.0/";
    private static final String token = "EAARoG0Iv7cUBO8uHHtvmnQtdPVRWLvM6qzFa6C1wWV8ZBP4ldUFGUHYuZBWVpX7XrUhiZBPAVBuVlNs6hv90EWlfoR1b7ZCqW3jBEr6qnhTHdp1tJckWqmvu2BJKCoNga2Hue85csOA4XyBYj3p7hX1gn8diEar1ez1ba0vrWYGO9gVH2wA8KEfnZChdKq7R5HRPRqKuPVm1bEj2dLCQZD";

    public void sendFacebookMessage(String phoneNumberId, String from, String token) {
        String url = FACEBOOK_GRAPH_API_URL + phoneNumberId + "/messages?access_token=" + token;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Build the request body
        FacebookMessageRequest request = new FacebookMessageRequest(url, url, url, null);
        request.setMessagingProduct("whatsapp");
        request.setTo(from);
        request.setType("template");
        FacebookTemplate template = new FacebookTemplate();
        template.setName("learn_more");
        template.setLanguage(new FacebookLanguage("en"));
        request.setTemplate(template);

        HttpEntity<FacebookMessageRequest> entity = new HttpEntity<>(request, headers);

        // Make the POST request
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);

        // Handle the response as needed
        System.out.println("Response: " + response.getBody());
    }
}
