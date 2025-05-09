/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author User
 */
public class Group {
    private String t1,t2,t3,t4,staduim,city;
    private Match[] match;

    public Group() {
    }

    public void setTeams(String t1,String t2,String t3,String t4) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
    }

    public String getTeams() {
      return t1+"  "+t2+"\n"+t3+"  "+t4;
      
    }
    public String getStaduim() {
        return staduim;
    }

    public void setStaduim(String staduim) {
        this.staduim = staduim;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Match[] getMatch() {
        return match;
    }

    public void setMatch(Match[] match) {
        this.match = match;
    }  
}
