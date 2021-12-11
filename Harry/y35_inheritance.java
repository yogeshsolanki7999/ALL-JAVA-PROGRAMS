package com.Harry;
class parent{
    public  int x;

    public int getX()  {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }}
    class child extends parent {
        private int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {

            this.y = y;
        }
    }


public class y35_inheritance {
    public static void main(String[] args) {
        //PRINTING THE VALUE OF X USING NORMAL SUPER
        // CLASS NO INHERITED ONE
        parent p=new parent();
        p.setX(6);
        System.out.println("PRINTING THE VALUE OF X FROM PARENT=="+p.getX());
        //PRINTING THE VALUE OF X USING CHILD CLASS INHERITED ONE
        child c=new child();
        c.setX(6);
        c.setY(6666);
        System.out.println("PRINTING THE VALUE OF X FROM CHILD=="+c.getX());
        System.out.println("PRINTING THE VALUE OF y FROM PARENT=="+c.getY());

    }
}
