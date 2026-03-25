package serverStr;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public void start() {
		try {
			ServerSocket serverSocket = new ServerSocket(6789);
			for (;;) {
				System.out.println("1) server in attesa");
				Socket socket = serverSocket.accept();
				System.out.println("3) server socket " + socket);
				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				//System.out.println(serverThread.client.getLocalPort());
				//System.out.println(serverThread.client.getPort());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("3) errore durante l'instanziazione del server");
			System.exit(1);
		}
	}
}
