/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author User
 */
public class Owner {
    private String name,address,email,phoneNumber,nationalID;
    private int age;

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAge(int age) {
        if(age<18){
            System.out.println("must be older than 18 to book a ticket \n program will exit");
            System.exit(0);
        }
        else{
            this.age = age;
        }

    }
    public int getAge() {
        return age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
    public String getNationalID() {
        return nationalID;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
