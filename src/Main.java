import java.util.Date;

public class Main {

  public static void main(String[] args) {

    testVehicleChassis();
    testVehicleFrame();
    testManufacturedEngine();
    testFeatures();
    testVehicle();
    testCar();
  }

  public static void testVehicleChassis() {
    
    
    // sample data is given for parameters

    VehicleChassis myChassis = new VehicleChassis(); // Creates two objects, one with the default constructor
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn"); // constructor with parameters
    System.out.println(yourChassis.toString());
  }

  public static void testVehicleFrame() {
    // Write a static main method that tests two scenarios (for step 4)
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame"); // prints a value set by a single string value: Vehicle Frame : Ladder Frame
    System.out.println(vf2);
  }
  // Write a static main method that tests two scenarios:
  public static void testManufacturedEngine() {
    ManufacturedEngine me1 = new ManufacturedEngine(); // One that prints a generic set of strings
    System.out.println(me1);

    ManufacturedEngine me2 =
        new ManufacturedEngine("Honda", new Date() // One that accepts call parameters and returns the following:
            , "H-Series", "H23A1"
            , "2WD: Two-Wheel Drive", 4
            , "88 AKI");
    System.out.println(me2);
  }
  // Write a static main method that tests two scenarios:
  // One that prints all fuel grade values, like: Interior [Generic]
  // Another like: Interior [Climate Control]
  // Write a static main method that tests two scenarios:
  // One that prints all fuel grade values, like: Exterior [Generic]
  // Another like: Exterior [Fog Lamps]
  
  public static void testFeatures() {
    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);

  }
  // Write a static main method that tests two scenarios:
  // One that prints a generic set of strings,
  
  public static void testVehicle() { 
    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    Vehicle v2 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe", // One that accepts call parameters and returns the following:
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"));
    System.out.println(v2);
  }

  public static void testCar() {

    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();

    // Seed the features with valid subclasses.
    Feature[] f = {new InteriorFeature("AM/FM Radio")
        , new ExteriorFeature("Wood Panels")
        , new InteriorFeature("Air Conditioning")
        , new ExteriorFeature("Moonroof")};

    // Create an overloaded Car instance.
    Car c2 = new Car(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive")
        , f, 2);
    System.out.println(c2);
  }
}
