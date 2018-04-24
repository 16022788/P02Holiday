package com.wordpress.yinghengsite.p02holiday;

public class PublicHoliday {

    private String name;
    private String date;
    private int image;

    public PublicHoliday(String name, String date, int image) {
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public int getImage(){ return image; }

}
