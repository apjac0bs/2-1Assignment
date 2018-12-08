/*
 * Create a concrete class named VehicleChassis that implements the interface Chassis with the following:
 *   Create a String named chassisName instance variable.
 *   A public default constructor and an overloaded constructor with the following value:
 *   A String with a parameter value of chassisName
 *   Set the chassisName instance variable in both, use the interface constant as the default String value.
 *   A public method named getChassisType that doesnt have a formal parameter and that returns an instance of the interface Chassis (hint that would be a copy of this class).
 *   A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It should set the instance variable chassisName.
 *   A public toString method that returns the following:
 *      Chassis Name        : Chassis
 *   Write a static main method that creates two objects, one with the default constructor and the other with the constructor with parameters.  Give sample data for the parameters.
 *
 */
public class VehicleChassis implements Chassis {

  private String chassisName;

  public VehicleChassis() {
    setChassisType(chassis);
  }

  public VehicleChassis(String chassisName) {
    setChassisType(chassisName);
  }

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  @Override
  public String toString() {
    return "Chassis Name : " + this.chassisName;
  }
}
