
public class Salas
{
   
    private int numeroSala, totalAssentos;
    private String descricao;
    private int[][] mapa;
    
    
    public Salas(int numSala, int TAssentos)
    {
       this.numeroSala = numSala;
       this.totalAssentos = TAssentos;

       int num = (int)Math.sqrt(this.totalAssentos);
       mapa = new int[num][num];
    }
    
    
}
