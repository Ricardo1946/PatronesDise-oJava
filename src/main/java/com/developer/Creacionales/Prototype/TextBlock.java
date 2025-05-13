package com.developer.Creacionales.Prototype;

public class TextBlock implements DocumentPrototype {

    private String text;
    private String font;
    private int fontSize;
    private String color;

    public TextBlock(String text, String font, int fontSize, String color) {
        this.text = text;
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public DocumentPrototype clone() {
        return new TextBlock(text, font, fontSize, color);
    }
    public void setText(String text) {
        this.text = text;
    }
    public void show() {
        System.out.println("texto: " + text + ", Fuente: " + font + ", Tamaño: " + fontSize + ", Color: " + color);
    }
}
