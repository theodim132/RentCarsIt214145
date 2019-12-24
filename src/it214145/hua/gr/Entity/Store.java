package it214145.hua.gr.Entity;


public class Store {
    public enum  Type {
        STORE ,
        DELIVERY_POINT
    }


    private int ID;
    private Address address;
    private Type type;

    public Store(){}

    public Store(int ID,Address address,Type type){
        this.ID = ID;
        this.type= type;
        this.address = address;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    @Override
    public String toString() {
        return  ID  + " Address = " + address + ", Type = " + type ;
    }
}
