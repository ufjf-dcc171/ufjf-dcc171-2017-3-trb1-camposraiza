package trabalho;
import java.util.Date;
import java.util.List;


class Pedidos {
    
   private int mesa;    
   private String descricao;
   private Date data;
   private Date termino;
   private boolean status;
   private List<Item> itens;
    
    public Pedidos () {
        
    }  
    
    public Pedidos (int mesa, String descricao, Date data) {
        this.mesa = mesa;
        this.descricao = descricao;
        this.data = data;        
        this.status = true;
        Date termino;
        this.termino = null;        
    }   

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }   
    
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void adicionaItem(){
    Pedidos p = new Pedidos();
        
    }

    @Override
    public String toString() {
        String statusConvertido; //para aparecer o texto e não 'true' ou 'false'
        if (status) {
            statusConvertido = "Aberto";
        } else {
            statusConvertido = "Fechado";
        }
        
        String horaTermino = "";
        if (termino != null){
            horaTermino = termino.getHours()+":"+termino.getMinutes();
        }
        else{
            horaTermino = " Pedido aberto";
        }
        return "Pedido{"+ "mesa= " + mesa + ", status= " + statusConvertido + ", descricao= " + descricao + ", abertura= " + data.getHours() + ":" + data.getMinutes() + " término= " + horaTermino + '}';
    }
    
}