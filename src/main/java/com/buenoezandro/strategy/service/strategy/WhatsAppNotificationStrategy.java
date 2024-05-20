package com.buenoezandro.strategy.service.strategy;

import com.buenoezandro.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatsAppNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(WhatsAppNotificationStrategy.class);

    @Override
    public void sendNotification(String message, String destination) {
        logger.info("Notification [{}] sent to WhatsApp [{}]", message, destination);
    }
}