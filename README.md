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
```bash
# Compilazione
javac TCP-SINGLE-THREAD/ServerStr.java
javac TCP-SINGLE-THREAD/ClientThread.java

# Esecuzione (terminali separati)
java -cp TCP-SINGLE-THREAD ServerStr
java -cp TCP-SINGLE-THREAD ClientThread
```

### TCP Multi-Thread
```bash
# Compilazione
javac TCP-MULTI-THREAD/MultiServer.java
javac TCP-MULTI-THREAD/ServerThread.java
javac TCP-MULTI-THREAD/ClientStr.java

# Esecuzione (terminali separati)
java -cp TCP-MULTI-THREAD MultiServer
java -cp TCP-MULTI-THREAD ClientStr
```

### UDP
```bash
# Compilazione
javac UDP/UDPServer.java
javac UDP/UDPClient.java

# Esecuzione (terminali separati)
java -cp UDP UDPServer
java -cp UDP UDPClient
```

### Multicast
```bash
# Compilazione
javac UDP/MulticastServer.java
javac UDP/MulticastClient.java

# Esecuzione (terminali separati)
java -cp UDP MulticastServer
java -cp UDP MulticastClient
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
