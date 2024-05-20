package com.buenoezandro.strategy.service.strategy;

import com.buenoezandro.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscordNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(DiscordNotificationStrategy.class);

    @Override
    public void sendNotification(String message, String destination) {
        logger.info("Notification [{}] sent to Discord [{}]", message, destination);
    }
}