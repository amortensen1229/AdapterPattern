public class BluethoothToWiredAdapter implements IWiredHeadphones {
  BluetoothHeadphones bluetoothHeadphones;
  public BluethoothToWiredAdapter(BluetoothHeadphones bluetoothHeadphones) {
    this.bluetoothHeadphones = bluetoothHeadphones;
  }

  public void playMusic() {
    this.bluetoothHeadphones.playMusic();
  }

  public void plugIn() {
    this.bluetoothHeadphones.turnOn();
  }

  public void getWireLength() {
    
  }
}
