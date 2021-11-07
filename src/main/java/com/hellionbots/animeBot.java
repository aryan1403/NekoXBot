package com.hellionbots;

import com.hellionbots.Services.cfg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class animeBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        
    }

    public Message sendMessage(Update update, String text) {
        Message m;

        try {
            SendMessage message = new SendMessage(update.getMessage().getChatId().toString(), text);
            // message.enableMarkdownV2(true);
            m = execute(message);
            return m;
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public String handler() {
        return cfg.handler;
    }

    @Override
    public String getBotUsername() {
        return cfg.botUsername;
    }

    @Override
    public String getBotToken() {
        return cfg.botToken;
    }
    
}
