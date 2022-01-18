/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodp.assingment.pkg11;

interface cart {

    public abstract int price(game_console gc);

    public abstract int price(laptop lap);

    public abstract int price(mouse mouse);

    public abstract int price(smart_watch sw);
}

class Subcart implements cart {

    @Override
    public int price(game_console gc) {
        return gc.gettotal();
    }

    @Override
    public int price(laptop lap) {
        return lap.gettotal();
    }

    @Override
    public int price(mouse mouse) {
        return mouse.gettotal();
    }

    @Override
    public int price(smart_watch sw) {
        return sw.gettotal();
    }

}
