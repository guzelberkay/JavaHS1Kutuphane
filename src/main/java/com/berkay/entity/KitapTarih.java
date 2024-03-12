package com.berkay.entity;

public class KitapTarih extends Kitap {


    public KitapTarih(String isbn, String baslik, String yazar, int yayinYili) {
        super(isbn, baslik, yazar, yayinYili, Durum.ODUNC_ALINABILIR);
    }
}
