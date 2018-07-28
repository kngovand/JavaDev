
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Client {
    

    public static void main(String[] args) throws IOException {
        
        Socket sock = new Socket("127.0.0.1",1354);
        InputStream in = sock.getInputStream();
        BufferedReader bin = new BufferedReader(new InputStreamReader(in));
        
        String line;
        while((line = bin.readLine())!=null);
        System.out.print(line);
        
        sock.close();
        
        
    }
    
    
}
