package com.ease.archiecture.springannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {


    private Clazz clazz;

    public Clazz getClazz() {
        return clazz;
    }
    @Autowired
    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void clazzPrint() {
        clazz.clazzPrint();
    }
}
