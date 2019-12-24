package it214145.hua.gr;

import it214145.hua.gr.Controller.Menu;



public class it214145 {

    public static void main(String[] args) {

        Menu menu = new Menu();

        System.out.println("Please chose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Make a reservation");
        System.out.println("2 - Change your reservation");
        System.out.println("3 - See your reservation");
        System.out.println("4 - Exit");


        menu.Main_Menu();


    }
}
