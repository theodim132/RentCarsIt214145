package it214145.hua.gr.Entity;

import java.sql.Time;
import java.util.Date;

public class Booking {


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
    private long Credit_Number;
    private int Booking_ID;
    private double Cost;
    private String Payment_Type;


    public Booking(){}


    public Booking(Car car, Moto moto, Date Pick_Up_Date, Time Pick_Up_Time, String Drop_Date, Time Drop_Time, Store store, String ID, String D_Licence, int age, long Credit_Number, int Booking_ID, String Payment_Type){
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
        this.Credit_Number = Credit_Number;
        this.Booking_ID = Booking_ID;
        this.Payment_Type = Payment_Type;
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

    public long getCredit_Number() {
        return Credit_Number;
    }

    public void setCredit_Number(long credit_Number) {
        Credit_Number = credit_Number;
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

    public String getPayment_Type() {
        return Payment_Type;
    }

    public void setPayment_Type(String payment_Type) {
        Payment_Type = payment_Type;
    }


}
