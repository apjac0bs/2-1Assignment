public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  public VehicleFrame(){
    setChassisType("Unibody");
  }

  public VehicleFrame(String vehicleFrameType){
    setVehicleFrameType(vehicleFrameType);
  }

  @Override
  public Chassis getChassisType()  {
    return this;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    setVehicleFrameType(vehicleFrameType);
  }

  public void setVehicleFrameType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    if (this.vehicleFrameType.equals("Unibody")){
      return "Chassis : " + VehicleFrame.chassis +
          "\nVehicle Frame : " + this.vehicleFrameType;
    }
    else {
      return "Vehicle Frame : " + this.vehicleFrameType;
    }
  }
}
