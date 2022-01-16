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
public class game_console {

    private String brand;
    private String model;
    private String ram;
    private String grapics;
    private String price;
    private String delivery;

    public game_console(String brand, String model, String ram, String grapics, String price, String delivery) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.grapics = grapics;
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
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @return the grapics
     */
    public String getGrapics() {
        return grapics;
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

     public int visit(cart cart){
         return cart.price(this);
     }
    public int gettotal() {
        int i = Integer.parseInt(price);
        int x = Integer.parseInt(delivery);
        return i + x;
    }
}
