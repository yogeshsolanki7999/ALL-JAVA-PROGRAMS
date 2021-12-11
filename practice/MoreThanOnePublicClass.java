package com.practice;
class c1{
    public static void main(String[] args) {
        System.out.println("c1 print");
    }
}
class c2{
    public static void main(String[] args) {
        System.out.println("c2 print");
        String[] s={"d","d"};
        c1.main(s);
    }
}
public class MoreThanOnePublicClass {
    public static void main(String[] args) {
        System.out.println(" main print");
        String[] s={"d","d"};
        c2.main(s);

    }
}
