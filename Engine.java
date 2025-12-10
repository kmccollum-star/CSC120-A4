/*
 * this class refuels, decreases, and prints information about the current fuel level
 */

public class Engine {

private FuelType fuelType;
private double currentFuel;
private double maxFuel;

/**
 * Constructor
 * @param fuelType
 * @param currentFuel
 * @param maxFuel
 */
public Engine(FuelType fuelType, double currentFuel, double maxFuel){
    this.fuelType = fuelType;
    this.currentFuel = currentFuel;
    this.maxFuel = maxFuel;
    }

/**
 * Refuels the engine
 */
public void refuel(){
    this.currentFuel = maxFuel;
}

/**
 * Decreases fuel level and returns if there is any fuel left
 * @return boolean
 */
public boolean go(){
    if (currentFuel >= 5.0){
        currentFuel = currentFuel - 5.0;
    //prints some useful info (e.g., remaining fuel level)
        System.out.println("Remaining fuel level: " + currentFuel);
    } else {
        System.out.println("Remaining fuel level is 0.");
    }
    //returns true if fuel level is above 0 and false if otherwise
    if(currentFuel>0){
        return true;
    } else{
        return false;
    }
}

/**
 * Returns the engine's fuel type
 * @param fuelType
 * @return fuelType
 */
FuelType getFuelType(){
    return fuelType;
}

/**
 * Returns the max fuel level
 * @param maxFuel
 * @return max fuel level
 */
double getMaxFuel(){
    return maxFuel;
}

/**
 * Returns the current fuel level
 * @return double currentFuel
 */
double getCurrentFuel(){
    return currentFuel;
}

/**
 * Tests the methods by adding an engine and running go()
 * @param args
 */
public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
    myEngine.refuel();
    System.out.println(myEngine.currentFuel);
}

}