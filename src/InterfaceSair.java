import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceSair {

    private InterfaceDados interfaceDados;
    private JFrame janela;
    public InterfaceSair(InterfaceDados interfaceDados) {
        this.interfaceDados = interfaceDados;

        janela = new JFrame("Sair");
        janela.setSize(400, 100);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());

        JLabel rotulo = new JLabel("Você está saindo sem salvar. Deseja mesmo continuar?");
        rotulo.setHorizontalAlignment(JLabel.CENTER);
        painel.add(rotulo, BorderLayout.CENTER);

        JButton botaoSim = new JButton("Sim");
        botaoSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaceDados.dispose();
                janela.dispose();
            }
        });

        JButton botaoNao = new JButton("Não");
        botaoNao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.dispose();
            }
        });

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoSim);
        painelBotoes.add(botaoNao);

        painel.add(painelBotoes, BorderLayout.SOUTH);

        janela.add(painel);
        janela.setVisible(true);
    }
}
