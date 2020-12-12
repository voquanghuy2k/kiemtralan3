package com.example.thecoffeehouse;

public class item {
    String title_215,text_215,bt_215;
    Integer image_215;

    public item(String title, String text, String bt, Integer image) {
        this.title_215 = title;
        this.text_215 = text;
        this.image_215 = image;
        this.bt_215=bt;
    }

    public String getTitle() {
        return title_215;
    }

    public void setTitle(String title) {
        this.title_215 = title;
    }

    public String getText() {
        return text_215;
    }

    public void setText(String text) {
        this.text_215 = text;
    }

    public String getBt() {
        return bt_215;
    }

    public void setBt(String bt) {
        this.bt_215 = bt;
    }

    public Integer getImage() {
        return image_215;
    }

    public void setImage(Integer image) {
        this.image_215 = image;
    }
}
