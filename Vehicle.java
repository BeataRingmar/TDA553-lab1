import java.awt.*;

public class Vehicle {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name


    public Vehicle(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName){
        this.nrDoors = nrDoors; 
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName; 

    }

}
