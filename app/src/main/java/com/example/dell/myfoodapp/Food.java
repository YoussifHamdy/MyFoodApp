package com.example.dell.myfoodapp;

/**
 * Created by Dell on 10/4/2017.
 */

public class Food {

    private String name ;
    private String description;


    public static final Food[] foods ={

            new Food("Pizza","ay 5ara 3ala dma8ak"),
            new Food("burger","kosom yoyo"),
            new Food("Sandwich","kosom tefa"),


    };


    public Food(String name , String description){

        this.name = name;
        this.description = description;

    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }



    public String toString() {
        return name;
    }
}
