package it214145.hua.gr.Entity;

import it214145.hua.gr.Entity.Address;

public class Store {
    private enum type {
        STORE,
        DELIVERY_POINT
    }


    private int ID;
    private Address address;

    public Store(){}

    public Store(int ID,Address address){
        this.ID = ID;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
