package interFaces;

public class VehicleMove {
    public static void main(String[] args) {
        JInterface newJinter = new JInterface();
        newJinter.changeGear(2);
        newJinter.speedUp(3);
        newJinter.applyBrakes(1);


        System.out.println("Bicycle present state :");
        newJinter.printStates();
    }
}