package com.toniebe.springboot2trainingtelkom2019.di;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassF {
    @Value(" ahmad Fathoni") String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
