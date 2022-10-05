package PersonPackage.Vehicles;

import PersonPackage.NoiseMaker;
import PersonPackage.RideAble;

public class Vehicle implements RideAble, NoiseMaker{
    @Override
    public void mount() {
        System.out.println("Mounting vehicle");
    }

    @Override
    public void disMount() {
        System.out.println("Dismounting Vehicle");
    }

    @Override
    public void ride() {
        System.out.println("riding vehicle");
    }
}

