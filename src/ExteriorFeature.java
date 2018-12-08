// Create a concrete class named ExteriorFeature that implements the interface Feature with the following:

public class ExteriorFeature implements Feature{

  private String exteriorFeature; // create a string named ExteriorFeature as an instance variable

  public ExteriorFeature() { // public default constructor that sets the exterior feature instance variable
    setFeature("Generic");
  }

  public ExteriorFeature(String exteriorFeature) { // overloaded constructor with String with parameter value: exteriorFeature
    setFeature(exteriorFeature);                   // set the exteriorFeature and use features as String values
  }

  @Override
  public String getFeature() { // public method named getFeature with no parameters and returns instance of String.
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) { // public method named setFeature that takes a String parameter named exteriorFeature
    this.exteriorFeature = feature;        // returns a void and sets instance variable exteriorFeature
  }

  @Override
  public String toString() { // A public toString method that returns the following: Exterior [Generic]
    return "Exterior [" + getFeature() + "]";
  }
}
