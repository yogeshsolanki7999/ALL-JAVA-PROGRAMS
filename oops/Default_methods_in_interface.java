package com.oops;
interface camera{
    public void takingPhotos();
    public void recordingVideos();
    default void recordIn4K(){
        System.out.println("RECORDING IN 4K");
    }
}
interface wifi{
    String[] listOfNetworks();
    public void connectTO(String name);
}
class SamsungGuru{
    public void call(String number){
        System.out.println("CALLING "+ number);
    }
}
class Samsung extends SamsungGuru implements camera,wifi{
    public void takingPhotos(){
        System.out.println("TAKING PHOTOS");
    }
    public void recordingVideos(){
        System.out.println("RECORDING VIDEO");
    }
    public String[]  listOfNetworks(){
        System.out.println("GETTING NETWORK LIST");

        String []networklist={"yogesh","pari","arun"};

        return networklist;
    }
    public void connectTO(String name){
        System.out.println("CONNECTING TO.."+name);
    }



}

public class Default_methods_in_interface {

    public static void main(String[] args) {
        Samsung s=new Samsung();
        s.takingPhotos();
        s.recordingVideos();
       String[]list= s.listOfNetworks();
        for (String i:list
             ) {
            System.out.println(i);

        }
        s.connectTO("pari");

    }
}
