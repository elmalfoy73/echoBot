package org.example.echobot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VkMessage {
    @JsonProperty("from_id")
    private int from_id;
    private String text;

    // Getters and Setters
    public int getFromId() {
        return from_id;
    }

    public void setFromId(int from_id) {
        this.from_id = from_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
