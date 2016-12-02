
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
       int num2 = this.totalAssentos/num;
       
       mapa = new int[num+1][];
       for(int i = 0; i < num ; i++)
       {
           mapa[i] = new int[num2];
       }
       mapa[num] = new int[this.totalAssentos%num];
    }
    
    public void incluirSala(int numSala){
    }
    
    public void alterarSala(int numSala){
    }
    
    public void excluirSala(int numSala){
    }
    
    
}
