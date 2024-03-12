package com.berkay;

import com.berkay.controller.Kutuphane;
import com.berkay.entity.*;

public class Runner {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();

        // Kitaplar eklendi

        kutuphane.kitapEkle(new KitapBilim("111", "Kitap 1", "Yazar 1", 2000));
        kutuphane.kitapEkle(new KitapRoman("222", "Kitap 2", "Yazar 2", 2010));
        kutuphane.kitapEkle(new KitapTarih("333", "Kitap 3", "Yazar 3", 2015));

        // Üyeler eklendi

        kutuphane.uyeEkle(new Uye(1, "Ad 1", "Soyad 1"));
        kutuphane.uyeEkle(new Uye(2, "Ad 2", "Soyad 2"));

        // Kitapların alınması ve iadesi

        Kitap kitap1 = kutuphane.getKitapList().get(0);
        kutuphane.uyeKitapAl(1, kitap1);
        kutuphane.uyeKitapIade(1, kitap1);
    }
}