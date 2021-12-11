package com.practice;
class circle{
    float radius;
    float pi;
    float height;
    circle(){}


circle(float radius ,float h){
    this.radius=radius;
    this.height=h;

}
public float area(){
        float area=  (pi*radius*radius);
        return area;
}


}
class cylinder extends circle{

public float volume(){
    float vol=pi*radius*radius*height;
    return vol;
}



    }
    class rectangle{
    int length;
    int height;
    }
    class cuboid extends rectangle{

    }

public class Harry_practice_inheritance {
    public static void main(String[] args) {
        circle c=new circle();
    }
}
