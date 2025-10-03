/*
 * this class get the engine type, how many cars the train has, the max capacity,
 * how many seats are remaining and prints a transcript
 */
import java.util.ArrayList;

public class Train {

    ArrayList<Car> cars;
    Engine engine;
    
    /*
     * this constructor assigns arraylists to the cars arraylist and engine arraylists
     */
    public Train(FuelType fuelType, double currentFuelLevel, 
                double fuelCapacity, int nCars, 
                int passengerCapacity){
        cars = new  ArrayList<Car>();
        for(int m=0; m < nCars; m++){
            Car a = new Car(passengerCapacity);
            cars.add(a);
        }
        engine = new Engine(FuelType.ELECTRIC, 10.0, 150.0);
    }

    /*
     * returns the engine type
     */
    public Engine getEngine(){
        return engine;
    }

    /*
     * returns the i'th car
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /*
     * combines the max capacity of each car combined
     */
    public int getMaxCapacity(){
        int maxCapacity = 0; 
        for (int k = 0; k<cars.size(); k++){
            maxCapacity = cars.get(k).getCapacity() + maxCapacity;
        }
       return maxCapacity;
    }

    /*
     * subtracts the capacity of each car from the max capacity and returns that value
     */
    public int seatsRemaining(){
        int seats = 0;
        for(int q = 0; q < cars.size(); q++){
            seats = getMaxCapacity() - cars.get(q).getCapacity() + seats;
        }
        return seats;
    }

    /*
     * prints transcript of the passengers on all the cars combined
     */
    public void printManifest(){
        for(int j = 0; j < cars.size(); j++){
            cars.get(j).printManifest();
        }
    }
/*
 * create a train, passengers, and cars
 */
    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 10.0, 150.0, 1, 1);
        Passenger k = new Passenger("k");
        train.getCar(0).addPassenger(k);
        train.printManifest();
    }
}
