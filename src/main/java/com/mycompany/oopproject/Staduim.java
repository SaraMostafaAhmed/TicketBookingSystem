/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class Staduim {
    private String area;
    private int[][] stadiumAreas = new int[6][];
    private Map<String, Integer> dictionary = new HashMap<>();

    public void initialize(){
        //Initializing the stadium areas, which holds 6 distinct areas, each of size 10k.
        for(int i=0;i<6;i++){
            stadiumAreas[i] = new int[10000];
        }
        //Initialize the mapping to access the stadium area
        dictionary.put("A", 0);
        dictionary.put("B1", 1);
        dictionary.put("B2", 2);
        dictionary.put("B3", 3);
        dictionary.put("C1", 4);
        dictionary.put("C2", 5);
    }

    public void book_seat(String area, int seat_number){
        
        if(stadiumAreas[dictionary.get(area)][seat_number-1] == 1){
            System.out.println("This chair is already picked, please pick another one");
        }
        else{
            stadiumAreas[dictionary.get(area)][seat_number-1] =1;
            System.out.println("Chair picked at area " + area + " seat number: " +  (seat_number));
            System.out.println("Currently booked chairs at area " + area + " are: " + get_booked_seats(area));
            
        }
    }
    public List<Integer> get_booked_seats(String area){
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < (stadiumAreas[dictionary.get(area)]).length; i++){
            if((stadiumAreas[dictionary.get(area)])[i] == 1){
                indexes.add(i+1);
            }
        }
        return indexes;
    }  
    public String getArea() {
        return area;
    }  
}
