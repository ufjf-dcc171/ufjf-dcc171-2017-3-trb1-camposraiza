package trabalho;
import java.util.Date;

class Pedidos {
    
    int mesa;    
    String descricao;
    Date data;
    Date termino;
    boolean status;
    
    public Pedidos () {
        
    }
    
    public Pedidos (int mesa, String descricao, Date data, Date termino) {
        this.mesa = mesa;
        this.descricao = descricao;
        this.data = data;
        this.termino = termino;
        this.status = true;
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

    @Override
    public String toString() {
        String statusConvertido; //para aparecer o texto e não 'true' ou 'false'
        if (status) {
            statusConvertido = "Aberto";
        } else {
            statusConvertido = "Fechado";
        }
        return "Pedido{"+ "mesa=" + mesa + ", status=" + statusConvertido + ", descricao=" + descricao + ", abertura=" + data.getHours() + ":" + data.getMinutes()+ ", fechamento=" + termino.getHours() + ":" + termino.getMinutes() + '}';
    }
    
}