import java.util.*;

// create concrete class named car 
public final class Car extends Vehicle {

  private Feature[] feature = new Feature[10]; // initialize private variables
  private int carAxle;

  public Car() { // public default constructor with no parameters
    super(); // intialize all variables with generic by using super() call

    Feature[] feature = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = feature;
    this.carAxle = 2;

  }


  public Car( // public overloaded constructor with super() method 
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
        , vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine); // instantiates all values above

    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() { // public method to return formatted string of exterior features
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


  public String getInteriorFeatures() { // public method to return formatted string of interior features
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

  public String toString() { // public toString method that returns the required values
    return super.toString() + "\n" + "Features : " + "\n"
        + getInteriorFeatures() + "\n"
        + getExteriorFeatures() + "\n"
        + "Car Axle : " + carAxle;
  }
}
