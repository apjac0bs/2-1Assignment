import java.util.*;
import sun.net.www.content.text.*;

// Create a concrete class named ManufacturedEngine that implements the interface Engine with the following:

public class ManufacturedEngine implements Engine{

  private String engineManufacturer; // created the following variables
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private String engineType;
  private int engineCylinders;
  private String driveTrain;

  public ManufacturedEngine(){ // public default constructor with no parameters
//    this.engineManufacturer = "Generic";
//    this.engineManufacturedDate = new Date();
//    this.engineMake = "Generic";
//    this.engineModel = "Generic";
//    this.engineType = "85 AKI";
//    this.engineCylinders = 0;
//    this.driveTrain = "2WD: Two-Wheel Drive";
//
    setEngineManufacturer("Generic");
    setEngineManufacturedDate(new Date());
    setEngineMake("Generic");
    setEngineModel("Generic");
    setEngineType("Generic");
    setEngineCylinders(0);
    setDriveTrain("Generic");

  }
  public ManufacturedEngine( // public overloaded constructor with values for all variables
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      String engineType,
      int engineCylinders,
      String driveTrain) {

//    this.engineManufacturer = engineManufacturer;
//    this.engineManufacturedDate = engineManufacturedDate;
//    this.engineMake = engineMake;
//    this.engineModel = engineModel;
//    this.engineType = engineType;
//    this.engineCylinders = engineCylinders;
//    this.driveTrain = driveTrain;
//
    setEngineManufacturer(engineManufacturer);
    setEngineManufacturedDate(engineManufacturedDate);
    setEngineMake(engineMake);
    setEngineModel(engineModel);
    setEngineType(engineType);
    setEngineCylinders(engineCylinders);
    setDriveTrain(driveTrain);
  }
// A public method implementations for all of the public methods found in the Engine interface.
  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  @Override
  public String toString() { // A public toString method that returns the following:
    return "Engine Manufacturer : " + engineManufacturer + "\n" // Engine Manufacturer : Generic
        + "Engine Manufactured : " + engineManufacturedDate + "\n" // Engine Manufactured :
        + "Engine Make : " + engineMake + "\n" // Engine Make : Generic
        + "Engine Model : " + engineModel + "\n" // Engine Model : Generic
        + "Engine Type : " + engineType + "\n" // Engine Type : 85 AKI
        + "Engine Cylinders : " + engineCylinders + "\n" // Engine Cylinders : 0
        + "Drive Train : " + driveTrain; // Drive Train : 2WD: Two-Wheel Drives
  }
}
