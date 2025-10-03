import java.util.ArrayList;

public class Train {

    ArrayList<Car> cars;
    Engine engine;
    
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

    public Engine getEngine(){
        return engine;
    }

    public Car getCar(int i){
        return cars.get(i);
    }

    public int getMaxCapacity(){
        int maxCapacity = 0; 
        for (int k = 0; k<cars.size(); k++){
            maxCapacity = cars.get(k).getCapacity() + maxCapacity;
        }
       return maxCapacity;
    }

    public int seatsRemaining(){
        int seats = 0;
        for(int q = 0; q < cars.size(); q++){
            seats = getMaxCapacity() - cars.get(q).getCapacity() + seats;
        }
        return seats;
    }

    public void printManifest(){
        for(int j = 0; j < cars.size(); j++){
            cars.get(j).printManifest();
        }
    }

    public static void main(String[] args) {
        Train train = new Train(FuelType.ELECTRIC, 10.0, 150.0, 1, 1);
        Passenger k = new Passenger("k");
        train.getCar(0).addPassenger(k);
        train.printManifest();
    }
}
