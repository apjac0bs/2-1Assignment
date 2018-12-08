//  Create a concrete class named VehicleChassis that implements the interface Chassis with the following:

public class VehicleChassis implements Chassis {

  private String chassisName; // Create a String named chassisName instance variable

  public VehicleChassis() { // public default constructor 
    setChassisType(chassis);
  }

  public VehicleChassis(String chassisName) { // overloaded constructor with String parameter chassisName
    setChassisType(chassisName); // set chassiName instance variable 
  }

  @Override
  public Chassis getChassisType() { // public method named getChassisType with no parameters and returns instance of Chassis
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) { // public method setChassisType that takes String parameter vehicleChassis
    this.chassisName = vehicleChassis;                // returns void and sets instance variable chassisName
  }

  @Override
  public String toString() { // A public toString method that returns the following: Chassis Name : Chassis
    return "Chassis Name : " + this.chassisName;
  }
}
