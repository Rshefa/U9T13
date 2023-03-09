public class Taxi extends Car{
    private double fareCollected;

    public Taxi( String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric );
        this.fareCollected = fareCollected;
    }

    public double getFareCollected(){
        return fareCollected;
    }


    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers()+ numRiders);
        fareCollected = numRiders * farePerRider + getFareCollected();

        if(getPassengers() >= 4 && (!isDiscountApplied())) {
            setTollFee(getTollFee() * .5);
            setDiscountApplied(true);

        }

    }
    public void printTaxi(){
            System.out.println("License Plate: " + getLicensePlate()+
                    "\n" + "TollFee: " + getTollFee() +
                    "\n" + "Passengers: " + getPassengers() +
                    "\n" + "Electric? " + isElectric()+
                    "\n" + "Discount Applied? " + isDiscountApplied());
        }


}
