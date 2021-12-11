package com.GAssignments;
class Students{
    public String name, rollNO,address;
    public int age,score;
    //PARAMETRIZED CONSTRUCTOR
    public Students(String name, final String rollNO,String address,int age,int score){
        this.name=name;
        this.rollNO=rollNO;
        this.address=address;
        this.age=age;
        this.score=score;
    }
    //DEFAULT CONSTRUCTOR
    public Students(){

    }
   /* public void topper(Students obj1,Students obj2,Students obj3,Students obj4){
        if (obj1.score>obj2.score && obj1.score>obj3.score && obj1.score>obj4.score){

            System.out.println(obj1.name +" IS THE TOPPER WITH SCORE "+ obj1.score);

        }
        else if(obj2.score> obj3.score && obj2.score> obj4.score){
            System.out.println(obj2.name +" IS THE TOPPER WITH SCORE "+ obj2.score);
        }
        else if (obj3.score>obj4.score){
            System.out.println(obj3.name +"IS THE TOPPER WITH SCORE"+ obj3.score);


        }
        else {
            System.out.println(obj4.name +"IS THE TOPPER WITH SCORE"+ obj4.score);

        }

    }*/
                          //or

   public void topper1(Students obj1,Students obj2,Students obj3,Students obj4){
    if (obj1.score>obj2.score) {
        if (obj1.score > obj3.score) {
            if (obj1.score > obj4.score) {
                System.out.println(obj1.name + " IS THE TOPPER WITH SCORE " + obj1.score);
            }
            else {
                System.out.println(obj4.name + " IS THE TOPPER WITH SCORE " + obj4.score);
                 }
        }
    }
    else if(obj2.score>obj3.score){
        if(obj2.score>obj4.score){
            System.out.println(obj2.name +" IS THE TOPPER WITH SCORE "+ obj2.score);

        }
        else {
            System.out.println(obj4.name +" IS THE TOPPER WITH SCORE "+ obj4.score);
        }
    }
    else if (obj3.score> obj4.score){
        System.out.println((obj3.name +" IS THE TOPPER WITH SCORE "+ obj3.score));
    }
    else {
        System.out.println((obj4.name +" IS THE TOPPER WITH SCORE "+ obj4.score));
    }
   }

    //COPY CONSTRUCTOR
     public Students(Students obj1,Students obj2){
        this.score=obj1.score;
        this.age=obj2.age;
     }



}
public class Student_class_oops1 {
    public static void main(String[] args) {
//        Students st=new Students();
//        Students st1=new Students("yogesh","cs108","780,niranjanpur,Indore",21,485);
//
//        //PRINTING THE VALUES OF DEFAULT CONSTRUCTOR
//        System.out.println(st.name);
//        System.out.println(st.address);
//        System.out.println(st.age);
//        System.out.println(st.rollNO);
//        System.out.println(st.score);
//
//        //PRINTING THE VALUES OF PARAMTRIZED CONSTRUCTOR
//        System.out.println(st1.name);
//        System.out.println(st1.address);
//        System.out.println(st1.age);
//        System.out.println(st1.rollNO);
//        System.out.println(st1.score);

        Students s1=new Students("yogesh","101","indore",25,658);
        Students s2=new Students("vivek","102","indore",25,258);
        Students s3=new Students("yash","103","indore",25,798);
        Students s4=new Students("pari","104","indore",255,321);
            Students topper=new Students();
            topper.topper1(s1,s2,s3,s4);
//
//            Students st5=new Students(s2,s4);
//        System.out.println(st5.age);
//        System.out.println(st5.score);


    }

}
