package lesson2_3_Chat;

public class ChatServer {

    private ServerSocketThread server;

    public void start (int port){
        if (server != null && server.isAlive()){
            System.out.println("Server is already running");
        } else {
            System.out.printf("Server starts at port: %d\n", port);
            server = new ServerSocketThread("server", port);
        }
    }

    public void stop(){
        if (server == null || !server.isAlive()){
            System.out.println("Server is not running");
        } else {
            server.isInterrupted();
            System.out.println("Server stopped");
        }
    }
}
