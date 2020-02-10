package it214145.hua.gr.Controller;

import it214145.hua.gr.Entity.*;


import java.util.*;

public class Rent {

    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Moto> motos = new ArrayList<>();
    private ArrayList<Booking> book = new ArrayList<>();
    private ArrayList<Store> stores = new ArrayList<>();
    private static Scanner scanner;
    private boolean check = true;
    private int number;
    private String LiD;
    private String ID;
    private int age;
    private String payment_type;
    private int store_no;
    private long card_number;

    public void createStores() {

        Address address1 = new Address("Antheon", 32, 23456);
        Address address2 = new Address("Sokratous", 58, 13426);
        Address address3 = new Address("Papadiamantopoulou", 20, 23872);

        Store store1 = new Store(1, address1, Store.Type.STORE);
        Store store2 = new Store(2, address2, Store.Type.STORE);
        Store store3 = new Store(3, address3, Store.Type.PICK_UP_POINT);

        stores.add(store1);
        stores.add(store2);
        stores.add(store3);


    }


    public void createCar() {

        Car car1 = new Car(0, "Bmw", "Petrol", 156, 17, 1499, 3.5, 5, 4, 5);
        Car car2 = new Car(1, "Opel", "Petrol", 89, 15, 1125, 2.6, 2, 2, 3);
        Car car3 = new Car(2, "Ford", "Petrol", 200, 18, 2600, 4.7, 7, 4, 8);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


    }


    public void createMoto() {

        Moto moto1 = new Moto(0, "Bmw", "Petrol", 105, 15, 998, 3.1);
        Moto moto2 = new Moto(1, "Yamaha", "Electric", 147, 15, 982, 2.4);
        Moto moto3 = new Moto(2, "Kawasaki", "Petrol", 55, 14, 115, 1.4);

        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);


    }

    public void showCars() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    public void showMotos() {
        for (Moto moto : motos) {
            System.out.println(moto.toString());
        }
    }


    public void showStores() {

        for (Store store : stores) {
            System.out.println(store.toString());
        }
    }

    public String ShowTransport() {

        System.out.println("Select The Type of Transportation  Car/Moto");

        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Here ");


        String Transp_Type = scanner.nextLine();  // Read user input


        if (Transp_Type.equalsIgnoreCase("Car")) {
            showCars();
        } else if (Transp_Type.equalsIgnoreCase("Moto")) {
            showMotos();
        }
        return Transp_Type;
    }


    public void SelectTransport(String Transp_Type) {

        //Creates new object every time the function is called to prevent duplications
        Booking booking = new Booking();

        scanner();

        Random random = new Random();

        booking.setBooking_ID(random.nextInt(200));
        booking.setID(ID);
        booking.setD_Licence(LiD);
        booking.setStore(stores.get(store_no));
        booking.setAge(age);

        if (card_number != 0) {
            booking.setPayment(Booking.Payment.CARD);
            booking.setCard_Number(card_number);
        } else {
            booking.setPayment(Booking.Payment.CASH);
        }


        if (Transp_Type.equalsIgnoreCase("Car")) {
            booking.setCar(cars.get(number));
        } else if (Transp_Type.equalsIgnoreCase("Moto")) {
            booking.setMoto(motos.get((number)));
        }

        book.add(booking);
        System.out.println(booking + "\n");


    }

    public void showReservation(int booking_id) {

        for (Booking bookings : book) {

            if (bookings.getBooking_ID() == booking_id) {
                System.out.println(bookings.toString());
                break;
            }

        }
    }

    public void editReservation(int booking_id) {

        for (Booking bookings : book) {

            //Edit a specific object from the arraylist
            if (bookings.getBooking_ID() == booking_id) {
                showStores();
                System.out.println("Select the store number");
                int store_no = scanner.nextInt() - 1;
                bookings.setStore(stores.get(store_no));
                System.out.println(bookings.toString());

                break;
            }

        }
    }


    public void scanner() {
        System.out.println("Select the number of the transportation you want to rent");
        number = scanner.nextInt();

        System.out.println("Enter your License ID");
        LiD = scanner.next();

        System.out.println("Enter your ID");
        ID = scanner.next();

        System.out.println("Enter your age");
        age = scanner.nextInt();

        System.out.println("Select payment method  Cash Or Card");
        payment_type = scanner.next();

        if (payment_type.equalsIgnoreCase("Cash")) {

        } else if (payment_type.equalsIgnoreCase("Card")) {
            System.out.println("Type your card number");
            card_number = scanner.nextLong();
        }

        showStores();

        System.out.println("Select the store number");
        store_no = scanner.nextInt() - 1;

    }
}
