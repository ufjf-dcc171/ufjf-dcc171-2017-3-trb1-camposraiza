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
    private JTextField txStatus = new JTextField("Status: Aberto");
    private JTextField txData = new JTextField("HH:mm");
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
        txStatus.setEnabled(false);
        edits.add(txData);
        edits.add(txDescricao);
        add(botoes, BorderLayout.SOUTH);
        botoes.add(btCriaPedido);
        botoes.add(btEditaPedido);
        botoes.add(btExcluiPedido);

        add(new JScrollPane(lstPedidos), BorderLayout.EAST);

        btCriaPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int mesa = Integer.parseInt(txMesa.getText());
                    String descricao = txDescricao.getText();
                    SimpleDateFormat s = new SimpleDateFormat("HH:mm");
                    Date data = new Date();
                    s.format(data);
                    s.setLenient(false);
                    if (descricao.equals("Descrição")) { //verifica se há descrição
                        JOptionPane.showMessageDialog(null, "Favor preencher todos os campos.");
                        return;
                    }
                    Pedidos p = new Pedidos(mesa, descricao, s.parse(txData.getText()));
                    pedidos.add(p);

                    txMesa.setText("Número da mesa"); //retorna as mensagens para default
                    txStatus.setText("Status: Aberto");
                    txStatus.setEnabled(false); //deixa o status bloquado enquanto o pedido está aberto
                    txData.setText("HH:mm");
                    txDescricao.setText("Descrição");
                    lstPedidos.updateUI();
                } catch (NumberFormatException | ParseException ex) { //verifica formatação dos dados
                    JOptionPane.showMessageDialog(null, "Não foi possível criar o pedido. Favor verificar se todos os campos foram corretamente preechidos.");
                }
            }
        });

        btExcluiPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lstPedidos.isSelectionEmpty()) {
                    return;
                }
                pedidos.remove(lstPedidos.getSelectedValue());
                lstPedidos.updateUI();
            }
        });
        btEditaPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lstPedidos.isSelectionEmpty()) {
                    return;
                }
                Pedidos p = pedidos.get(lstPedidos.getSelectedIndex());
                if (p.status) { //verifica se o status está Aberto
                    p.setMesa(Integer.parseInt(txMesa.getText()));
                    Date data = new Date();
                    SimpleDateFormat s = new SimpleDateFormat("HH:mm");
                    s.format(data);
                    s.setLenient(false);
                    try {
                        p.setData(s.parse(txData.getText()));
                    } catch (ParseException ex) {
                        Logger.getLogger(JanelaPedido.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    p.descricao = txDescricao.getText();
                    if (txStatus.getText().equals("Fechado")) { //se estiver fechado, altera para false
                        p.status = false;
                    }

                    txMesa.setText("Número da mesa"); //retorna mensagens para default
                    txStatus.setText("Status: Aberto");
                    txStatus.setEnabled(false);
                    txData.setText("HH:mm");
                    txDescricao.setText("Descrição");

                    lstPedidos.updateUI();
                } else {
                    txMesa.setText("Número da mesa"); //se o pedido estiver fechado, mostra mensagem de erro
                    txStatus.setText("Status: Aberto");
                    txStatus.setEnabled(false);
                    txData.setText("HH:mm");
                    txDescricao.setText("Descrição");
                    JOptionPane.showMessageDialog(null, "O pedido está fechado, não pode ser editado");
                }
            }
        });
        lstPedidos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Pedidos selecionada = lstPedidos.getSelectedValue();
                if (selecionada != null) {
                    txMesa.setText(Integer.toString(selecionada.getMesa())); 
                    if (selecionada.getStatus()) { //deixa o status editável quando o pedido é clicado
                        txStatus.setText("Aberto");
                        txStatus.setEnabled(true);
                    } else {
                        txStatus.setText("Fechado");
                        txStatus.setEnabled(true);
                    }
                    txDescricao.setText(selecionada.getDescricao());
                    SimpleDateFormat s = new SimpleDateFormat("HH:mm");

                    s.setLenient(false);
                    txData.setText(s.format(selecionada.getData()));
                } else {
                    lstPedidos.setModel(new DefaultListModel<>());
                }
            }
        });
    }
}
