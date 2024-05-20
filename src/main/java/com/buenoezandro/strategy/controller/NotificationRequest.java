package com.buenoezandro.strategy.controller;

import jakarta.validation.constraints.NotBlank;

public record NotificationRequest(@NotBlank String channel, @NotBlank String message, @NotBlank String destination) {
}