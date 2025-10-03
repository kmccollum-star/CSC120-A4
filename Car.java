/*this class can add or remove a passenger from a car and keeps track of how many seats are left */
import java.util.ArrayList;

public class Car {

public int maxCapacity;
public ArrayList<Passenger> passengers;
private int capacity;
public int seatsRemaining;
public boolean addPassenger; 
/*
 * this constructor initializes the passengers arraylist and the max capacity
 */
public Car(int max){
    this.maxCapacity = max;
    passengers = new ArrayList<Passenger>();
}
/*
 * returns the capcity of the car
 */
public int getCapacity(){
    return capacity;
}
/*
 * calculates how many seats are left with the current capacity
 */
public int seatsRemaining(){
    seatsRemaining = maxCapacity - capacity;
    return seatsRemaining;
}

/*
 * adds designated passenger to car or returns false because the train is full
 */
public boolean addPassenger(Passenger P){
//add passenger to arraylist and add 1 to capacity
    if(capacity < maxCapacity){
        passengers.add(P);
        capacity += 1;
        return true;
    } else{
    System.out.println("The train is full");
    return false;
}
}

/*
 * removes a passenger from the arraylist and removes one from the capacity
 */
public boolean removePassenger(Passenger P){
//remove passenger from arraylist and remove 1 from capacity
    for (int n = 0; n < passengers.size(); n++){
        if(P == passengers.get(n)){
            passengers.remove(P);
            capacity -= 1;
            return true;
        }
    }
    System.out.println("This passenger is not onboard.");
    return false;
}

/*
 * prints the passengers in the car or prints that there are no passengers in the car
 */
public void printManifest(){
    for (int j = 0; j < passengers.size(); j++){
        System.out.println(passengers.get(j));
    }
    if (passengers.size()==0){
        System.out.println("There are no passengers in this car.");
    }
}
}