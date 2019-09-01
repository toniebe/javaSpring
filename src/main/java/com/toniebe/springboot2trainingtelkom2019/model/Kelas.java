package com.toniebe.springboot2trainingtelkom2019.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kelas")
public class Kelas {


    public Kelas(Integer id, String kelas, String matkul) {
        this.id = id;
        this.kelas = kelas;
        this.matkul = matkul;
    }

    public Kelas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String kelas;
    private String matkul;

}
