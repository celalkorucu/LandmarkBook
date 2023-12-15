package com.celalkorucu.landmarkbookjava;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name ;
    String country ;
    int image ;


    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getImage() {
        return image;
    }
}
