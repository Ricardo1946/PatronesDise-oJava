package com.developer.Creacionales.Builder;

public class ReportBuilder {

    private String title;
    private String content;
    private String footer;
    private String author;
    private String logo;
    private String format;

    public ReportBuilder setTitle(String title){
        this.title = title;
        return this;
    }
    public ReportBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public ReportBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }
    public ReportBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }
    public ReportBuilder setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public ReportBuilder setFormat(String format) {
        this.format = format;
        return  this;
    }
    public Report build() {
        return new Report (title, content, footer, author, logo, format);
    }
}
