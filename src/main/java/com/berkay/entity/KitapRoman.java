package com.berkay.entity;

public class KitapRoman extends Kitap {


    public KitapRoman(String isbn, String baslik, String yazar, int yayinYili) {
        super(isbn, baslik, yazar, yayinYili, Durum.ODUNC_ALINABILIR);
    }
}
