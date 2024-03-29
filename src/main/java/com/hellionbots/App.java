package com.hellionbots;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public final class App 
{
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new animeBot());
            System.out.println("Bot Started Successfully");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
