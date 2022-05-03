package aps;
import java.io.*;
import java.net.*;

public class MyServer
{
    public static void main(String[] args)
    {
        try 
        {
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept(); //estabelece a conexão
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String str=(String)dis.readUTF();
        System.out.println("\n Mensagem da equipe dos inspetores: "+str);
        ss.close();
        }

           catch(Exception e)
           {
           System.out.println(e);
           }
    }
}