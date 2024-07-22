package com.cc.java.birds;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {

        return "I can fly at 21mph!";

    }

    @Override
    public String hasFeathers() {
        return "I clean my feathers! ";
        
    }




}
