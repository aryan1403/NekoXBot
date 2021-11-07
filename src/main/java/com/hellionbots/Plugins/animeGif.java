package com.hellionbots.Plugins;

import java.util.Random;
import com.hellionbots.Master;
import com.hellionbots.animeBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;

public class animeGif extends animeBot {
    Master m = (update, cmd) -> {
        if(cmd.equalsIgnoreCase(handler()+"animeGif")) {
            Random random = new Random();
            String n = String.format("%03d", random.nextInt(22)+1);

            SendVideo video = new SendVideo(chatId(update), new InputFile("https://nekos.best/api/v1/hug/"+n+".gif"));
            video.setCaption("Here is your Anime Gif\nJoin @HellionBots & @HellionBotSupport for any Query");

            executeAsync(video);
        }
    };

    public animeGif(Update update) {
        String cmd = update.getMessage().getText();
        m.handleRequest(update, cmd);
    }
}
