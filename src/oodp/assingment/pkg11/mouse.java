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
public class mouse {

    private String brand;
    private String model;
    private String type;
    private String buttons;
    private String price;
    private String delivery;

    public mouse(String brand, String model, String type, String buttons, String price, String delivery) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.buttons = buttons;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the buttons
     */
    public String getButtons() {
        return buttons;
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
