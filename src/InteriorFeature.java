public class InteriorFeature implements Feature {

  private String interiorFeature;

  public InteriorFeature() {
    setInteriorFeature("Generic");
  }

  public InteriorFeature(String interiorFeature) {
    setInteriorFeature(interiorFeature);
  }

  private void setInteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {
    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    setInteriorFeature(feature);
  }

  @Override
  public String toString() {
    return "Interior [" + getFeature() + "]";
  }
}
