/*
 * this class refuels, decreases, and prints information about the current fuel level
 */

public class Engine {

public FuelType fuelType;
private double currentFuel;
private double maxFuel;

/*
 * this constructor sets the parameters for an engine
 * @param fuelTpe, currentFuel, and maxFuel
 */
public Engine(FuelType fuelType, double currentFuel, double maxFuel){
    this.fuelType = fuelType;
    this.currentFuel = currentFuel;
    this.maxFuel = maxFuel;
    }

/*
 * this refuels the current fuel level
 */
public void refuel(){
    this.currentFuel = maxFuel;
    //resets current fuel level to max fuel level
}

/*
 * decreases the fuel level and prints the remaing fuel level
 */
public boolean go(){
    //decreases current fuel level
    currentFuel = currentFuel - 5.0;
    //prints some useful info (e.g., remaining fuel level)
    System.out.println("Remaing fuel level: " + currentFuel);
    //returns true if fuel level is above 0 and false if otherwise
    if(currentFuel>0){
        return true;
    } else{
        return false;
    }
}

/*
 * gets fuel type
 */
FuelType getFuelType(FuelType fuelType){
    return fuelType;
}

/*
 * retuens max fuel level
 */
double getMaxFuel(double maxFuel){
    return maxFuel;
}

/*
 * returns the current fuel level
 */
double getCurrentFuel(){
    return currentFuel;
}


public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}

}