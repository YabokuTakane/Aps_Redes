package creatorelement;

import java.io.Serializable;

public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String login, senha, cpf;
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
