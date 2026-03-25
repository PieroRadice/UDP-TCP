# Comandi Shell per Creare Repository GitHub

## Prerequisiti

Prima di iniziare, assicurati di avere:
- Git installato sul tuo sistema
- Un account GitHub
- Git configurato con le tue credenziali

## Configurazione Iniziale Git (se non già fatto)

```bash
git config --global user.name "Il Tuo Nome"
git config --global user.email "tua-email@example.com"
```

## Passo 1: Inizializzare il Repository Locale

Apri PowerShell o Command Prompt e naviga nella directory del progetto:

```powershell
cd C:\Users\radic\Documents\ProgettiJava\UDP-TCP
```

Inizializza il repository Git:

```bash
git init
```

## Passo 2: Aggiungere i File al Repository

Aggiungi tutti i file al staging area:

```bash
git add .
```

Verifica i file aggiunti:

```bash
git status
```

## Passo 3: Primo Commit

Crea il primo commit:

```bash
git commit -m "Initial commit: Progetto didattico UDP-TCP Java"
```

## Passo 4: Creare il Repository su GitHub

### Opzione A: Tramite Interfaccia Web
1. Vai su https://github.com
2. Clicca sul pulsante "+" in alto a destra
3. Seleziona "New repository"
4. Nome repository: `UDP-TCP-Java` (o il nome che preferisci)
5. Descrizione: "Progetto didattico per comunicazioni UDP e TCP in Java"
6. Scegli se pubblico o privato
7. **NON** selezionare "Initialize this repository with a README"
8. Clicca "Create repository"

### Opzione B: Tramite GitHub CLI (se installato)
```bash
gh repo create UDP-TCP-Java --public --description "Progetto didattico per comunicazioni UDP e TCP in Java" --source=. --remote=origin
```

## Passo 5: Collegare il Repository Locale a GitHub

Dopo aver creato il repository su GitHub, collega il repository locale:

```bash
git remote add origin https://github.com/TUO-USERNAME/UDP-TCP-Java.git
```

Sostituisci `TUO-USERNAME` con il tuo username GitHub.

## Passo 6: Rinominare il Branch Principale (opzionale ma consigliato)

```bash
git branch -M main
```

## Passo 7: Push del Codice su GitHub

Carica il codice sul repository remoto:

```bash
git push -u origin main
```

Se richiesto, inserisci le tue credenziali GitHub o utilizza un Personal Access Token.

## Comandi Utili per Aggiornamenti Futuri

### Verificare lo stato del repository
```bash
git status
```

### Aggiungere modifiche
```bash
git add .
```

### Creare un commit
```bash
git commit -m "Descrizione delle modifiche"
```

### Inviare le modifiche a GitHub
```bash
git push
```

### Scaricare le modifiche da GitHub
```bash
git pull
```

### Visualizzare la cronologia dei commit
```bash
git log
```

### Visualizzare i remote configurati
```bash
git remote -v
```

## Autenticazione GitHub

### Tramite Personal Access Token (consigliato)

1. Vai su GitHub → Settings → Developer settings → Personal access tokens → Tokens (classic)
2. Clicca "Generate new token (classic)"
3. Seleziona gli scope necessari (almeno `repo`)
4. Copia il token generato
5. Usa il token come password quando richiesto da Git

### Tramite SSH (alternativa)

Genera una chiave SSH:
```bash
ssh-keygen -t ed25519 -C "tua-email@example.com"
```

Aggiungi la chiave a GitHub:
1. Copia il contenuto di `~/.ssh/id_ed25519.pub`
2. Vai su GitHub → Settings → SSH and GPG keys → New SSH key
3. Incolla la chiave e salva

Usa l'URL SSH invece di HTTPS:
```bash
git remote set-url origin git@github.com:TUO-USERNAME/UDP-TCP-Java.git
```

## Riepilogo Comandi Completi

```bash
# 1. Naviga nella directory del progetto
cd C:\Users\radic\Documents\ProgettiJava\UDP-TCP

# 2. Inizializza Git
git init

# 3. Aggiungi tutti i file
git add .

# 4. Primo commit
git commit -m "Initial commit: Progetto didattico UDP-TCP Java"

# 5. Rinomina branch in main
git branch -M main

# 6. Aggiungi remote (sostituisci TUO-USERNAME)
git remote add origin https://github.com/TUO-USERNAME/UDP-TCP-Java.git

# 7. Push su GitHub
git push -u origin main
```

## Note

- Il file `.gitignore` è già configurato per escludere file compilati (.class) e file IDE
- Il `README.md` fornisce documentazione completa del progetto
- Ricorda di sostituire `TUO-USERNAME` con il tuo username GitHub effettivo
