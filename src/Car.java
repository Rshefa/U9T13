public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric(){
        return electric;
    }
    public boolean isDiscountApplied(){
        return discountApplied;
    }

    public void printCar(){
        System.out.println("License Plate: " + getLicensePlate()+
                "\n" + "TollFee: " + getTollFee() +
                "\n" + "Passengers: " + getPassengers() +
                "\n" + "Electric? " + electric +
                "\n" + "Discount Applied: " + discountApplied);
    }

    public boolean dropOffPassengers(int numOut){
        if(numOut >= getPassengers()){
            return false;
        } else{
            int passengers = getPassengers() - numOut;
            setPassengers(passengers);
            return true;

        }
    }

}