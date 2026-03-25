import java.io.*;
import java.net.*;

public class ServerThread extends Thread {
	ServerSocket server = null;
	Socket client = null;
	String stringaRicevuta = null;
	String stringaModificata = null;
	BufferedReader inDalClient;
	DataOutputStream outVersoClient;
	
	public ServerThread(Socket socket) {
		this.client = socket;
	}
	public void run() {
		try {
			comunica();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("errore run");
		}
	}
	public void comunica() throws Exception {
		inDalClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
		outVersoClient = new DataOutputStream(client.getOutputStream());
		System.out.println(client.getLocalPort());
		//System.out.println(client.getLocalPort());
		for (;;) {
			stringaRicevuta = inDalClient.readLine();
			if (stringaRicevuta == null) {}
			else if (stringaRicevuta.equals("FINE")) {
				outVersoClient.writeBytes(stringaRicevuta + "-(server chiusura)-" + '\n');
				System.out.println("echo sul server in chiusura: " + stringaRicevuta);
				break;
			} else {
				outVersoClient.writeBytes(stringaRicevuta + " (ricevuta e ritrasmessa)" + '\n');
				System.out.println("6 echo sul server: " + stringaRicevuta);
			}
		}
		outVersoClient.close();
		inDalClient.close();
		System.out.println("chiusura socket " + client);
		client.close();

	}



	public static void main(String args[]) {
		MultiServer tcpServer = new MultiServer();
		tcpServer.start();
	}
}
