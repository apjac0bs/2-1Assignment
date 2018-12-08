import java.util.*;

public final class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();

    Feature[] feature = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = feature;
    this.carAxle = 2;

  }


  public Car(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake
        , vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {
    String exlist = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (exlist.length() == 0) {
          exlist += this.feature[i];
        } else {
          exlist += "\n" + this.feature[i];
        }
      }
    }
    return exlist;
  }


  public String getInteriorFeatures() {
    String inlist = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (inlist.length() == 0) {
          inlist += this.feature[i];
        } else {
          inlist += "\n" + this.feature[i];
        }
      }
    }
    return inlist;
  }

  public String toString() {
    return super.toString() + "\n" + "Features : " + "\n"
        + getInteriorFeatures() + "\n"
        + getExteriorFeatures() + "\n"
        + "Car Axle : " + carAxle;
  }
}
