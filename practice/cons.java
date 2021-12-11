package com.practice;

public class cons {
    private String color;
    private String bodyMetal;
    private int modelYear;
    private int plateNo;
    private String name;


    /*public void setName(String name){
        this.name=name;

    }
    public void setColor(String color){
        this.color=color;
    }
    public void setBodyMetal(String metal){
        this.bodyMetal=metal;
    }
    public void setModelYear(int year){
        this.modelYear=year;
    }
    public void setPlateNo(int plateNo){
        this.plateNo=plateNo;
    }*/
public cons(){
    this.name="wagonR";
    this.color="white";
    this.bodyMetal="putonium";
    this.modelYear=2018;
    this.plateNo=745;
}
public cons(String name,String color,String bodyMetal,int modelYear,int plateNo){
    this.name=name;
    this.color=color;
    this.bodyMetal=bodyMetal;
    this.modelYear=modelYear;
    this.plateNo=plateNo;
}
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public  String getBodyMetal(){
        return bodyMetal;
    }
    public int getModelYear(){
        return modelYear;
    }
    public int getPlateNo(){
        return plateNo;
    }

}
