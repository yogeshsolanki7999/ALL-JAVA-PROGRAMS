package com.practice;

public class user {
    private int userID;
    private String userName;
    private String firstName;
    private  String lastName;



public void setUserID(int  userId){
    this.userID=userId;
}
public void setUserName(String username){
    this.userName=username;
}
public void setFirstName(String fname){
    this.firstName=fname;
}
public void setLastnameName(String lname){
    this.lastName=lname;
}

public int getUserID(){
    return userID;
}
public String  getUserName(){
    return userName;

}
public String getFirstName(){
    return  firstName;
}
public String getLastName(){
    return lastName;
}
}