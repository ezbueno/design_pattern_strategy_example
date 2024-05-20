package com.buenoezandro.strategy.service.strategy;

import com.buenoezandro.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(EmailNotificationStrategy.class);

    @Override
    public void sendNotification(String message, String destination) {
        logger.info("Notification [{}] sent to Email [{}]", message, destination);
    }
}