/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodp.assingment.pkg11;

/**
 *
 * @author acer
 */
public class smart_watch {

    private String brand;
    private String model;
    private String Style;
    private String os;
    private String price;
    private String delivery;

    public smart_watch(String brand, String model, String Style, String os, String price, String delivery) {
        this.brand = brand;
        this.model = model;
        this.Style = Style;
        this.os = os;
        this.price = price;
        this.delivery = delivery;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the Style
     */
    public String getStyle() {
        return Style;
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @return the delivery
     */
    public String getDelivery() {
        return delivery;
    }

    public int visit(cart cart) {
        return cart.price(this);
    }

    public int gettotal() {
        int i = Integer.parseInt(price);
        int x = Integer.parseInt(delivery);
        return i + x;
    }
}
