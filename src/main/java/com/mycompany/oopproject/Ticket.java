/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author User
 */
public class Ticket {
    private Owner owner;
    private Staduim seatnumber;
    private Group group;
    private Match match;
    private int price;

    public Ticket() {
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Staduim getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(Staduim seatnumber) {
        this.seatnumber = seatnumber;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
    public void setPrice(String area){
         
        if(area.equals("A")){
            price=100;
        }
        else if(area.equals("B1")||area.equals("B2")||area.equals("B3")){
            price=70;
        }
        else if(area.equals("C1")||area.equals("C2")){
            price=50;
        }
        else{
            price = 500;
        }
    }
    public int getPrice() {
        return price;
    }

}
