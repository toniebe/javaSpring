package com.toniebe.springboot2trainingtelkom2019.di;


import org.springframework.stereotype.Component;

@Component
public class ClassD {

    public ClassD(ClassE e, ClassF f) {
        this.e = e;
        this.f = f;
    }

    private ClassE e;
    private ClassF f;

    public ClassE getE() {
        return e;
    }

    public void setE(ClassE e) {
        this.e = e;
    }

    public ClassF getF() {
        return f;
    }

    public void setF(ClassF f) {
        this.f = f;
    }
}
