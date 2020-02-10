package it214145.hua.gr.Entity;


public class Moto {

    private int Number;
    private String Name;
    private String FuelType;
    private int TyreSize;
    private int Hp;
    private int CC;
    private double CostPerHour;


    public Moto() {
    }

    public Moto(int Number, String Name, String FuelType, int Hp, int TyreSize, int CC, double CostPerHour) {
        this.Number = Number;
        this.Name = Name;
        this.FuelType = FuelType;
        this.Hp = Hp;
        this.TyreSize = TyreSize;
        this.CC = CC;
        this.CostPerHour = CostPerHour;
    }


    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setCostPerHour(double costPerHour) {
        CostPerHour = costPerHour;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public int getTyreSize() {
        return TyreSize;
    }

    public void setTyreSize(int tyreSize) {
        TyreSize = tyreSize;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public double getCostPerHour() {
        return CostPerHour;
    }

    public void setCostPerHour(float costPerHour) {
        CostPerHour = costPerHour;
    }


    @Override
    public String toString() {
        return Number + " Name = " + Name + ", FuelType = " + FuelType + ", Hp = " + Hp + ", TyreSiZe = " + TyreSize + "CC = " + CC + " Cost Per Hour = " + CostPerHour + "\n";
    }

}
