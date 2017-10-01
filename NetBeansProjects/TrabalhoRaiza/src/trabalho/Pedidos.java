package trabalho;
import java.util.Date;

class Pedidos {
    
    int mesa;    
    String descricao;
    Date data;
    boolean status;

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
    
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{"+ "mesa=" + mesa + ", status=" + status + ", descricao=" + descricao + ", data=" + data + '}';
    }
    
}