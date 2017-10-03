package trabalho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class JanelaItem extends JFrame{
    
private final List<Item> itens = new ArrayList<Item>();
private final JButton btAdicionaItem = new JButton("Adicionar Item");
private final JButton btCancelar = new JButton("Cancelar");
private JTextField txItem = new JTextField("");

public JanelaItem() {

       // lstPedidos.setModel(new PedidoListModel(pedidos));
       // lstPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JPanel botoes = new JPanel(new GridLayout(4, 2));
        JPanel edits = new JPanel(new GridLayout(14, 2));

        this.setTitle("Inserir Itens");
        add(edits, BorderLayout.CENTER);
        edits.add(txItem);
        add(botoes, BorderLayout.SOUTH);
        botoes.add(btAdicionaItem);
        botoes.add(btCancelar);
        
        
}
    
    
}
