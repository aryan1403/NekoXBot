package com.hellionbots.Plugins;

import com.hellionbots.Master;
import com.hellionbots.animeBot;

import org.telegram.telegrambots.meta.api.objects.Update;

public class start extends animeBot {
    Master m = (update, cmd) -> {
        if(cmd.equalsIgnoreCase(handler()+"start")) {
            sendMessage(update, "Welcome to Neko Bot\nI can Generate Anime Image/Gif for you\n\nImage - /animeImage\nGif - /animeGif");
        }
    };

    public start(Update update) {
        String cmd = update.getMessage().getText();
        m.handleRequest(update, cmd);
    }
}
