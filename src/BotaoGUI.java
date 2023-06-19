import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoGUI {
    private JPanel buttonsPanel;

    public BotaoGUI() {
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        JButton botaoNovo = new JButton("Novo");
        JButton botaoAtualizar = new JButton("Atualizar");
        JButton botaoDeletar = new JButton("Deletar");

        botaoNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                InterfaceDados interfaceNova = new InterfaceDados();
            }
        });

        buttonsPanel.add(botaoNovo);
        buttonsPanel.add(botaoAtualizar);
        buttonsPanel.add(botaoDeletar);
    }

    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }
}
