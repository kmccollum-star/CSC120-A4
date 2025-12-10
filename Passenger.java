public class Passenger {
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
     * @return String this.name
     */
    public String toString(){
        return this.name;
    }

    /**
     * Adds passenger to car c
     * @param c
     */
    public void boardCar(Car c){
            c.addPassenger(this);
    }

    /**
     * Removes passenger from car c
     * @param c
     */
    public void getOffCar(Car c){
            c.removePassenger(this);
    }

    public static void main(String[] args) {
        Passenger a = new Passenger("a");
        Car c = new Car(200);
        a.boardCar(c);
        a.boardCar(c);
        a.getOffCar(c);
        a.getOffCar(c);

    }

}
