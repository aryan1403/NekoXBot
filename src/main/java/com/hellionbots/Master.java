package com.hellionbots;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface Master {
    void handleRequest(Update update, String cmd);
}
