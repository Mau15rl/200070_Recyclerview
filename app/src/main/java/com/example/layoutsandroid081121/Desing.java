package com.example.layoutsandroid081121;

public class Desing {
    private String title;
    private String description;
    private String precio;
    private int image;

    public Desing() {


    }


    //Constructor:
    public Desing(String title, String description, String precio, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.precio = precio;
    }

    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }


    public int getImage() {
        return image;
    }


    public String getPrecio() {
        return precio;
    }

}
