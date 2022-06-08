package classes;

public class Cliente {
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private Compras carrinho;

    // -------------------------------------------------
    



    // -------------------------

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Compras getCarrinho() {
        return this.carrinho;
    }

    public void setCarrinho(Compras carrinho) {
        this.carrinho = carrinho;
    }

}
