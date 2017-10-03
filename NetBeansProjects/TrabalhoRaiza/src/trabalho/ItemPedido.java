package trabalho;

public class ItemPedido extends Item{
    
    private int quantidade;
    
          
    public ItemPedido(String nome, double valor, int quantidade) {
        super(nome, valor);
        this.quantidade = quantidade;
    }  
    
        public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
        @Override
    public String toString() {
        return   " Nome: " + getNome() + "  Quantidade: " + quantidade +" ";
        
    }
    
}
