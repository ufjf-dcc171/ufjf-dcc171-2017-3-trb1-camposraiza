
import java.util.*;
public class Espetaculo
{   
    private String nome, tipo, descricao, faixaEtaria, duracao, temporada;
    
    LinkedList<Pessoa> artista; 
    
    public Espetaculo(){        
    }
    
     public Espetaculo(String nome, String tipo, String descricao, String faixaEtaria, String duracao,
                        String temporada, Pessoa artista){
     this.nome = nome;
     this.tipo = tipo;
     this.descricao = descricao;
     this.faixaEtaria = faixaEtaria;
     this.duracao = duracao;
     this.temporada = temporada;     
     this.artista = new LinkedList<Pessoa>();
    }
    
    public void incluirEspetaculo(String tipo){
    }
    
    public void alterarEspetaculo(String tipo){
    }
    
    public void excluirEspetaculo(String tipo){
    }
    
    public void incluirEspetaculo(String tipo, String nome, String descricao, String faixaEtaria, Pessoa artista, String duracao, String temporada){
    }
    
    public void alterarEspetaculo(String tipo, String nome, String descricao, String faixaEtaria, Pessoa artista, String duracao, String temporada){
    }
    
    public void excluirEspetaculo(String tipo, String nome, String descricao, String faixaEtaria, Pessoa artista, String duracao, String temporada){
    }
    
}


