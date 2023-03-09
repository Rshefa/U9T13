public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    //constructor
    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public double getTollFee(){
        return tollFee;
    }

    public void setTollFee(double newValue){
        tollFee = newValue ;
    }


    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int newPassengers){
        passengers = newPassengers ;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }
}