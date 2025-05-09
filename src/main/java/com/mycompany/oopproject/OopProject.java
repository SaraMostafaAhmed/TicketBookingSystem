/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopproject;
import java.util.Scanner;
public class OopProject {
    public static void main(String[] args) {
        String oS = null,oG = null,oT = null,oMDate = null,oMTime = null;
        Scanner s = new Scanner(System.in);

        Match[] mA = new Match[6];
        Group GA = new Group();
        GA.setTeams("Netherlands", "Senegal", "Ecuador", "Qatar");
        mA[0] = new Match();
        mA[0].setMatch("Qatar", "Ecuador");
        mA[0].setDate("20/11/2022");
        mA[0].setTime("19:00");

        mA[1] = new Match();
        mA[1].setMatch("Senegal", "Netherlands");
        mA[1].setDate("21/11/2022");
        mA[1].setTime("19:00");

        mA[2] = new Match();
        mA[2].setMatch("Qatar", "Senegal");
        mA[2].setDate("25/11/2022");
        mA[2].setTime("16:00");

        mA[3] = new Match();
        mA[3].setMatch("Netherlands", "Ecuador");
        mA[3].setDate("25/11/2022");
        mA[3].setTime("19:00");

        mA[4] = new Match();
        mA[4].setMatch("Ecuador", "Senegal");
        mA[4].setDate("29/11/2022");
        mA[4].setTime("18:00");

        mA[5] = new Match();
        mA[5].setMatch("Netherlands", "Qatar");
        mA[5].setDate("29/11/2022");
        mA[5].setTime("18:00");
        GA.setMatch(mA);
        GA.setStaduim("Al thumama Stadiuam");
        GA.setCity("Doha");

        Match[] mB = new Match[6];
        Group GB = new Group();
        GB.setTeams("England", "United States", "Iran", "Wales");
        mB[0] = new Match();
        mB[0].setMatch("England", "Iran");
        mB[0].setDate("21/11/2022");
        mB[0].setTime("16:00");

        mB[1] = new Match();
        mB[1].setMatch("United States", "Wales");
        mB[1].setDate("21/11/2022");
        mB[1].setTime("22:00");

        mB[2] = new Match();
        mB[2].setMatch("Wales", "Iran");
        mB[2].setDate("25/11/2022");
        mB[2].setTime("13:00");

        mB[3] = new Match();
        mB[3].setMatch("England", "United States");
        mB[3].setDate("25/11/2022");
        mB[3].setTime("22:00");

        mB[4] = new Match();
        mB[4].setMatch("England", "Wales");
        mB[4].setDate("29/11/2022");
        mB[4].setTime("19:00");

        mB[5] = new Match();
        mB[5].setMatch("Iran", "United States");
        mB[5].setDate("29/11/2022");
        mB[5].setTime("22:00");
        GB.setMatch(mB);
        GB.setStaduim("Ahmed Bin Ali Stadiuam");
        GB.setCity("Al Rayyan");

        Match[] mC = new Match[6];
        Group GC = new Group();
        GC.setTeams("Argentina", "Poland", "Mexico", "Saudi Arabia");

        mC[0] = new Match();
        mC[0].setMatch("Argentina", "Saudi Arabia");
        mC[0].setDate("22/11/2022");
        mC[0].setTime("13:00");

        mC[1] = new Match();
        mC[1].setMatch("Mexico", "Poland");
        mC[1].setDate("22/11/2022");
        mC[1].setTime("19:00");

        mC[2] = new Match();
        mC[2].setMatch("Poland", "Saudi Arabia");
        mC[2].setDate("26/11/2022");
        mC[2].setTime("16:00");

        mC[3] = new Match();
        mC[3].setMatch("Argentina", "Mexico");
        mC[3].setDate("26/11/2022");
        mC[3].setTime("22:00");

        mC[4] = new Match();
        mC[4].setMatch("Poland", "Argentina");
        mC[4].setDate("30/11/2022");
        mC[4].setTime("19:00");

        mC[5] = new Match();
        mC[5].setMatch("Saudi Arabia", "Mexico");
        mC[5].setDate("30/11/2022");
        mC[5].setTime("22:00");
        GC.setMatch(mC);
        GC.setStaduim("Lusail Stadiuam");
        GC.setCity("Lusail");

        Match[] mD = new Match[6];
        Group GD = new Group();
        GD.setTeams("France", "Australia", "Tunisia", "Denmark");

        mD[0] = new Match();
        mD[0].setMatch("Denmark", "Tunisia");
        mD[0].setDate("22/11/2022");
        mD[0].setTime("16:00");

        mD[1] = new Match();
        mD[1].setMatch("France", "Australia");
        mD[1].setDate("22/11/2022");
        mD[1].setTime("22:00");

        mD[2] = new Match();
        mD[2].setMatch("Tunisia", "Australia");
        mD[2].setDate("26/11/2022");
        mD[2].setTime("13:00");

        mD[3] = new Match();
        mD[3].setMatch("France", "Denmark");
        mD[3].setDate("26/11/2022");
        mD[3].setTime("19:00");

        mD[4] = new Match();
        mD[4].setMatch("Denmark", "Australia");
        mD[4].setDate("30/11/2022");
        mD[4].setTime("18:00");

        mD[5] = new Match();
        mD[5].setMatch("Tunisia", "France");
        mD[5].setDate("30/11/2022");
        mD[5].setTime("21:00");
        GD.setMatch(mD);
        GD.setStaduim("Education City Stadiuam");
        GD.setCity("Al Ghuwayriyah");

        Match[] mE = new Match[6];
        Group GE = new Group();
        GE.setTeams("Japan", "Spain", "Germany", "Costa Rica");
        mE[0] = new Match();
        mE[0].setMatch("Germany", "Japan");
        mE[0].setDate("23/11/2022");
        mE[0].setTime("16:00");

        mE[1] = new Match();
        mE[1].setMatch("Spain", "Costa Rica");
        mE[1].setDate("23/11/2022");
        mE[1].setTime("19:00");

        mE[2] = new Match();
        mE[2].setMatch("Japan", "Costa Rica");
        mE[2].setDate("27/11/2022");
        mE[2].setTime("13:00");

        mE[3] = new Match();
        mE[3].setMatch("Spain", "Germany");
        mE[3].setDate("27/11/2022");
        mE[3].setTime("22:00");

        mE[4] = new Match();
        mE[4].setMatch("Japan", "Spain");
        mE[4].setDate("1/12/2022");
        mE[4].setTime("22:00");

        mE[5] = new Match();
        mE[5].setMatch("Costa Rica", "Germany");
        mE[5].setDate("1/12/2022");
        mE[5].setTime("19:00");
        GE.setMatch(mE);
        GE.setStaduim("Al Bayt");
        GE.setCity("Al Khor");
        
        Match[] mF = new Match[6];
        Group GF = new Group();
        GF.setTeams("Morocco", "Croatia", "Belgium", "Canada");
        mF[0] = new Match();
        mF[0].setMatch("Morocco", "Croatia");
        mF[0].setDate("23/11/2022");
        mF[0].setTime("13:00");

        mF[1] = new Match();
        mF[1].setMatch("Belgium", "Canada");
        mF[1].setDate("23/11/2022");
        mF[1].setTime("22:00");

        mF[2] = new Match();
        mF[2].setMatch("Belgium", "Morocco");
        mF[2].setDate("27/11/2022");
        mF[2].setTime("16:00");

        mF[3] = new Match();
        mF[3].setMatch("Croatia", "Canada");
        mF[3].setDate("27/11/2022");
        mF[3].setTime("19:00");

        mF[4] = new Match();
        mF[4].setMatch("Croatia", "Belgium");
        mF[4].setDate("1/12/2022");
        mF[4].setTime("18:00");

        mF[5] = new Match();
        mF[5].setMatch("Canada", "Morocco");
        mF[5].setDate("1/12/2022");
        mF[5].setTime("21:00");
        GF.setMatch(mF);
        GF.setStaduim("Kalifa International");
        GF.setCity("Mesaieed");
        
        Match[] mG = new Match[6];
        Group GG = new Group();
        GG.setTeams("Brazil", "Switzerland", "Cameroon", "serbia");
        mG[0] = new Match();
        mG[0].setMatch("Switzerland", "Cameroon");
        mG[0].setDate("24/11/2022");
        mG[0].setTime("13:00");

        mG[1] = new Match();
        mG[1].setMatch("Brazil", "Serbia");
        mG[1].setDate("24/11/2022");
        mG[1].setTime("22:00");

        mG[2] = new Match();
        mG[2].setMatch("Cameroon", "Serbia");
        mG[2].setDate("28/11/2022");
        mG[2].setTime("13:00");

        mG[3] = new Match();
        mG[3].setMatch("Brazil", "Switzerland");
        mG[3].setDate("28/11/2022");
        mG[3].setTime("19:00");

        mG[4] = new Match();
        mG[4].setMatch("Serbia", "Switzerland");
        mG[4].setDate("2/12/2022");
        mG[4].setTime("22:00");

        mG[5] = new Match();
        mG[5].setMatch("Cameroon", "Brazil");
        mG[5].setDate("2/12/2022");
        mG[5].setTime("19:00");
        GG.setMatch(mG);
        GG.setStaduim("Stadium 974");
        GG.setCity("Dukhan");
        
        Match[] mH = new Match[6];
        Group GH = new Group();
        GH.setTeams("Portugal", "South korea", "Uruguay", "Ghana");
        mH[0] = new Match();
        mH[0].setMatch("Uruguay", "South Korea");
        mH[0].setDate("24/11/2022");
        mH[0].setTime("16:00");
        
        mH[1] = new Match();
        mH[1].setMatch("Portugal", "Ghana");
        mH[1].setDate("24/11/2022");
        mH[1].setTime("19:00");

        mH[2] = new Match();
        mH[2].setMatch("South Korea", "Ghana");
        mH[2].setDate("28/11/2022");
        mH[2].setTime("16:00");

        mH[3] = new Match();
        mH[3].setMatch("Portugal", "Uruguay");
        mH[3].setDate("28/11/2022");
        mH[3].setTime("22:00");

        mH[4] = new Match();
        mH[4].setMatch("Ghana", "Uruguay");
        mH[4].setDate("2/12/2022");
        mH[4].setTime("18:00");

        mH[5] = new Match();
        mH[5].setMatch("South Korea", "Portugal");
        mH[5].setDate("2/12/2022");
        mH[5].setTime("21:00");
        GH.setMatch(mH);
        GH.setStaduim("Al Janoub");
        GH.setCity("Al Wakrah");

        //beginig of program to user
        System.out.println();
        System.out.println("Welcome to the ticket registeration system of preliminary round of the World Cup 2022 in QATAR!\n");
        System.out.println("These are the groups and their teams: \n");
        System.out.println("GROUP A: \n"+ GA.getTeams()+"\n"); 
        System.out.println("GROUP B: \n"+ GB.getTeams()+"\n");
        System.out.println("GROUP C: \n"+ GC.getTeams()+"\n");
        System.out.println("GROUP D: \n"+ GD.getTeams()+"\n");
        System.out.println("GROUP E: \n"+ GE.getTeams()+"\n");
        System.out.println("GROUP F: \n"+ GF.getTeams()+"\n");
        System.out.println("GROUP G: \n"+ GG.getTeams()+"\n");
        System.out.println("GROUP H: \n"+ GH.getTeams()+"\n");

        System.out.println("Choose the group letter to view the matches");
        char cx=s.next().charAt(0);
        char x = Character.toUpperCase(cx);
        System.out.println();
        if(x=='A'){
            oS=GA.getStaduim();
            oG="group A";
            System.out.println("The matches in group A are:\n");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mA[i].getMatch());
                System.out.println(mA[i].getDate());
                System.out.println(mA[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group A will play in "+GA.getStaduim()+", at "+GA.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mA[m-1].getMatch();
            oMDate=mA[m-1].getDate();
            oMTime=mA[m-1].getTime();
        }
        else if(x=='B'){
            oS=GB.getStaduim();
            oG="group B";
            System.out.println("The matches in group B are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mB[i].getMatch());
                System.out.println(mB[i].getDate());
                System.out.println(mB[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group B will play in "+GB.getStaduim()+", at "+GB.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mB[m-1].getMatch();
            oMDate=mB[m-1].getDate();
            oMTime=mB[m-1].getTime();
        }
        else if(x=='C'){
            oS=GC.getStaduim();
            oG="group C";
            System.out.println("The matches in group C are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mC[i].getMatch());
                System.out.println(mC[i].getDate());
                System.out.println(mC[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group C play in "+GC.getStaduim()+", at "+GC.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mC[m-1].getMatch();
            oMDate=mC[m-1].getDate();
            oMTime=mC[m-1].getTime();
        }
        else if(x=='D'){
            oS=GD.getStaduim();
            oG="group D";
            System.out.println("The matches in group D are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mD[i].getMatch());
                System.out.println(mD[i].getDate());
                System.out.println(mD[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group D play in "+GD.getStaduim()+", at "+GD.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mD[m-1].getMatch();
            oMDate=mD[m-1].getDate();
            oMTime=mD[m-1].getTime();
        }
        else if(x=='E'){
            oS=GE.getStaduim();
            oG="group E";
            System.out.println("The matches in group E are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mE[i].getMatch());
                System.out.println(mE[i].getDate());
                System.out.println(mE[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group E play in "+GE.getStaduim()+", at "+GE.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mE[m-1].getMatch();
            oMDate=mE[m-1].getDate();
            oMTime=mE[m-1].getTime();
        }
        else if(x=='F'){
            oS=GF.getStaduim();
            oG="group F";
            System.out.println("The matches in group F are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mF[i].getMatch());
                System.out.println(mF[i].getDate());
                System.out.println(mF[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group F play in "+GF.getStaduim()+", at "+GF.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mF[m-1].getMatch();
            oMDate=mF[m-1].getDate();
            oMTime=mF[m-1].getTime();
        }
        else if(x=='G'){
            oS=GG.getStaduim();
            oG="group G";
            System.out.println("The matches in group G are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mG[i].getMatch());
                System.out.println(mG[i].getDate());
                System.out.println(mG[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group G play in "+GG.getStaduim()+", at "+GG.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mG[m-1].getMatch();
            oMDate=mG[m-1].getDate();
            oMTime=mG[m-1].getTime();
        }
        else if(x=='H'){
            oS=GH.getStaduim();
            oG="group H";
            System.out.println("The matches in group H are:");
            for(int i=0;i<6;i++){
                System.out.println((i+1)+"- "+mH[i].getMatch());
                System.out.println(mH[i].getDate());
                System.out.println(mH[i].getTime());
                System.out.println();
            }
            System.out.println("All matches in group H play in "+GH.getStaduim()+", at "+GH.getCity()+" city. \n");
            System.out.println("Choose the match number");
            int m=s.nextInt();
            oT=mH[m-1].getMatch();
            oMDate=mH[m-1].getDate();
            oMTime=mH[m-1].getTime();
        }
        else{
            System.out.println("Wrong letter program will exit!");
            System.exit(0);
        }
        System.out.println("Do you want to book a ticket?");
        char cq=s.next().charAt(0);
        char q = Character.toUpperCase(cq);
        if(q!='Y'){
            System.out.println("Goodbye");
            System.exit(0);
        }
        //owner info
        Owner o1=new Owner();
        System.out.println("Enter your age");
        int age=s.nextInt();
        o1.setAge(age);
        s.nextLine();
        System.out.println("Enter your name");
        String name = s.nextLine();
        o1.setName(name); 
        System.out.println("Enter your email");
        String email = s.nextLine();
        o1.setEmail(email);
        System.out.println("Enter your phone number");
        String phone = s.nextLine();
        o1.setPhoneNumber(phone);
        System.out.println("Enter your national number");
        String ID = s.nextLine();
        o1.setNationalID(ID);
        System.out.println("Enter your address");
        String address = s.nextLine();
        o1.setAddress(address);
        //Seat Booking System
        Staduim s1 =new Staduim();
        s1.initialize();
        System.out.println("Choose the number of the ticket category: ");
        System.out.println("Category 1: Highest priced and located in prime areas within the stadium,its price=100$");
        System.out.println("Category 2: Located outside of the Category 1 area,its price=70$");
        System.out.println("Category 3: Most affordable category, and located outside of the Category 1 and 2 areas,its price=50$");
        int y=s.nextInt();
        if(y==1){
            System.out.println("Category 1 has area A \nPlease press A to book a seat");  
        }
        else if(y==2){
            System.out.println("Category 2 has areas B1, B2, and B3 \nPlease wirte the area name you want to book a seat");
        }
        else if(y==3){
            System.out.println("Category 3 has areas C1 and C2 \nPlease wirte the area name you want to book a seat");
        }
        s.nextLine();
        String Sarea = s.nextLine();
        String area = Sarea.toUpperCase();
        System.out.println("Currently booked chairs at area " + area + " are: " + s1.get_booked_seats(area));
        System.out.println("Enter the seat number you want to book (1-10000):");
        int seatNumber = s.nextInt();
        s1.book_seat(area, seatNumber);
        Ticket t1=new Ticket();
        t1.setPrice(area);
        System.out.println("Ticket price is "+ t1.getPrice()+"$");
        System.out.println("\nYour ticket\nName: "+o1.getName()+"       National number: "+o1.getNationalID()+"      Age: "+o1.getAge()+"\n");
        System.out.println("Staduim of the match: "+oS+"       The group: "+oG+"\n \nThe teams participating in the match: "+oT+"\n");
        System.out.println("The date of the match: "+oMDate+"       The time of the match: "+oMTime+"\n");
        System.out.println("The category of your ticket: Category "+y+"       Your seat number: "+seatNumber+"\n");    
        System.out.println("Thank you for visiting the program! Ticket bought successfully \nGoodbye!");    
        
        }

    }
