package it214145.hua.gr.Entity;

import java.sql.Time;
import java.util.Date;

public class Booking {

    public enum Payment {
        CASH,
        CARD
    }


    private Car car;
    private Moto moto;
    private Date Pick_Up_Date;
    private Time Pick_Up_Time;
    private String Drop_Date;
    private Time Drop_Time;
    private Store store;
    private String ID;
    private String D_Licence;
    private int age;
    private long Card_Number;
    private int Booking_ID;
    private double Cost;
    private Payment payment;


    public Booking() {
    }


    public Booking(Car car, Moto moto, Date Pick_Up_Date, Time Pick_Up_Time, String Drop_Date, Time Drop_Time, Store store, String ID, String D_Licence, int age, long Card_Number, int Booking_ID, Payment payment) {
        this.car = car;
        this.moto = moto;
        this.Pick_Up_Date = Pick_Up_Date;
        this.Pick_Up_Time = Pick_Up_Time;
        this.Drop_Date = Drop_Date;
        this.Drop_Time = Drop_Time;
        this.store = store;
        this.ID = ID;
        this.D_Licence = D_Licence;
        this.age = age;
        this.Card_Number = Card_Number;
        this.Booking_ID = Booking_ID;
        this.payment = payment;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Payment getPayment() {
        return payment;
    }

    public Date getPick_Up_Date() {
        return Pick_Up_Date;
    }

    public void setPick_Up_Date(Date pick_Up_Date) {
        Pick_Up_Date = pick_Up_Date;
    }

    public Time getPick_Up_Time() {
        return Pick_Up_Time;
    }

    public void setPick_Up_Time(Time pick_Up_Time) {
        Pick_Up_Time = pick_Up_Time;
    }

    public String getDrop_Date() {
        return Drop_Date;
    }

    public void setDrop_Date(String drop_Date) {
        Drop_Date = drop_Date;
    }

    public Time getDrop_Time() {
        return Drop_Time;
    }

    public void setDrop_Time(Time drop_Time) {
        Drop_Time = drop_Time;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getD_Licence() {
        return D_Licence;
    }

    public void setD_Licence(String d_Licence) {
        D_Licence = d_Licence;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(long card_Number) {
        Card_Number = card_Number;
    }

    public int getBooking_ID() {
        return Booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        Booking_ID = booking_ID;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Booking ID = " + Booking_ID + ", License ID = " + D_Licence + ", Personal ID = " + ID + " Car = " + car + ", Store = " + store + ", Age = " + age + " Payment Type = " + payment + "\n";
    }

}
