import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceDados extends JFrame {

    public InterfaceDados() {
        setTitle("Dados");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        String[] titulos = {"Nome Completo", "Idade(Na matricula)", "E-mail", "Endereço", "CEP", "Telefone", "Usuário", "Senha", "Observações"};

        for (String titulo : titulos) {
            JLabel label = new JLabel(titulo);
            JTextField textField = new JTextField();
            textField.setPreferredSize(new Dimension(800, textField.getPreferredSize().height));
            if (titulo.equals("Idade(Na matricula)")) {
                textField.setPreferredSize(new Dimension(50, textField.getPreferredSize().height));
            }
            if (titulo.equals("CEP") || (titulo.equals("Telefone"))) {
                textField.setPreferredSize(new Dimension(300, textField.getPreferredSize().height));
            }

            panel.add(label, gbc);
            gbc.gridy++;
            panel.add(textField, gbc);
            gbc.gridy++;
        }

        JLabel labelSelecao = new JLabel("Cursos:");
        panel.add(labelSelecao, gbc);
        gbc.gridy++;

        String[] opcoes = {"Curso A", "Curso B", "Curso C","Curso D", "Curso E"};

        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        panel.add(comboBox, gbc);
        gbc.gridy++;

        JLabel labelAtivo = new JLabel("Ativo:");
        panel.add(labelAtivo, gbc);
        gbc.gridy++;

        JCheckBox checkBoxAtivo = new JCheckBox();
        panel.add(checkBoxAtivo, gbc);

        JPanel botoesPanel = new JPanel(new BorderLayout());
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoSair = new JButton("Sair");

        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceSair interfaceSair = new InterfaceSair(InterfaceDados.this);
            }
        });

        botoesPanel.add(botaoSalvar, BorderLayout.WEST);
        botoesPanel.add(botaoSair, BorderLayout.EAST);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridwidth = 2;
        panel.add(botoesPanel, gbc);

        add(panel);

        pack();
        setVisible(true);
    }
}
