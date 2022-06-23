package classes;

public class Cliente {
    private String nomeUsuario;
    private String emailUsuario;
    private int senhaUsuario;

    public Cliente(String nomeUsuario, String emailUsuario, int senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }


    public String getNomeUsuario() {
        return this.nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return this.emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public int getSenhaUsuario() {
        return this.senhaUsuario;
    }

    public void setSenhaUsuario(int senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
}
