package org.example;

public class Experience {
    private String title;
    private String company;
    private String date;
    private String description;

    public Experience(String title, String company, String date, String description) {
        this.title = title;
        this.company = company;
        this.date = date;
        this.description = description;
    }

    // Getter metotları
    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getDate() { return date; }
    public String getDescription() { return description; }
}