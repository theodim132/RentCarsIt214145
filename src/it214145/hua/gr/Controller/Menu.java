package it214145.hua.gr.Controller;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Menu {


    public void Main_Menu(){
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:

            Rent rent = new Rent();

            rent.ShowTransport();


            rent.SelectCar();
            break;

        case 2:

            break;
        case 3:
            // Perform "decrypt number" case.
            break;
        case 4:
            // Perform "quit" case.
            break;
        default:
            // The user input an unexpected choice.
    }
}



}
