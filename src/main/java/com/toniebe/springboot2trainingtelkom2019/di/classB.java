package com.toniebe.springboot2trainingtelkom2019.di;


import org.springframework.stereotype.Component;

@Component
public class classB {

    public classB(ClassC c) {
        this.c = c;
    }

    private ClassC c;

    public ClassC getC() {
        return c;
    }

    public void setC(ClassC c) {
        this.c = c;
    }
}
