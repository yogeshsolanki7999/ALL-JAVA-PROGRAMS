package com.Apna_collage;
class  Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    Student( String naam,int umar){
        this.name=naam;
        this.age=umar;
    }
    Student(){

    }
    Student( Student stc2){
        this.name=stc2.name;
        this.age= stc2.age;
    }
}

public class A2_StudentClass {
    public static void main(String [] args){
//        Student st=new Student();
//        st.name="yogesh solanki";
//        st.age=23;
//
// Student st2=new Student();
//        st2.name="shikha solanki";
//        st2.age=20;
//
//        st.printInfo();
//        st2.printInfo();
//
//        Student st3=new Student("yogesh",25);
//        st3.printInfo();
//        st3.age=55;
//        st3.name="saasas";
//        st3.printInfo();


        Student stc=new Student();
        stc.name="pari po";
        stc.age=17;

        Student stc2=new Student(stc);
stc2.printInfo();


    }
}
