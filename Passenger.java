public class Passenger implements PassengerRequirements{
    /*Class attributes */
    private String name;

    /**
     * Constructor
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Prints information as a string
     * @return the name as a string
     */
    public String toString() {
        return this.name;
    }

    /**
     * Adds passenger to car c
     * @param c
     */
    public void boardCar(Car c) {
        if(c.addPassenger(this) == false){
            System.out.println("Error: Passenger has already boarded.");
        } else {
            System.out.println("Passenger has board the car successfully.");
        }
            
    }

    /**
     * Removes passenger from car c
     * @param c
     */
    public void getOffCar(Car c) {
        if(c.removePassenger(this) == false){
            System.out.println("Error: Passenger is not onboard.");
        } else {
            System.out.println("Passenger has successfully left the car.");
        }
    }

    /**
     * Main method for testing
     * @param args
     */
    public static void main(String[] args) {
        Passenger a = new Passenger("a");
        Car c = new Car(200);
        a.boardCar(c);
        a.boardCar(c);
        a.getOffCar(c);
        a.getOffCar(c);

    }

}
