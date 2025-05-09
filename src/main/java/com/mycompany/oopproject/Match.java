/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author User
 */
public class Match {
    private String m1,m2;
    private String date ,time;

    public Match() {
    }

    public void setMatch(String m1,String m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public String getMatch() {
        return m1+" vs "+m2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }    

}
