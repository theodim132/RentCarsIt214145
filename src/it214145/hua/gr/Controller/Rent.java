package it214145.hua.gr.Controller;

import it214145.hua.gr.Entity.*;

import java.sql.Time;
import java.util.*;

public class Rent {

    //    private  HashMap<String,Car> cars = new HashMap<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Moto> motos = new ArrayList<>();
    private ArrayList<Booking> book = new ArrayList<>();
    private ArrayList<Store> stores = new ArrayList<>();
    private Booking booking = new Booking();

    private static Scanner scanner;
    private String compare= "car";

    public void createStores(){

        Address address1 = new Address("Antheon",32,23456);
        Address address2 = new Address("Sokratous",58,13426);
        Address address3 = new Address("Papadiamantopoulou",20,23872);

        Store store1 = new Store(1,address1,Store.Type.STORE);
        Store store2 = new Store(2,address2,Store.Type.STORE);
        Store store3 = new Store(3,address3, Store.Type.DELIVERY_POINT);

        stores.add(store1);
        stores.add(store2);
        stores.add(store3);

        for (Store store : stores) {
            System.out.println(store.toString());
        }
    }

    public void createCar() {

        Car car1 = new Car(0,"Bmw", "Petrol", 156, 17, 1499, 3.5, 5, 4, 5);
        Car car2 = new Car(1,"Opel", "Petrol", 89, 15, 1125, 2.6, 2, 2, 3);
        Car car3 = new Car(2,"Ford", "Petrol", 200, 18, 2600, 4.7, 7, 4, 8);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }



    public void createMoto(){

        Moto moto1 = new Moto("Bmw","Petrol",105,15,998,3.1);
        Moto moto2 = new Moto("Yamaha","Electric",147,15,982,2.4);
        Moto moto3 = new Moto("Kawasaki","Petrol",55,14,115,1.4);

        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);

        for (Moto moto : motos) {
            System.out.println(moto.toString());
        }
    }


    public void ShowTransport() {

        System.out.println("Select The Type of Transportation  Car/Moto");

        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Here ");


        String Transp_Type = scanner.nextLine();  // Read user input


        if (Transp_Type.equalsIgnoreCase("Car")) {
            createCar();
        } else if (Transp_Type.equalsIgnoreCase("Moto")) {
            createMoto();
        }
    }



    public void SelectCar(){

        System.out.println("Select the number of the car you want to rent");
        scanner = new Scanner(System.in);



        int number = scanner.nextInt();  // Read user input
        //System.out.println(cars.get(number));
        System.out.println("Type your age");
        int age = scanner.nextInt();


      //  System.out.println("Select date");
//        String date = scanner.nextLine();
//        System.out.println("Select time");
//        Time time = Time.valueOf(scanner.nextLine());


        System.out.println("Select the store number");
        createStores();
        int store_no = scanner.nextInt() - 1 ;

        booking.setStore(stores.get(store_no));
        booking.setAge(age);
        booking.setCar(cars.get(number));


        book.add(booking);

        System.out.println(book);


    }
}
