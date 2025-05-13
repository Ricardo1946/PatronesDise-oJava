package com.developer.Creacionales.Builder;

public class App {
    public static void main(String[] args) {
        Report report = new ReportBuilder()
                .setTitle("Informe de Ventas Q2")
                .setContent("Datos de ventas acumulador del segundo semestre")
                .setFooter("Confidencial")
                .setAuthor("Departamento comercial")
                .setFormat("PDF")
                .build();

        report.show();
    }
}
