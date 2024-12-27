# File Transfer Server and Client

## Overview

This project consists of two Java programs: `FileServer` and `FileClient`. The `FileServer` listens for incoming connections and receives a file from the client, saving it locally. The `FileClient` connects to the server and sends a specified file.

## FileServer

The `FileServer` program performs the following actions:
1. Listens on port 1234 for incoming connections.
2. Accepts client connections.
3. Receives file data from the client and saves it as "received_file.txt".
4. Closes the connection and waits for new client connections.

### Usage

1. Compile the `FileServer` program:
    ```sh
    javac FileServer.java
    ```

2. Run the `FileServer` program:
    ```sh
    java FileServer
    ```

## FileClient

The `FileClient` program performs the following actions:
1. Connects to the `FileServer` running on `localhost` at port 1234.
2. Sends the specified file to the server.
3. Closes the connection after sending the file.

### Usage

1. Compile the `FileClient` program:
    ```sh
    javac FileClient.java
    ```

2. Run the `FileClient` program, specifying the path to the file to be sent:
    ```sh
    java FileClient
    ```

## Example

To test the file transfer:
1. Start the `FileServer` on your machine.
2. Run the `FileClient` on the same or a different machine, providing the path to the file you want to send.

The server will save the received file as "received_file.txt" in the current directory.

## Notes

- Ensure that the server is running and listening on the specified port before starting the client.
- Modify the file path in the `FileClient` code to point to the actual file you want to send.

Happy coding!
