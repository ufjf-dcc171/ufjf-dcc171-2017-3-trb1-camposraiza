import java.util.*;

public class Sistema
{
 private LinkedList<Espetaculo> espetaculo;
 private LinkedList<Usuario> usuario;
 public Sistema(){
     this.espetaculo = new LinkedList<Espetaculo>();
     this.usuario = new LinkedList<Usuario>();
     
 }
    
 public void setUsuario(String tipo)
 {
     
 }
    
 public void setMantenedor(String login, String senha)
 {
     usuario.addLast(new usuario(login, senha,0));
     
 }
    
 public void excluirEspetaculo(String nome)
 {
     for(int i=0; i<this.espetaculo.size(); i++)
     {
         if(this.espetaculo.get(i).getNome().equals(nome))
         {
             this.espetaculo.remove(i);
             break;
         }
     }
 }
    
 public void incluirEspetaculo(String tipo, String nome, String descricao, String faixaEtaria, int duracao, String tempInicio, String tempFim)
 {
    this.espetaculo.addLast(new Espetaculo(tipo,nome,descricao,faixaEtaria,duracao,String tempInicio, String tempFim));
 }
    
 public void alterarEspetaculo(String nome)
 {
      for(int i=0; i<this.espetaculo.size(); i++)
     {
         if(this.espetaculo.get(i).getNome().equals(nome))
         {
             Scanner leitor = new Scanner(System.in);
             
         }
     } 
 }
}
