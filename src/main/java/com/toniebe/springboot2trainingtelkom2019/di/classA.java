package com.toniebe.springboot2trainingtelkom2019.di;


import org.springframework.stereotype.Component;

@Component
public class classA {

    private classB b;

    public classA(classB b) {
        this.b = b;
    }

}
