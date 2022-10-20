public class BluetoothHeadphones implements IBluetoothHeadphones {
  public void playMusic() {
    System.out.println("Playing music over bluetooth channel.");
  }

  public void connectBlueTooth() {
    System.out.println("Headphones connected over bluetooth.");
  }
  
  public void turnOn() {
    System.out.println("Headphones are turned on!");
  }
}
