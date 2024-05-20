package com.buenoezandro.strategy.service.strategy;

import com.buenoezandro.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitterNotificationStrategy implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(TwitterNotificationStrategy.class);

    @Override
    public void sendNotification(String message, String destination) {
        logger.info("Notification [{}] sent to Twitter [{}]", message, destination);
    }
}