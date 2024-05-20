package com.buenoezandro.strategy.service;

public interface NotificationStrategy {
    void sendNotification(String message, String destination);
}