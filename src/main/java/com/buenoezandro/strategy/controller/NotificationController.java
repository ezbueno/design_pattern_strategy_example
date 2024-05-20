package com.buenoezandro.strategy.controller;

import com.buenoezandro.strategy.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<String> send(@RequestBody @Valid NotificationRequest notificationRequest) {
        this.notificationService.notify(notificationRequest.channel(), notificationRequest.message(), notificationRequest.destination());
        return ResponseEntity.ok("Notification sent successfully");
    }
}