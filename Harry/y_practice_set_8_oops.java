package com.Harry;
//CLASS FOR PROBLEM 1
/*class Employeee {
    int salary;
    String name;


    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String cname) {
        this.name = cname;

        return cname;
    }
}*/

//CLASS FOR PROBLEM 2
 /*class CellPhone{
        public void ringing(){
            System.out.println("RINGING...");
        } public void vibrating(){
            System.out.println("VIBRATING...");
        }
    }*/
//CLASS FOR PROBLEM 3
/*class Square{
    int sideA;
    int sideB;
    int sideC;
    int sideD;
    public void setSides(int a){
        this.sideA=a;
        this.sideB=a;
        this.sideC=a;
        this.sideD=a;
    }


    public int area(){
        int area=sideA*sideA;

        return area;
    } public int parameter(){
        int para=4*sideA;

        return para;
    }


    }*/

//CLASS FOR PROBLEM 4
/* class rectangle{
     int sideA;
     int sideB;
     int sideC;
     int sideD;

     public void setSides(int a,int b){
         this.sideA=a;
         this.sideB=b;
         this.sideC=a;
         this.sideD=b;
     }

     public int area(){
         int area=sideA*sideD;
         return area;
     }
     public int parameter(){
         int para=2*(sideA+sideB);
         return para;
     }


}*/

//CLASS FOR PROBLEM 5
/*class Tommyvecetti{
    public void hitting(){
        System.out.println("HITTING");
    }  public void running(){
        System.out.println("RUNNING");
    }  public void firing(){
        System.out.println("FIRING");
    }
}*/

//CLASS FOR PROBLEM 6
class circle{
    int radius;
    float pie=3.14f;

    public void setRadius(int radius){
        this.radius=radius;
    }

    public float circum(){
        float circum=2*pie*radius;
        return circum;
    } public float area(){
        float area=pie*radius*radius;
        return area;
    }
}




public class y_practice_set_8_oops {
    public static void main(String[] args) {

        //PROBLEM 1 SOLUTION
      /*  Employeee yogesh = new Employeee();

        yogesh.name="YOGESH";
        yogesh.salary=10000;
        System.out.println("PRINTING THE ATTRIBUTES WITHOUT CHANGING NAME");
        System.out.println(yogesh.name);
        System.out.println(yogesh.salary);
        System.out.println("PRINTING THE ATTRIBUTES WITH CHANGING NAME");
       String str= yogesh.setName("YOGEESH SOLANKI");
        System.out.println(yogesh.salary);
        System.out.println(str);*/

        //PROBLEM 2 SOLUTION
       /* CellPhone cell=new CellPhone();
        cell.ringing();
        cell.vibrating();*/

        //PROBLEM 3 SQUARE SOLUTIONS
       /* Square obj=new Square();
        obj.setSides(6);
        int area= obj.area();
        int parameter= obj.parameter();
        System.out.println(area);
        System.out.println(parameter);*/

        //PROBLEM 4 RECTANGLE SOLUTION
        /*rectangle rec=new rectangle();
        rec.setSides(6,4);
        System.out.println(rec.area());
        System.out.println(rec.parameter());*/

        //PROBLEM 5 ROCKSTAR GAME
        /*Tommyvecetti tom=new Tommyvecetti();
        tom.firing();
        tom.running();
        tom.hitting();*/

        //PROBLEM CIRCLE
        circle cir=new circle();
        cir.setRadius(8);
        System.out.println(cir.area());
        System.out.println(cir.circum());

    }


}
