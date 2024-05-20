package com.buenoezandro.strategy.service;

public interface NotificationStrategy {
    void sendNotification(String destination, String message);
}