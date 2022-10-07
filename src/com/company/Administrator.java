package com.company;

public class Administrator extends User {


    public Administrator(String jmeno, String heslo, String email, int vek) {
        super(jmeno, heslo, email, vek);
    }



    public void smazaniUzivatele(){
        System.out.println("Mazu uzivatele");
    }

    public void blokaceUzivatele(){
        System.out.println("Blokuju uzivatele");
    }

    public void vypinaniServeru(){
        System.out.println("Vypinam servery");
    }

}
