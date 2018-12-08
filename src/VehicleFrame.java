// Create a concrete class named VehicleFrame that implements the interface Chassis with the following:

public class VehicleFrame implements Chassis {

  private String vehicleFrameType; // Create a String named vehicleFrameType instance variable

  public VehicleFrame(){ // default public constructor
    setChassisType("Unibody"); // set vehicle frame instance using "unibody" as default
  }

  public VehicleFrame(String vehicleFrameType){ // overloaded constructor with parameter vehicleFrameType
    setVehicleFrameType(vehicleFrameType); // set vehicle frame instance 
  }

  @Override
  public Chassis getChassisType()  { // public method named getChassisType with no parameters and returns instance of Chassis
    return this;
  }

  @Override
  public void setChassisType(String vehicleFrameType) { // public method setChassisType takes String vehicleFrameType parameter
    setVehicleFrameType(vehicleFrameType);
  }

  public void setVehicleFrameType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() { // A public toString method that returns the following:
    if (this.vehicleFrameType.equals("Unibody")){
      return "Chassis : " + VehicleFrame.chassis + // Chassis : Chassis
          "\nVehicle Frame : " + this.vehicleFrameType; // Vehicle Frame : Unibody
    }
    else {
      return "Vehicle Frame : " + this.vehicleFrameType;
    }
  }
}
