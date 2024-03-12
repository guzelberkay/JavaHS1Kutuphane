package com.berkay.entity;

import com.berkay.entity.Kitap;

import java.util.List;

public interface IUye {
    void kitapAl(Kitap kitap);

    void kitapIade(Kitap kitap);

    List<Kitap> getKitapList();
}
