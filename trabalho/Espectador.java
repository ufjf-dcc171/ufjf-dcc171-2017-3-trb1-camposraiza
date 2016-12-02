
public class Espectador extends Pessoa
{
   private String endereco, telefone,localTrabalho, endComercial;
   
   public Espectador(String nome, String cpf, String rg, String email, String dataNascimento, String endereco,String telefone, String localTrabalho, String endComercial)
   {
       super(nome, cpf, rg, email, dataNascimento);
       this.endereco = endereco;
       this.telefone = telefone;
       this.localTrabalho = localTrabalho;
       this.endComercial = endComercial;
   }
   
}
