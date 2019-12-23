package it214145.hua.gr;

import it214145.hua.gr.Controller.Rent;
import it214145.hua.gr.Entity.Car;

import java.util.ArrayList;
import java.util.Scanner;


public class it214145 {



    private static Scanner Tr_Type;
    private String compare= "car";
    private ArrayList<Car> cars = new ArrayList<>();




    public static void main(String[] args) {
        Rent rent = new Rent();

        rent.ShowTransport();
        rent.SelectTransport();

    }
}
