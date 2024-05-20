package com.buenoezandro.strategy.service;

import com.buenoezandro.strategy.exception.InvalidNotificationChannelException;
import com.buenoezandro.strategy.service.strategy.*;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@Service
public class NotificationService {
    private final Map<String, NotificationStrategy> mapStrategy;

    public NotificationService() {
        mapStrategy = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        mapStrategy.put("Discord", new DiscordNotificationStrategy());
        mapStrategy.put("Instagram", new InstagramNotificationStrategy());
        mapStrategy.put("Twitter", new TwitterNotificationStrategy());
        mapStrategy.put("Email", new EmailNotificationStrategy());
        mapStrategy.put("WhatsApp", new WhatsAppNotificationStrategy());
    }

    public void notify(String channel, String message, String destination) {
        NotificationStrategy strategy = mapStrategy.get(channel);
        if (Objects.isNull(strategy)) {
            throw new InvalidNotificationChannelException(channel);
        }
        strategy.sendNotification(message, destination);
    }
}