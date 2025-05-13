package com.developer.Creacionales.Builder;

public class Report {

    private final String title;
    private final String content;
    private final String footer;
    private final String author;
    private final String logo;
    private final String format;

    public Report(String title, String content, String footer, String author, String logo, String format){
        this.title = title;
        this.content = content;
        this.footer = footer;
        this.author = author;
        this.logo = logo;
        this.format = format;
    }

    public void show(){
        System.out.println("Reporte generado");
        System.out.println("Titulo" + title);
        System.out.println("Contenido" + content);
        System.out.println("Pie: " + footer);
        System.out.println("Autor: " + author);
        System.out.println("Logo: " + logo);
        System.out.println("Formato: " + format);
    }
}
