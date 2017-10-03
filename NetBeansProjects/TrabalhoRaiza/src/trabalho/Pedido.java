package trabalho;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {

    private int mesa;
    private Date data;
    private Date termino;
    private boolean status;
    private List<ItemPedido> itens;

    public Pedido() {

    }

    public Pedido(int mesa, Date data) {
        this.mesa = mesa;
        this.data = data;
        this.status = true;
        Date termino;
        this.termino = null;
        this.itens = new ArrayList<>();
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
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

    public void adicionaItem(Item item, int quantidade) {
        itens.add(new ItemPedido(item, this, quantidade));       

    }

    @Override
    public String toString() {
        String statusConvertido; //para aparecer o texto e não 'true' ou 'false'
        if (status) {
            statusConvertido = "Aberto";
        } else {
            statusConvertido = "Fechado";
        }

        String horaTermino;
        if (termino != null) {
            horaTermino = termino.getHours() + ":" + termino.getMinutes();
        } else {
            horaTermino = " Pedido aberto";
        }
        String detalhePedido = "Pedido{" + "mesa= " + mesa + ", status= " + statusConvertido + ", abertura= " + data.getHours() + ":" + data.getMinutes() + " término= " + horaTermino + '}';
        for (ItemPedido p : this.itens) {
            detalhePedido += System.lineSeparator() + "   - " + p.getItem().getNome() + "(" + p.getQuantidade() + ")";
        }
        return detalhePedido;
    }

}
