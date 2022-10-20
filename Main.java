public class Main {
  
  public static void main(String[] args) {
    // Bluetooth Headphones Object:
    BluetoothHeadphones bluetoothHeadphones = new BluetoothHeadphones();
    bluetoothHeadphones.turnOn();
    bluetoothHeadphones.playMusic();

    // Wired Headphones Object:
    WiredHeadphones wiredHeadphones = new WiredHeadphones();
    wiredHeadphones.plugIn();
    wiredHeadphones.playMusic();

    // Use Adapter class to make bluetooth headphones function
    // as wired headphones
    IWiredHeadphones adpatedBluetoothHeadphones = new HeadphoneAdapter(bluetoothHeadphones);

    // Client is able to treat bluetooth headphones as wired headphones.
    // We are able to call wired headphone functionality on bluetooth headphones
    adpatedBluetoothHeadphones.plugIn();
    adpatedBluetoothHeadphones.playMusic();
  }
}
