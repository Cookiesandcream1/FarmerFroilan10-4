package PersonPackage.Vehicles;

import PersonPackage.FlyAble;
import PersonPackage.Produces.Crop;
import PersonPackage.Produces.CropRow;

public class CropDuster extends FarmVehicle implements FlyAble {

    public CropRow[][] fertilize(CropRow[][] cropRowss){
        return cropRowss;
    }

    @Override
    public void Flyable() {
        System.out.println("Crop Duster Flying");
    }
}
