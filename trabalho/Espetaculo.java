
import java.util.*;
public class Espetaculo
{   
    private String nome, tipo, descricao;
    
    LinkedList<Pessoa> artista = new LinkedList<Pessoa>();
    public Espetaculo(){
        
    }
    
     public Espetaculo(String nome, String descricao){
     this.nome = nome;
     this.descricao = descricao;
     
    }
}


