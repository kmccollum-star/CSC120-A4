public class Engine {

FuelType fuelType;//private or public?
private double currentFuel;
private double maxFuel;

public Engine(FuelType fuelType, double currentFuel, double maxFuel){
    this.fuelType = fuelType;
    this.currentFuel = currentFuel;
    this.maxFuel = maxFuel;
    }

public void refuel(){
    this.currentFuel = maxFuel;
    //resets current fuel level to max fuel level
}

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

FuelType getFuelType(FuelType fuelType){
    return fuelType;
}

double getMaxFuel(double maxFuel){
    return maxFuel;
    //returns max fuel level
}

double getCurrentFuel(){
    return currentFuel;
    //returns current fuel level
}

public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}

}