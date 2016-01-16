import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class DictTest {
	String word;
	public static void main(String[] args) throws Exception{
		DictTest clientSideInstance = new DictTest();
        clientSideInstance.run();
    }
	public void DictTest(String w){
		word = w;
	}
    public void run() throws Exception{
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        InetAddress a = InetAddress.getByName("dict.org");
		Socket soc = new Socket(a, 2628);
        PrintStream printStream = new PrintStream(soc.getOutputStream());
        printStream.println("DEFINE english traits");

        InputStreamReader Inputreader = new InputStreamReader(soc.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(Inputreader);
        String receivedMsg =  bufferedReader.readLine().trim();
        System.out.println(receivedMsg);

        while (true){
            receivedMsg =  bufferedReader.readLine();
            System.out.println(receivedMsg);
            }
    }		

}
