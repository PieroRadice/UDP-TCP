# Progetto Didattico UDP-TCP con Java

Progetto educativo che dimostra l'implementazione di comunicazioni di rete in Java utilizzando i protocolli UDP e TCP.

## Struttura del Progetto

### TCP-SINGLE-THREAD
Implementazione di un server TCP single-thread e relativo client.
- `ServerStr.java` - Server TCP che gestisce un client alla volta
- `ClientThread.java` - Client TCP per la connessione al server

### TCP-MULTI-THREAD
Implementazione di un server TCP multi-thread che può gestire più client contemporaneamente.
- `MultiServer.java` - Server principale che accetta connessioni multiple
- `ServerThread.java` - Thread dedicato per ogni client connesso
- `ClientStr.java` - Client TCP per la connessione al server multi-thread

### UDP
Implementazione di comunicazioni UDP, incluso multicast.
- `UDPServer.java` - Server UDP per comunicazioni datagram
- `UDPClient.java` - Client UDP per inviare/ricevere datagram
- `MulticastServer.java` - Server multicast per broadcasting
- `MulticastClient.java` - Client multicast per ricevere broadcast

## Compilazione ed Esecuzione

### TCP Single-Thread
```powershell
# Compilazione
cd TCP-SINGLE-THREAD
javac ServerStr.java ClientThread.java

# Esecuzione (terminali separati)
# Terminale 1 - Server
java ServerStr

# Terminale 2 - Client
java ClientThread
```

### TCP Multi-Thread
```powershell
# Compilazione
cd TCP-MULTI-THREAD
javac MultiServer.java ServerThread.java ClientStr.java

# Esecuzione (terminali separati)
# Terminale 1 - Server (avvia ServerThread che contiene il main)
java ServerThread

# Terminale 2 e 3 - Client (puoi aprire più client)
java ClientStr
```

### UDP
```powershell
# Compilazione
cd UDP
javac UDPServer.java UDPClient.java

# Esecuzione (terminali separati)
# Terminale 1 - Server
java UDPServer

# Terminale 2 - Client
java UDPClient
```

### Multicast
```powershell
# Compilazione
cd UDP
javac MulticastServer.java MulticastClient.java

# Esecuzione (terminali separati)
# Terminale 1 - Server
java MulticastServer

# Terminale 2 e 3 - Client (puoi aprire più client)
java MulticastClient
```

## Requisiti

- Java Development Kit (JDK) 8 o superiore
- Conoscenza base dei protocolli di rete TCP/UDP

## Scopo Didattico

Questo progetto è stato creato per scopi educativi per comprendere:
- Differenze tra TCP e UDP
- Gestione delle connessioni socket in Java
- Programmazione multi-thread per server concorrenti
- Comunicazioni multicast

## Licenza

Progetto didattico - uso educativo
