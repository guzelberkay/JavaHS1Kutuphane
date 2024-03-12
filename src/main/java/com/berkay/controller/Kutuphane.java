package com.berkay.controller;

import com.berkay.entity.Kitap;
import com.berkay.entity.Uye;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitapList;
    private List<Uye> uyeList;

    public Kutuphane() {
        this.kitapList = new ArrayList<>();
        this.uyeList = new ArrayList<>();
    }

    // Getter ve Setter metotları

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }

    public List<Uye> getUyeList() {
        return uyeList;
    }

    public void setUyeList(List<Uye> uyeList) {
        this.uyeList = uyeList;
    }

    // Kitap ekleme metodu

    public void kitapEkle(Kitap kitap) {
        kitapList.add(kitap);
    }

    // Üye ekleme metodu

    public void uyeEkle(Uye uye) {
        uyeList.add(uye);
    }

    // Üyenin kitap alma metodu

    public void uyeKitapAl(int uyeId, Kitap kitap) {
        Uye uye = uyeList.stream().filter(u -> u.getId() == uyeId).findFirst().orElse(null);
        if (uye != null) {
            uye.kitapAl(kitap);
        }
    }

    // Üyenin kitap iade metodu

    public void uyeKitapIade(int uyeId, Kitap kitap) {
        Uye uye = uyeList.stream().filter(u -> u.getId() == uyeId).findFirst().orElse(null);
        if (uye != null) {
            uye.kitapIade(kitap);
        }
    }
}

