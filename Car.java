import java.util.ArrayList;

public class Car {

/*Class attributes */
public int maxCapacity;
private ArrayList<Passenger> passengers;
private int capacity;
public int seatsRemaining;
public boolean addPassenger; 
/**
 * Constructor
 * @param max
 */
public Car(int max){
    this.maxCapacity = max;
    passengers = new ArrayList<Passenger>();
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
public boolean addPassenger(Passenger P){
//add passenger to arraylist and add 1 to capacity
    if(capacity < maxCapacity){
        if (passengers.contains(P)){
            System.out.println("Passenger already boarded the car.");
            return false;
        }else{
            passengers.add(P);
            capacity += 1;
            System.out.println("Passenger has boarded car.");
            return true;
    }} else{
        System.out.println("The train is full");
        return false;
        }
}

/**
 * Removes a passenger from the arraylist and removes one from the capacity
 * @param P
 * @return boolean
 */
public boolean removePassenger(Passenger P){
//remove passenger from arraylist and remove 1 from capacity
    boolean removed = true;
    if(passengers.contains(P)){
        for (int n = 0; n < passengers.size(); n++){
            if(P == passengers.get(n)){
                passengers.remove(P);
                capacity -= 1;
                System.out.println("Passenger has left car.");
                removed = true;
            }
        }
    } else{
            System.out.println("This passenger is not onboard.");
            removed = false;
        }
        return removed;
}

/**
 * Prints the passengers in the car or prints that there are no passengers in the car
 */
public void printManifest(){
    for (int j = 0; j < passengers.size(); j++){
        System.out.println(passengers.get(j));
    }
    if (passengers.size()==0){
        System.out.println("There are no passengers in this car.");
    }
}

// public static void main(String[] args) {
//     Car c = new Car(5);
//     System.out.println(c.getCapacity());
// }
}