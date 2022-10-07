package com.company;

public class Main {

    public static void main(String[] args) {
        Administrator myAdmin = new Administrator("admin", "12345", "blablabla@sadwad.cz", 40);
        System.out.println("Admin: ");
        myAdmin.zmenaHesla();
        myAdmin.zmenaJmena();
        myAdmin.zmenaEmailu();
        myAdmin.zmenaVeku();
        myAdmin.blokaceUzivatele();
        myAdmin.smazaniUzivatele();
        myAdmin.vypinaniServeru();

        System.out.println("Uzivatel");
        User myUser = new User ("Franta", "12358", "bkaodsjaidjad@iauhdusa.cz", 19);
        myUser.zmenaHesla();
        myUser.zmenaJmena();
        myUser.zmenaEmailu();
        myUser.zmenaVeku();
        

    }


}
