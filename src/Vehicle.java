import java.util.*;

// Create a concrete class named Vehicle that implements the Engine and Chassis interfaces with the following:

public class Vehicle implements Engine, Chassis{

  // create the following private instance variables
  Date vehicleManufacturedDate; 
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  public Vehicle(){ // a public default constructor with no parameters and initialize all instance variables
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleType = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("Generic");
    this.vehicleEngine.setDriveTrain("Generic");
  }

  public Vehicle( // a public overloaded constructor with values for all variables
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine engine) {

    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = engine;

  }
  // public method implementations for Engine and Chassis interfaces
  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  public String toString() { // A public toString method that returns the following:
    return "Manufacturer Name : " + this.vehicleManufacturer + "\n" // Manufacturer Name : Generic
        + "Manufactured Date : " + this.vehicleManufacturedDate.toString() + "\n" // Manufactured Date :
        + "Vehicle Make : " + this.vehicleMake + "\n" // Vehicle Make : Generic
        + "Vehicle Model : " + this.vehicleModel + "\n" // Vehicle Model : Generic
        + "Vehicle Type : " + this.vehicleType + "\n" // Vehicle Type : None
        + vehicleEngine.toString();
  }
}
