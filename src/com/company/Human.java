package com.company;

public class Human {
    private String name;
    private boolean gender;
    private int age;


    //true :  male, false: female
    Human(String name, boolean gender){
        this.name = name;
        this.gender = gender;
    }

    public void say(String words){
        System.out.println(getName()+" say: "+words);
    }

    public String getName() {
        return name;
    }

    public void eat(Apple food){
        System.out.println(getName()+" eat: apple");
    }

    public void sleep(){
        System.out.println(getName()+" is sleeping");
    }
}
