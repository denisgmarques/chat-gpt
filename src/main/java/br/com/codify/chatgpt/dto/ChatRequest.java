package br.com.codify.chatgpt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatRequest {
    private String model = "gpt-3.5-turbo";
    private List<Message> messages;
    private int n = 10;
    private double temperature;

    public ChatRequest(String prompt, Integer quantity) {
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
        this.n = quantity;
    }
}
