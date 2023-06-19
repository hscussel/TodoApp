import javax.swing.*;
import java.awt.*;

public class InterfaceMenu extends JFrame {
    public InterfaceMenu() {

        setTitle("Informações dos Alunos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());


        JLabel label = new JLabel("Informações dos Alunos");
        label.setHorizontalAlignment(SwingConstants.CENTER);


        BotaoGUI botaoGUI = new BotaoGUI();
        JPanel buttonsPanel = botaoGUI.getButtonsPanel();


        JPanel paddingPanel = new JPanel();
        paddingPanel.setPreferredSize(new Dimension(0, 10));

        mainPanel.add(buttonsPanel, BorderLayout.NORTH);
        mainPanel.add(label, BorderLayout.CENTER);
        mainPanel.add(paddingPanel, BorderLayout.SOUTH);

        TabelaGUI tabelaGUI = new TabelaGUI();


        JPanel tabelaPanel = (JPanel) tabelaGUI.getContentPane().getComponent(0);


        mainPanel.add(tabelaPanel, BorderLayout.PAGE_END);


        add(mainPanel);


        pack();

        setLocationRelativeTo(null);

        setVisible(true);
    }
}
