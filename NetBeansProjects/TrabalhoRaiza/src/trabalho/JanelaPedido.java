package trabalho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JanelaPedido extends JFrame {

    private final List<Pedidos> pedidos = new ArrayList<Pedidos>();
    private final List<Pedidos> eventos = new ArrayList<Pedidos>();
    private final JButton btCriaPedido = new JButton("Cria Pedido");
    private final JButton btExcluiPedido = new JButton("Exclui Pedido");
    private final JButton btEditaPedido = new JButton("Edita Pedido");
    private JTextField txMesa = new JTextField("Número da mesa");
    private JTextField txStatus = new JTextField("Status");
    private JTextField txData = new JTextField("dd/MM/yyyy HH:mm");
    private JTextField txDescricao = new JTextField("Descrição");
    private final JList<Pedidos> lstPedidos = new JList<Pedidos>(new DefaultListModel<>());

    public JanelaPedido() {

        lstPedidos.setModel(new PedidoListModel(pedidos));
        lstPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JPanel botoes = new JPanel(new GridLayout(4, 2));
        JPanel edits = new JPanel(new GridLayout(4, 2));

        add(edits, BorderLayout.CENTER);
        edits.add(txMesa);
        edits.add(txStatus);
        edits.add(txData);
        edits.add(txDescricao);
        add(botoes, BorderLayout.SOUTH);
        botoes.add(btCriaPedido);
        botoes.add(btEditaPedido);          
        botoes.add(btExcluiPedido);

        add(new JScrollPane(lstPedidos), BorderLayout.WEST);

        btCriaPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mesa = Integer.parseInt(txMesa.getText());
                boolean status = Boolean.parseBoolean(txStatus.getText());                
                String descricao = txDescricao.getText();
                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                Date data = new Date();
                s.format(data);
                s.setLenient(false);
                Pedidos p = new Pedidos();
                try {
                    p.setData(data = s.parse(txData.getText()));
                } catch (ParseException ex) {
                    Logger.getLogger(JanelaPedido.class.getName()).log(Level.SEVERE, null, ex);
                }

                p.setDescricao(descricao);                
                p.setStatus(status);
                p.setMesa(mesa);
                
                
                pedidos.add(p);
                lstPedidos.updateUI();
            }
        });

        btExcluiPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lstPedidos.isSelectionEmpty()) {
                    return;
                }
                pedidos.remove(lstPedidos.getSelectedValue());
                lstPedidos.clearSelection();
                lstPedidos.updateUI();
            }
        });
        btEditaPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                
                txMesa.setText("Nova mesa");
                txStatus.setText("Status");
                txDescricao.setText("Descrição");
                txData.setText("dd/MM/yyyy HH:mm");
            }
        });
        lstPedidos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Pedidos selecionada = lstPedidos.getSelectedValue();
                if (selecionada != null) {                    
                    txMesa.setText(Integer.toString(selecionada.getMesa()));
                    txStatus.setText(Boolean.toString(selecionada.getStatus()));
                    txDescricao.setText(selecionada.getDescricao());
                    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                
                s.setLenient(false);
                    txData.setText(s.format(selecionada.getData()));
                } else {
                    lstPedidos.setModel(new DefaultListModel<>());
                }
            }
        });
    }
}
