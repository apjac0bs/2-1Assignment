// Create a concrete class named InteriorFeature that implements the interface Feature with the following:


public class InteriorFeature implements Feature {

  private String interiorFeature; // Create a String named interiorFeature as an instance variable

  public InteriorFeature() {  // A public default constructor without parameters 
    setInteriorFeature("Generic"); // that sets the interiorFeature instance variable to “Generic”
  }

  public InteriorFeature(String interiorFeature) { // An overloaded constructor with the following value:
    setInteriorFeature(interiorFeature);           // A String with a parameter value of interiorFeature
  // Set the interiorFeature instance variable to the parameter interiorFeature
  }

  private void setInteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() { // A public method named getFeature with no parameters and returns an instance of String
    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) { // public method named setFeature that takes a string parameter interiorFeature
    setInteriorFeature(feature);           // and returns a void. 
  // should set the instance variable interiorFeature
  }

  @Override
  public String toString() { // A public toString method that returns the following: Interior [Generic]
    return "Interior [" + getFeature() + "]";
  }
}
