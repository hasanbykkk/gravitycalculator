# GravityCalculator

DESCRIPTION 

In this assignment, you will create a program that computes the distance an object will fall in Earth's gravity. 

Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in meters

The formula in Math notation is: x(t) = 0.5 × at 2 + vit + xi Variable Meaning Value a Acceleration (m/s 2 ) -9.81 t Time (s) 10 vi Initial velocity (m/s) 0 xi Initial position 0

Original Code

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}


**Output of this code**
![image](https://user-images.githubusercontent.com/99807200/154579337-a87de9e4-4468-4683-857f-6920df8bbd70.png)




Modified Code

public class GravityCalculator {

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double x;

        x = (0.5 * gravity*(fallingTime*fallingTime)
                + (initialVelocity * fallingTime) + (initialPosition));

        System.out.println("The object's position after " + fallingTime + " seconds is " + x + " m.");
    }
}


**Output of this code**
![image](https://user-images.githubusercontent.com/99807200/154579439-6508da8b-4c0c-4290-9b7f-e50e959c2060.png)

