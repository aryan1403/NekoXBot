package com.hellionbots.Plugins;

import java.util.Random;
import com.hellionbots.Master;
import com.hellionbots.animeBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

public class animeImage extends animeBot {
    Master m = (update, cmd) -> {
        if(cmd.equalsIgnoreCase(handler()+"animeImage")) {
            Random random = new Random();
            String n = String.format("%04d", random.nextInt(99));
            SendPhoto photo = new SendPhoto(chatId(update), new InputFile("https://nekos.best/api/v1/nekos/"+n+".jpg"));
            photo.setCaption("Here is your Anime Image\nJoin @HellionBots & @HellionBotSupport for any Query");

            executeAsync(photo);
        }
    };

    public animeImage(Update update) {
        String cmd = update.getMessage().getText();
        m.handleRequest(update, cmd);
    }
}
