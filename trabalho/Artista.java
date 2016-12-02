public class Artista extends Pessoa
{
    private String celular;
    
    public Artista(String nome, String cpf, String rg, String email, String dataNascimento, String celular){
    super(nome, cpf, rg, email, dataNascimento);
    this.celular = celular;
    }
    
    public void incluirArtista(String cpf){
    }
    
    public void alterarArtista(String cpf){
    }
    
    public void excluirArtista(String cpf){
    }
}
