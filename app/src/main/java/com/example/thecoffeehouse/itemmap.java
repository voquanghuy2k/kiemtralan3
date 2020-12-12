package com.example.thecoffeehouse;

import android.widget.Spinner;

public class itemmap {
    String namestore_215,mota_215;
    String x_215,y_215;
    Integer image_215;

    public itemmap(String namestore, String mota, String x, String y, Integer image) {
        this.namestore_215 = namestore;
        this.mota_215 = mota;
        this.x_215 = x;
        this.y_215 = y;
        this.image_215=image;
    }

    public String getNamestore() {
        return namestore_215;
    }

    public void setNamestore(String namestore) {
        this.namestore_215 = namestore;
    }

    public String getMota() {
        return mota_215;
    }

    public void setMota(String mota) {
        this.mota_215 = mota;
    }


    public Integer getImage() {
        return image_215;
    }

    public void setImage(Integer image) {
        this.image_215 = image;
    }

    public String getX() {
        return x_215;
    }

    public void setX(String x) {
        this.x_215 = x;
    }

    public String getY() {
        return y_215;
    }

    public void setY(String y) {
        this.y_215 = y;
    }
}
