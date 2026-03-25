# Istruzioni per Eseguire UDP Server e Client

## Prerequisiti

Assicurati di aver compilato i file Java:
```powershell
cd C:\Users\radic\Documents\ProgettiJava\UDP-TCP\UDP
javac UDPServer.java UDPClient.java
```

## Avvio del Server e Client

### Passo 1: Avviare il Server UDP

Apri un terminale PowerShell e esegui:

```powershell
cd C:\Users\radic\Documents\ProgettiJava\UDP-TCP\UDP
java UDPServer
```

Vedrai il messaggio:
```
SERVER avviato...
```

Il server è ora in attesa di connessioni sulla porta **6789**.

### Passo 2: Avviare il Client UDP

Apri un **SECONDO** terminale PowerShell (lascia il primo con il server in esecuzione) e esegui:

```powershell
cd C:\Users\radic\Documents\ProgettiJava\UDP-TCP\UDP
java UDPClient
```

Vedrai il messaggio:
```
Client pronto - inserisci un dato da inviare:
```

### Passo 3: Inviare Messaggi

1. Nel terminale del client, digita un messaggio (es: `ciao mondo`)
2. Premi **Invio**
3. Il server riceverà il messaggio e lo convertirà in maiuscolo
4. Il client riceverà la risposta: `CIAO MONDO`

**Esempio di interazione:**
```
Client pronto - inserisci un dato da inviare:
ciao mondo
dal SERVER:CIAO MONDO
```

Nel terminale del server vedrai:
```
RICEVUTO: ciao mondo
```

### Passo 4: Terminare il Server

Per chiudere il server in modo pulito:

1. Nel terminale del client, digita: `fine`
2. Premi **Invio**
3. Il server si chiuderà mostrando:
   ```
   RICEVUTO: fine
   SERVER IN CHIUSURA. Buona serata.
   ```

## Risoluzione Problemi

### Errore: "Address already in use"

Se vedi questo errore:
```
java.net.BindException: Address already in use: bind
```

Significa che la porta 6789 è già occupata. Per risolvere:

1. Trova il processo che usa la porta:
   ```powershell
   netstat -ano | findstr :6789
   ```

2. Termina il processo (sostituisci `PID` con il numero mostrato):
   ```powershell
   taskkill /PID <PID> /F
   ```

3. Riavvia il server

### Il Client non si connette

- Verifica che il server sia in esecuzione
- Controlla che entrambi usino `localhost` e porta `6789`
- Verifica che il firewall non blocchi la connessione

## Note

- Il server può gestire un client alla volta
- Dopo ogni messaggio, il client termina automaticamente
- Per inviare più messaggi, devi riavviare il client ogni volta
- Il server rimane attivo fino a quando non riceve il comando `fine`

## Architettura

- **Protocollo**: UDP (User Datagram Protocol)
- **Porta**: 6789
- **Host**: localhost (127.0.0.1)
- **Funzionalità**: Il server converte i messaggi ricevuti in maiuscolo e li rispedisce al client
