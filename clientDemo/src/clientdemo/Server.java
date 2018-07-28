/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Server {
    
    public static void main(String[] args) throws IOException {
        
        ServerSocket sock = new ServerSocket(1354);
        
        while(true) {
            Socket client = sock.accept();
            PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
            pout.println("fuck you");
            client.close();
        }   
    }
}
