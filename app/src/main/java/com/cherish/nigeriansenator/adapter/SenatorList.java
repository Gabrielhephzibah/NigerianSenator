package com.cherish.nigeriansenator.adapter;

public class SenatorList {
    private  String first;
    private String middle;
    private  String second;
    private String email;
    private String state;
    private  String number;

    public SenatorList(String firstName, String middleName, String secondName, String gmail, String stateName, String phoneNumber){
        first = firstName;
        middle = middleName;
        second = secondName;
        email = gmail;
        state = stateName;
        number = phoneNumber;

    }


    public void setFirst(String firstName){
        first = firstName;
    }

    public  String getFirst(){
        return first;
    }

    public  void  setMiddle(String middleName){
        middle = middleName;
    }

    public  String getMiddle(){
        return middle;
    }
     public  void setSecond(String secondName){
        second = secondName;
     }

     public  String getSecond(){
        return second;
     }

     public void  setEmail(String gmail){
        email = gmail;
     }

     public String getEmail(){
        return  email;
     }

    public  void  setState(String stateName){
        state = stateName;
    }

    public  String getState(){
        return state;
    }

    public  void setNumber(String phoneNumber){
        number = phoneNumber;
    }

    public  String getNumber(){
        return number;
    }
}
