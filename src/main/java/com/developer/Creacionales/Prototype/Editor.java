package com.developer.Creacionales.Prototype;

public class Editor {
    public static void main(String[] args) {
        TextBlock original = new TextBlock("Hola mundo" , "Arial", 14, "Negro");
        TextBlock copia = (TextBlock) original.clone();
        copia.setText("Hola Clonado");

        original.show();
        copia.show();
    }
}
