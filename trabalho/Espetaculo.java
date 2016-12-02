
import java.util.*;
public class Espetaculo
{   
    private String nome, tipo, descricao, faixaEtaria, tempInicio, tempFim;
    int  duracao;
    LinkedList<Pessoa> artista; 
    
    
    public Espetaculo()
    {        
    }
    
     public Espetaculo(String nome, String tipo, String descricao, String faixaEtaria,int duracao,
                        String tempInicio, String tempFim){
     this.nome = nome;
     this.tipo = tipo;
     this.descricao = descricao;
     this.faixaEtaria = faixaEtaria;
     this.duracao = duracao;
     this.tempInicio = tempInicio;
     this.tempFim = tempFim;     
     this.artista = new LinkedList<Pessoa>();
    }
    public void setEspetaculo(String descricao, String faixaEtaria, int duracao,
                        String tempInicio, String tempFim){
     this.nome = nome;
     this.tipo = tipo;
     this.descricao = descricao;
     this.faixaEtaria = faixaEtaria;
     this.duracao = duracao;
     this.tempInicio = tempInicio;
     this.tempFim = tempFim;    
     this.artista = new LinkedList<Pessoa>();
    }
    public String getNome()
    {
        return this.nome;
    }
    
}


