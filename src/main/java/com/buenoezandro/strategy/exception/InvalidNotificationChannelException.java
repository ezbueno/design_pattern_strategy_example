package com.buenoezandro.strategy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidNotificationChannelException extends RuntimeException {
    public InvalidNotificationChannelException(String channel) {
        super("Invalid notification channel: " + channel + ". Please provide a valid channel such as Discord, Instagram, Twitter, Email, or WhatsApp.");
    }
}