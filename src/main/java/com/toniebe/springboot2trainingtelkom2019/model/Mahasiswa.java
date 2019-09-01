package com.toniebe.springboot2trainingtelkom2019.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Entity
@Table(name = "mahasiswa")

public class Mahasiswa {
    public Mahasiswa(Integer id, String nama, Integer umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;

    }

    public Mahasiswa() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String nama;
    private Integer umur;

}
