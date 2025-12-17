/*
 * this class refuels, decreases, and prints information about the current fuel level
 */

public class Engine implements EngineRequirements{

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
 * @return true if fuel level is above 0 and false if otherwise
 */
public Boolean go(){
    if (currentFuel >= 5.0){
        currentFuel = currentFuel - 5.0;
        System.out.println("Remaining fuel level: " + currentFuel);
    } else {
        System.out.println("Remaining fuel level is 0.");
    }

    if(currentFuel > 0) {
        return true;
    } else{
        return false;
    }
}

/**
 * Returns the engine's fuel type
 * @param fuelType
 * @return the engine's fuel type
 */
public FuelType getFuelType(){
    return fuelType;
}

/**
 * Returns the max fuel level
 * @param maxFuel
 * @return max fuel level
 */
public double getMaxFuel(){
    return maxFuel;
}

/**
 * Returns the current fuel level
 * @return double currentFuel
 */
public double getCurrentFuel(){
    return currentFuel;
}

/**
 * Main method for testing
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