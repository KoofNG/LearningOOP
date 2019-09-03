
package interFaces;

interface JInterfaces {
    final int a = 10;
    void display();
}
//  Interface for a bicycle
interface Vehicle {
    void changeGear(int a);
    void speedUp(int b);
    void applyBrakes(int c);
}

public class JInterface implements Vehicle{
    int gear;
    int speed;

//  @Override
    public void changeGear(int a) {
        this.gear = a;
    }

//  @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

//  @Override
    public void applyBrakes(int appliedForce) {
        this.speed = this.speed - appliedForce;
    }

    public void printStates() {
        System.out.println("This is the following data "+ this.gear + " with " + this.speed + " speed");
    }
}



//class JInterface implements JInterfaces{
//    public void display() {
//        System.out.println("Hello World");
//    }
//    public static void main(String[] args) {
//        JInterface newIn = new JInterface();
//        newIn.display();
//        System.out.println(a);
//    }
//}