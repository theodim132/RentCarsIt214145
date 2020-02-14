package it214145.hua.gr.Controller;


import java.util.Scanner;

public class Menu {

    private Rent rent = new Rent();
    private Scanner scanner;
    private int booking_id;
    private int choice;

    public void Main_Menu() {

        rent.createCar();
        rent.createMoto();
        rent.createStores();


        boolean breakpoint = true;


        while (breakpoint) {

            System.out.println("Please choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Make a reservation");
            System.out.println("2 - Change your reservation");
            System.out.println("3 - See your reservation");
            System.out.println("4 - Exit\n");


            scanner = new Scanner(System.in);
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please type something from the given choices \n");
            }

            switch (choice) {
                case 1:
                    try {
                        String transp = rent.ShowTransport();
                        if (transp.equalsIgnoreCase("Car") || transp.equalsIgnoreCase("Moto")) {
                            rent.SelectTransport(transp);
                        }

                    } catch (Exception e) {
                        System.out.println("Something went wrong \n");
                    }
                    break;
                case 2:
                    System.out.println("Please type your booking ID ");
                    try {
                        //the user enters the booking id in order to edit the reservation
                        int bookin_id = scanner.nextInt();
                        rent.editReservation(bookin_id);
                    } catch (Exception e) {
                        System.out.println("Something went wrong \n");
                    }
                    break;
                case 3:
                    System.out.println("Please type your booking ID if you have one \n");

                    try {
                        int booking_id = scanner.nextInt();
                        rent.showReservation(booking_id);
                    } catch (Exception e) {
                        System.out.println("Something went wrong \n");
                    }
                    break;
                case 4:
                    // Perform "quit" case.
                    breakpoint = false;
                    break;
                default:
                    // The user input an unexpected choice.
            }

        }

    }


}
