package trabalho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class JanelaItem extends JFrame {

    private final List<Item> itens = new ArrayList<Item>();
    private JComboBox<Item> jComboBox = new JComboBox();
    private final JButton btAdicionaItem = new JButton("Adicionar Item");
    private final JButton btCancelar = new JButton("Cancelar");
     private final JLabel lbQuantidade = new JLabel("Quantidade");
    private JTextField txQuantidade = new JTextField("");
    private Pedido selectedPedido;
    private JList<Pedido> lstPedidos; 

    
    
    public JanelaItem() {

        JPanel botoes = new JPanel(new GridLayout(4, 2));
        JPanel edits = new JPanel(new GridLayout(14, 2));
        JPanel pComboBox = new JPanel(new GridLayout(14, 2));
        pComboBox.add(jComboBox);
        add(pComboBox, BorderLayout.CENTER);

        this.setTitle("Inserir Itens");
       

        add(botoes, BorderLayout.SOUTH);
        botoes.add(btAdicionaItem);
        botoes.add(btCancelar);

        jComboBox.setModel(new ItemListModel());
        pComboBox.add(lbQuantidade);
        pComboBox.add(txQuantidade);

        
        JanelaItem ji = this;
        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ji.setVisible(false);
            }
        });
        
        
        btAdicionaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedPedido.adicionaItem((Item)jComboBox.getSelectedItem(), Integer.parseInt(txQuantidade.getText()));
                lstPedidos.updateUI();
                ji.setVisible(false);
                
            }
        });

    }
    
    public void setListPedidos (JList<Pedido> lstPedidos) {
        this.lstPedidos = lstPedidos;
    }

    public Pedido getSelectedPedido() {
        return selectedPedido;
    }

    public void setSelectedPedido(Pedido selectedPedido) {
        this.selectedPedido = selectedPedido;
    }

    
    
}
