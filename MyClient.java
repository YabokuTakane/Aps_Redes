package aps;

import java.io.*;
import java.net.*;

public class MyClient 
{
  public static void main(String[] args)  
  {
      try
      {
         Socket s=new Socket("192.168.56.1",6666); //IP do Server/ Porta selecionada
         DataOutputStream dout=new DataOutputStream(s.getOutputStream());//Enviando a mensagem
         dout.writeUTF("\n Olá Secretaria de Estado do Meio Ambiente, \n identificamos que a principal atividade que está gerando poluição ao Rio Tietê \n é o despejo de dejetos urbanos e industriais. \n Qualquer novidade iremos informar! Att. Equipe de inspetores. "); //Mensagem enviada
         dout.flush();
         dout.close();
         s.close();
      }
      
      catch(Exception e)
      {
          System.out.println(e);
      }   
  }
}
