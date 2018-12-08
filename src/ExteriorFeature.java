public class ExteriorFeature implements Feature{

  private String exteriorFeature;

  public ExteriorFeature() {
    setFeature("Generic");
  }

  public ExteriorFeature(String exteriorFeature) {
    setFeature(exteriorFeature);
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  @Override
  public String toString() {
    return "Exterior [" + getFeature() + "]";
  }
}
