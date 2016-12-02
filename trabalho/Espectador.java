
public class Espectador extends Pessoa
{
   private String endereco, telefone,localTrabalho, endComercial, usuario, senha;
   
   public Espectador (String nome, String cpf, String rg, String email, String dataNascimento, String endereco, 
                      String telefone, String localTrabalho, String endComercial, String usuario, String senha){
   super(nome, cpf, rg, email, dataNascimento);
   this.endereco = endereco;
   this.telefone = telefone;
   this.localTrabalho = localTrabalho;
   this.endComercial = endComercial;
   this.usuario = usuario;
   this.senha = senha;
   }
   
}
