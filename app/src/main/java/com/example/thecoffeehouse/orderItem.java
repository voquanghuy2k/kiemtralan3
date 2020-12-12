package com.example.thecoffeehouse;

public class orderItem {
    String title_215,price_215;
    Integer image_215;

    public orderItem(String title, String price, Integer image) {
        this.title_215 = title;
        this.price_215 = price;
        this.image_215 = image;
    }

    public String getTitle() {
        return title_215;
    }

    public void setTitle(String title) {
        this.title_215 = title;
    }

    public String getPrice() {
        return price_215;
    }

    public void setPrice(String price) {
        this.price_215 = price;
    }

    public Integer getImage() {
        return image_215;
    }

    public void setImage(Integer image) {
        this.image_215 = image;
    }
}
