package creatorelement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gerador {
    public static void main(String[] args) throws IOException {
        User usr = new User();
        usr.setCpf("0123456789");
        usr.setLogin("Yato");
        usr.setSenha("kam1");
        
        User guess = new User();
        guess.setCpf("9876543210");
        guess.setLogin("Yukine");
        guess.setSenha("yuk1");
        
        List<User> usuarios = new ArrayList<User>();
        usuarios.add(usr);
        usuarios.add(guess);
        
        Gson ord = new GsonBuilder().setPrettyPrinting().create();
        
        String JsonUser = ord.toJson(usuarios);
        System.out.println(JsonUser);
        
        FileWriter expt = new FileWriter("C:\\Users\\vr678\\Downloads\\filejson.txt");
        expt.write(JsonUser);
        expt.flush();
        expt.close();
    }
}
