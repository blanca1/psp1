package serpis.psp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[2048];
		int port = 10001;
		
		
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

		InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
		
		DatagramSocket datagramSocket = new DatagramSocket(port, inetAddress);
		
		while (true) {
			
			datagramSocket.receive(datagramPacket);
			
			String texto = new String(datagramPacket.getData());
			System.out.println("Este mensaje ha sido enviado desde la direccion: " + datagramPacket.getAddress() + "\n" +
			"con puerto: " + datagramPacket.getPort() + "\n" +
			"y con longitud de: " + datagramPacket.getLength() + "\n" +
			"Mensaje: " + mensaje);
		}
	}

}
