package it214145.hua.gr.Entity;

public class Address {
    private String Street;
    private int No;
    private int PostCode;

    public Address() {
    }

    public Address(String Street, int No, int PostCode) {
        this.Street = Street;
        this.No = No;
        this.PostCode = PostCode;

    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public int getPostCode() {
        return PostCode;
    }

    public void setPostCode(int postCode) {
        PostCode = postCode;
    }

    @Override
    public String toString() {
        return "Street = " + Street + ", Number = " + No + ", Postal Code = " + PostCode;
    }
}
