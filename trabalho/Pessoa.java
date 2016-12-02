public class Pessoa extends Usuario
{
    protected String nome, cpf, rg, email, dataNascimento;
    
    public Pessoa (String nome, String cpf, String rg, String email, String dataNascimento, String login, String senha)
    {
        super(login,senha,1);
        this.nome = nome;
        this.cpf = cpf;
        this.rg  = rg;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

}
