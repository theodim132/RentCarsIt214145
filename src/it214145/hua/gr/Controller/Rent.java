package it214145.hua.gr.Controller;

import it214145.hua.gr.Entity.Booking;
import it214145.hua.gr.Entity.Car;
import it214145.hua.gr.Entity.Moto;

import java.util.*;

public class Rent {

    //    private  HashMap<String,Car> cars = new HashMap<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Moto> motos = new ArrayList<>();
    private ArrayList<Booking> book = new ArrayList<>();

    private static Scanner scanner;
    private String compare= "car";

    public void  createTransport(String Transport) {


        if (Transport.equalsIgnoreCase("car")) {

            Car car1 = new Car("Bmw", "Petrol", 156, 17, 1499, 3.5, 5, 4, 5);
            Car car2 = new Car("Opel", "Petrol", 89, 15, 1125, 2.6, 2, 2, 3);
            Car car3 = new Car("Ford", "Petrol", 200, 18, 2600, 4.7, 7, 4, 8);

            cars.add(car1);
            cars.add(car2);
            cars.add(car3);

            for (Car car : cars) {
                System.out.println(car.toString());
            }

        }else if(Transport.equalsIgnoreCase("moto")){
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

    }


    public void ShowTransport() {

        System.out.println("Select The Type of Transportation    Car/Moto" );

        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Here ");

        String Transp_Type = scanner.nextLine();  // Read user input


        if(Transp_Type.equalsIgnoreCase("Car") || Transp_Type.equalsIgnoreCase("Moto") ) {
            createTransport(Transp_Type);
        }
    }




    public void SelectTransport(){

        System.out.println("Select The Model You Want To Rent" );
        scanner = new Scanner(System.in);

        String name = scanner.nextLine();  // Read user input

        cars.contains(name);

       //search arraylist to match the given user input


    }
}
