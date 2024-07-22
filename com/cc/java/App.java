package com.cc.java;

import com.cc.java.bees.Drone;
import com.cc.java.bees.HoneyBee;
import com.cc.java.bees.Queen;
import com.cc.java.bees.Worker;
import com.cc.java.birds.Bird;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        pollObj(bird);
   
    }

    // 2. Variante Polymorphie
    private static void pollObj(HoneyBee bee) {
        output(bee.doYourJob());
        output(bee.fly());
        output("------------");
    }


    private static void pollObj(Bird bird) {
        output(bird.hasFeathers());
        output(bird.fly());
        output("------------");
    }







   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

