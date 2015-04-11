import jssc.SerialPort;
import jssc.SerialPortException;

public class Main {

    public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("COM33");
        try {
            serialPort.openPort();//Open serial port
            serialPort.setParams(9600, 8, 1, 0);//Set params.
            byte[] buffer = serialPort.readBytes(100);//Read 10 bytes from serial port
            serialPort.closePort();//Close serial port
        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }
}