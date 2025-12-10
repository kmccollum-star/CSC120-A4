/*
 * this class get the engine type, how many cars the train has, the max capacity,
 * how many seats are remaining and prints a transcript
 */
import java.util.ArrayList;

public class Train {

    /*Class attributes */
    private ArrayList<Car> cars;
    private final Engine engine;
    
    /**
     * Constructor, makes a new engine, and adds cars to arraylist
     * @param fuelType
     * @param currentFuelLevel
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double currentFuelLevel, 
                double fuelCapacity, int nCars, 
                int passengerCapacity){
        cars = new  ArrayList<Car>();
        for(int m=0; m < nCars; m++){
            Car a = new Car(passengerCapacity);
            cars.add(a);
        }
        //Train train = new Train(FuelType.ELECTRIC, 150.0, 150.0, 7, 10)
        engine = new Engine(FuelType.ELECTRIC, 10.0, 150.0);
    }

    /**
     * Returns the engine information
     * @return engine
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * Returns information about a specific car
     * @param i
     * @return car i
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /**
     * Returns the mac capacity of a specific car
     * @return int
     */
    public int getMaxCapacity(){
        int maxCapacity = 0; 
        for (int k = 0; k<cars.size(); k++){
            maxCapacity = cars.get(k).getCapacity() + maxCapacity;
        }
       return maxCapacity;
    }

    /**
     * Subtracts the capacity of each car from the max capacity and returns that value
     * @return int
     */
    public int seatsRemaining(){
        int seats = 0;
        if(cars.size() == 0){
            return 0;
        } else{
        for(int q = 0; q < cars.size(); q++){
            seats += cars.get(q).seatsRemaining(); // + getMaxCapacity();
            }
        }
        return seats;
    }

    /**
     * Prints transcript of the passengers on all the cars combined
     */
    public void printManifest(){
        for(int j = 0; j < cars.size(); j++){
            cars.get(j).printManifest();
        }
    }

    /**
     * Tests methods
     * @param args
     */
    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 10.0, 150.0, 1, 6);
        Passenger k = new Passenger("k");
        
        Car c = new Car(2);
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(c);
        
        train.getCar(0).addPassenger(k);
        System.out.println(train.getEngine().getMaxFuel());
        System.out.println(train.seatsRemaining());
        System.out.println(train.getMaxCapacity());
    }
}
