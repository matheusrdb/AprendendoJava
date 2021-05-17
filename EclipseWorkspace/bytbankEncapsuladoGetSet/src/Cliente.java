public class Cliente {
    private String nome;
    private String cpf;
    private int cep;
    
    public Cliente()	{
    	if(cep <= 0)
    		return;
    }
    //Getters
    public String getCpf()  {
        return cpf;
    }
    public int getCep()  {
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
    public void setCep(int cep)  {
        this.cep = cep;
    }
}
