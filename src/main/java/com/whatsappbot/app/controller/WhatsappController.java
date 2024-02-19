package com.whatsappbot.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsappbot.app.bean.UserBean;
import com.whatsappbot.app.bean.WhatsAppMessage;
import com.whatsappbot.app.bean.WhatsAppWebhookPayload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/whatsapp")
public class WhatsappController {
    private static final String VERIFY_TOKEN = "gls_test";
    private static final String token = "EAARoG0Iv7cUBO8uHHtvmnQtdPVRWLvM6qzFa6C1wWV8ZBP4ldUFGUHYuZBWVpX7XrUhiZBPAVBuVlNs6hv90EWlfoR1b7ZCqW3jBEr6qnhTHdp1tJckWqmvu2BJKCoNga2Hue85csOA4XyBYj3p7hX1gn8diEar1ez1ba0vrWYGO9gVH2wA8KEfnZChdKq7R5HRPRqKuPVm1bEj2dLCQZD";

    @GetMapping("/webhook")
    public ResponseEntity<String> verifyWebhook(
            @RequestParam("hub.mode") String mode,
            @RequestParam("hub.verify_token") String token,
            @RequestParam("hub.challenge") String challenge) {

    	if (mode != null && token != null) {
            if ("subscribe".equals(mode) && VERIFY_TOKEN.equals(token)) {
                System.out.println("WEBHOOK_VERIFIED");
                return new ResponseEntity<>(challenge, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void handleWhatsAppWebhook(@RequestBody WhatsAppWebhookPayload payload) {
        // Parse the request body from the POST
        if (payload.getObject() != null) {
            if (payload.getEntry() != null && !payload.getEntry().isEmpty()) {
                WhatsAppMessage message = payload.getEntry().get(0).getChanges().get(0).getValue().getMessages().get(0);

                String phoneNumberId = payload.getEntry().get(0).getChanges().get(0).getValue().getMetadata().getPhone_number_id();
                String from = message.getFrom();
                String msgBody = message.getText().getBody();

                if ("Learn More".equals(msgBody)) {
                	
                } else {
                  
                }

                System.out.println("Received WhatsApp message: " + msgBody + " from: " + from);

                // You may want to use a service or another HTTP client library to send a response
                // to the incoming WhatsApp message

            }
        }
    }
	

}
