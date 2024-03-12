package com.berkay.entity;


import java.util.ArrayList;
import java.util.List;

public class Uye implements IUye {
    private int id;
    private String ad;
    private String soyad;
    private List<Kitap> kitapList;

    public Uye(int id, String ad, String soyad) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.kitapList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }

    @Override
    public void kitapAl(Kitap kitap) {
        kitap.setDurum(Durum.ODUNC_VERILDI);
        kitapList.add(kitap);
    }

    @Override
    public void kitapIade(Kitap kitap) {
        kitap.setDurum(Durum.ODUNC_ALINABILIR);
        kitapList.remove(kitap);
    }

    @Override
    public List<Kitap> getKitapList() {
        return null;
    }
}
