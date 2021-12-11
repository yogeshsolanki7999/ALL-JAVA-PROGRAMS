package com.practice;
class animal{
    private String name;
    public String color;
    public String typeOfSpecies;
    public int ofLegs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfSpecies() {
        return typeOfSpecies;
    }

    public void setTypeOfSpecies(String typeOfSpecies) {
        this.typeOfSpecies = typeOfSpecies;
    }

    public int getOfLegs() {
        return ofLegs;
    }

    public void setOfLegs(int ofLegs) {
        this.ofLegs = ofLegs;
    }
}
class dog extends animal{
    private String breed;
    private String speech;
    private String petName;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}

public class inheritance_practice {
    public static void main(String[] args) {
        dog d=new dog();

    d.setName("dog");
    d.setColor("black");
    d.setOfLegs(4);
    d.setTypeOfSpecies("petanimal");
    d.setBreed("german shepherd");
    d.setSpeech("bark");
    d.setPetName("tommy");
    //PRINTING THE VALUES OF BOTH CLASS PARENT AS WELL US CHILD USING THE OBJECT OF DOG CLASS
        System.out.println(d.getName());
        System.out.println(d.getColor());
        System.out.println(d.getOfLegs());
        System.out.println(d.getTypeOfSpecies());
        System.out.println(d.getBreed());
        System.out.println(d.getSpeech());
        System.out.println(d.getPetName());
    }
}
