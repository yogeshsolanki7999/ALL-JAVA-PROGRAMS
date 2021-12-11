package com.Harry;
interface MyCamera{

    void takeSnap();
    void recordVideo();
    private void msgOfRecording(){
        System.out.println(" 4K RECORDING STARTED");
    }
     default void record4k(){
        msgOfRecording();
        System.out.println("RECORDING 4K VIDEO ,...");
    }
}

interface MyWiF{
    String [] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone{
    public void calling(){
        System.out.println("CALLING ...");
    }
    public void pickCall(){
        System.out.println("CONNECTING ....");
    }
}

class MYSmartPhone extends CellPhone implements MyCamera,MyWiF{
    public void takeSnap(){
        System.out.println("TAKING SNAP");
    }
    public void recordVideo(){
        System.out.println("RECORDING VIDEO");
    }
    public String [] getNetwork(){
        System.out.println("GETTING NETWORK");
        String[] networklist={"yogesh","shikha","pari"};
        return networklist;
    }
   public void connectToNetwork(String network){
       System.out.println("CONNECTING TO"+network);
   }

}

public class y_42_default_methods {
    public static void main(String[] args) {


    MYSmartPhone my=new MYSmartPhone();
    my.record4k();
//    String [] ar= my.getNetwork();
//        for (String item:ar
//             ) {
//            System.out.println(item);
//
//        }


}}
