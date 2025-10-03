import java.util.ArrayList;

public class Car {

public int maxCapacity;
public ArrayList<Passenger> passengers;
private int capacity;
public int seatsRemaining;
public boolean addPassenger; 

public Car(int max){
    this.maxCapacity = max;
    passengers = new ArrayList<Passenger>();
}

public int getCapacity(){
    return capacity;
}

public int seatsRemaining(){
    seatsRemaining = maxCapacity - capacity;
    return seatsRemaining;
}

public boolean addPassenger(Passenger P){
//add passenger to arraylist and add 1 to capacity
    if(capacity < maxCapacity){
        passengers.add(P);
        capacity -= 1;
        return true;
    } else{
    System.out.println("The train is full");
    return false;
}
}

public boolean removePassenger(Passenger P){
//remove passenger from arraylist and remove 1 from capacity
    for (int n = 0; n < passengers.size(); n++){
        if(P == passengers.get(n)){
            passengers.remove(P);
            capacity += 1;
            return true;
        }
    }
    System.out.println("This passenger is not onboard.");
    return false;
}

public void printManifest(){
    for (int j = 0; j < passengers.size(); j++){
        System.out.println(passengers.get(j));
    }
    if (passengers.size()==0){
        System.out.println("There are no passengers in this car.");
    }
}

public static void main(String[] args) {
    Passenger b = new Passenger("b");
    Car c = new Car(10);
    c.addPassenger(b);
}
}