public class Cliente {
    private String nome;
    private String cpf;
    private String cep;

    //Getters
    public String getCpf()  {
        return cpf;
    }
    public String getCep()  {
        return cep;
    }
    public String getNome() {
        return nome;
    }

    //Setters
    public void setNome(String nome)  {
        this.nome = nome;
    }
    public void setCpf(String cpf)  {
        this.cpf = cpf;
    }
    public void setCep(String cep)  {
        this.cep = cep;
    }
}
