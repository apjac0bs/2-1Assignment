/**
 *
 */

//  Create an interface named Chassis.  Add the following to the interface:
//    A public constant string named chassis with a value of “Chassis”.
//    The definition of a public getChassisType method that returns an instance of Chassis.
//    The definition of a public setChassisType that accepts a string named vehicleChassis and returns a void.

public interface Chassis {

  public final String chassis = "Chassis";

  public Chassis getChassisType();

  public void setChassisType(String vehicleChassis);
}
