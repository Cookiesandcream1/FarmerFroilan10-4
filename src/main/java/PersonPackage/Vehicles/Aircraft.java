package PersonPackage.Vehicles;

import PersonPackage.FlyAble;

public class Aircraft extends Vehicle implements FlyAble {


    @Override
    public void Flyable() {
        System.out.println("Aircraft is flying");
    }
}
