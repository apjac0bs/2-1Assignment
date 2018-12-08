import java.util.*;
import sun.net.www.content.text.*;

public class ManufacturedEngine implements Engine{

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private String engineType;
  private int engineCylinders;
  private String driveTrain;

  public ManufacturedEngine(){
//    this.engineManufacturer = "Generic";
//    this.engineManufacturedDate = new Date();
//    this.engineMake = "Generic";
//    this.engineModel = "Generic";
//    this.engineType = "85 AKI";
//    this.engineCylinders = 0;
//    this.driveTrain = "2WD: Two-Wheel Drive";
//
    setEngineManufacturer("Generic");
    setEngineManufacturedDate(new Date());
    setEngineMake("Generic");
    setEngineModel("Generic");
    setEngineType("Generic");
    setEngineCylinders(0);
    setDriveTrain("Generic");

  }
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      String engineType,
      int engineCylinders,
      String driveTrain) {

//    this.engineManufacturer = engineManufacturer;
//    this.engineManufacturedDate = engineManufacturedDate;
//    this.engineMake = engineMake;
//    this.engineModel = engineModel;
//    this.engineType = engineType;
//    this.engineCylinders = engineCylinders;
//    this.driveTrain = driveTrain;
//
    setEngineManufacturer(engineManufacturer);
    setEngineManufacturedDate(engineManufacturedDate);
    setEngineMake(engineMake);
    setEngineModel(engineModel);
    setEngineType(engineType);
    setEngineCylinders(engineCylinders);
    setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  @Override
  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\n"
        + "Engine Manufactured : " + engineManufacturedDate + "\n"
        + "Engine Make : " + engineMake + "\n"
        + "Engine Model : " + engineModel + "\n"
        + "Engine Type : " + engineType + "\n"
        + "Engine Cylinders : " + engineCylinders + "\n"
        + "Drive Train : " + driveTrain;
  }
}
