package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> loginInfo = new HashMap<>();
        HashMap<String, String> adminLoginInfo = new HashMap<>();
        Scanner console = new Scanner(System.in);
        loginInfo.put("pungrotten69", "xd");
        adminLoginInfo.put("admin", "admin");
        //MÅSKE SPØRGE OM DU ER ADMIN ELLER PERSONALE, OGSÅ KAN MAN VÆLGE 1 ELLER 2 SOM ENTER TO FORSKELLIGE HASHMAPS?


        int answer = 1;
        while(answer != 0){

            System.out.println("Press 1 for admin login");
            System.out.println("Press 2 for staff login");
            System.out.println("Press 0 to exit this menu");
            answer = console.nextInt();

            switch(answer) {
//Her tager programmet adminLoginInfo hashmappet, som bliver brugt til vores admin. Hvis man kommer igennem de to forskellige, vil man komme videre til den næste metode
//som nok bliver en menu, hvor man kan access og ÆNDRER en vagtplan.
                case 1:
                    System.out.println("Please enter username:");
                    String username = console.next();
                    if (adminLoginInfo.containsKey(username)) {
                        System.out.println("Please enter password:");
                        String password = console.next();
                        if (adminLoginInfo.containsValue(password)) {
                            System.out.println("Login succesful");
                            System.out.println("HER ER DER EN METODE HVOR ADMIN ENTER EN ADMIN MENU");
                        }
                    }
                break;
//Her tager programmet loginInfo hashmappet, som bliver brugt til vores Staff. Hvis man kommer igennem de to forskellige, vil man komme videre til den næste metode
//som nok bliver en menu, hvor man kan access en vagtplan.
                case 2:
                    System.out.println("Please enter username:");
                    String staffUsername = console.next();
                    if (loginInfo.containsKey(staffUsername)) {
                        System.out.println("Please enter password:");
                        String staffPassword = console.next();
                        if (loginInfo.containsValue(staffPassword)) {
                            System.out.println("Login succesful");
                            System.out.println("HER ER DER EN METODE HVOR ADMIN ENTER EN STAFF MENU");
                        }
                    }
                break;

                default:
                    System.out.println("Wrong input");
                break;
            }
        }
    }
}

//DØD KODE:: KUNNE IKKE FÅ USERNAME/PASSWORD TIL AT TJEKKE OM DET VAR ADMIN ELLER STAFF.
/*
        if (loginInfo.containsKey(username.contains("admin"))){
            System.out.println("Please enter password");
            String password = console.next();

            if (loginInfo.containsValue(password.contains("admin"))) {
                System.out.println("Login succesful");
                System.out.println("HER ER DER EN METODE HVOR ADMIN ENTER EN ADMIN MENU");
            }
        }

        /*if (loginInfo.containsKey(username)){
            System.out.println("Please enter password");
            String password = console.next();

            if (loginInfo.containsValue(password)){
                System.out.println("login succesful");
                System.out.println("HER ER DER EN METODE HVOR PERSONALET ENTER EN PERSONALE MENU");
            }
        }*/
