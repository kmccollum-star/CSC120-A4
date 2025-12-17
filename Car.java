/**
 * This class adds passengers and removes passenger from a designated car
 */

import java.util.ArrayList;

public class Car implements CarRequirements{

/*Class attributes */
public int maxCapacity;
private ArrayList<Passenger> passengerList;
private int capacity;
public int seatsRemaining;
public boolean addPassenger; 
/**
 * Constructor
 * @param max
 */
public Car(int max){
    this.maxCapacity = max;
    passengerList = new ArrayList<Passenger>();
}
/**
 * Gets the capacity value per car
 * @return int capacity
 */
public int getCapacity(){
    return maxCapacity;
}

/**
 * Calculates how many seats are remaining
 * @return int seatsRemaining
 */
public int seatsRemaining(){
    seatsRemaining = maxCapacity - capacity;
    return seatsRemaining;
}

/**
 * Adds passenger to car if they are not already on it
 * @param P
 * @return boolean
 */
public Boolean addPassenger(Passenger P){
//add passenger to arraylist and add 1 to capacity
    if(capacity < maxCapacity){
        if (passengerList.contains(P)){
            return false;
        }else{
            passengerList.add(P);
            capacity += 1;
            return true;
        }
    } else{
        System.out.println("The train is full");
        return false;
        }
}

/**
 * Removes a passenger from the arraylist and removes one from the capacity
 * @param P
 * @return boolean
 */
public Boolean removePassenger(Passenger P){
    boolean removed = true;
    if(passengerList.contains(P)){
        for (int n = 0; n < passengerList.size(); n++){
            if(P == passengerList.get(n)){
                passengerList.remove(P);
                capacity -= 1;
                removed = true;
            }
        }
    } else{
        removed = false;
    }
    
    return removed;
}

/**
 * Prints the passengers in the car or prints that there are no passengers in the car
 */
public void printManifest(){
    for (int j = 0; j < passengerList.size(); j++){
        System.out.println(passengerList.get(j));
    }

    if (passengerList.size()==0){
        System.out.println("There are no passengers in this car.");
    }
}

public static void main(String[] args) {
    Car c = new Car(5);
    System.out.println(c.getCapacity());
}
}