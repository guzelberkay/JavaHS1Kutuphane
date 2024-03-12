package com.berkay.entity;

public class KitapBilim extends Kitap {


    public KitapBilim(String isbn, String baslik, String yazar, int yayinYili) {
        super(isbn, baslik, yazar, yayinYili, Durum.ODUNC_ALINABILIR);
    }
}

