package com.company;


public class BMW extends Car implements Rasxodniki {
    
    public BMW(String model, String type, int year, int kelometrazh, int rasxodTopliva) {
        super(model, type, year, kelometrazh, rasxodTopliva);
    }

    @Override
    public int rasxodTopliva() {
        rasxodTopliva = kelometrazh/litruBenza;
        return rasxodTopliva;
    }

    @Override
    public int skolkoProexalaZaGod() {
        skolkoProexalaZaGod = year/kelometrazh;
        return skolkoProexalaZaGod;
    }
}
