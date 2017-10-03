package trabalho;

import javax.swing.JFrame;

/**
 *
 * @author Raiza Silva Campos
 */
public class Trabalho {

    public static void main(String[] args) {

        JanelaPedido janela = new JanelaPedido();
        janela.setSize(500, 500);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
