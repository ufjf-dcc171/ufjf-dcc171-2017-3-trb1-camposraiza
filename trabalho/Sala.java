
public class Sala
{
   
    private int numeroSala, totalAssentos;
    private String descricao;
    private int[][] mapa;
    
    
    public Sala(int numSala, int TAssentos)
    {
       this.numeroSala = numSala;
       this.totalAssentos = TAssentos;

       int num = (int)Math.sqrt(this.totalAssentos);
       mapa = new int[num][num];
    }
    
    public void incluirSala(int numSala){
    }
    
    public void alterarSala(int numSala){
    }
    
    public void excluirSala(int numSala){
    }
    
    
}
