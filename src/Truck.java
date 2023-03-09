public class Truck extends Vehicle {
        private int axles;
        private boolean hasTrailer;

        public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
            super(licensePlate, tollFee, passengers);
            this.axles = axles;
            this.hasTrailer = hasTrailer;
        }

        public int getAxles() {
            return axles;

        }

    public boolean validateLicensePlate(){
            if(hasTrailer){
                String licensePlate = getLicensePlate();

                String lastTwo = licensePlate.substring(licensePlate.length() -2);

                boolean valid = (axles >= 4 && lastTwo.equals("MX") || axles <= 4 && lastTwo.equals("LX"));

                    return valid;
            } else{
                return true;
            }
    }

    public void printTruck(){
        System.out.println("License Plate: " + getLicensePlate()+
                "\n" + "TollFee: " + getTollFee() +
                "\n" + "Passengers: " + getPassengers() +
                "\n" + "Axles: " + getAxles() +
                "\n" + "Has Trailer? " + hasTrailer);
    }
}


