package it214145.hua.gr.Entity;



public class Car {

    private int  number;
    private String Name;
    private  String FuelType;
    private  int  TyreSize;
    private  int Hp;
    private  int CC;
    private  double CostPerHour;
    private  int SeatNumber;
    private  int DoorNumber;
    private  int PortPackage;


    public Car() {
    }



    public Car(int number,String Name,String FuelType,int Hp,int TyreSiZe,int CC ,double CostPerHour ,int SeatNumber, int DoorNumber,int PortPackage) {
        this.number = number;
        this.Name = Name;
        this.FuelType = FuelType;
        this.Hp = Hp;
        this.TyreSize = TyreSiZe;
        this.CC = CC;
        this.CostPerHour=CostPerHour;
        this.SeatNumber = SeatNumber;
        this.DoorNumber = DoorNumber;
        this.PortPackage = PortPackage;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getHp() {
        return Hp;
    }

    public int getTyreSize(){
        return TyreSize;
    }

    public int getCC() {
        return CC;
    }

    public double getCostPerHour() {
        return CostPerHour;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public int getDoorNumber() {
        return DoorNumber;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public void setTyreSize(int tyreSize) {
        TyreSize = tyreSize;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public void setCostPerHour(double costPerHour) {
        CostPerHour = costPerHour;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public void setDoorNumber(int doorNumber) {
        DoorNumber = doorNumber;
    }

    public int getPortPackage() {
        return PortPackage;
    }

    public void setPortPackage(int portPackage) {
        PortPackage = portPackage;
    }



    @Override
    public String toString() {
        return  number + " Name = " + Name + ", FuelType = " + FuelType + ", Hp = " + Hp + ", TyreSiZe = " + TyreSize ;
    }


}
