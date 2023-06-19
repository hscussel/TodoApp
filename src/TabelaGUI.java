import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TabelaGUI extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public TabelaGUI() {

        setTitle("Tabela 9x1");


        JPanel panel = new JPanel();


        tableModel = new DefaultTableModel(0, 9);


        String[] columnNames = {"Nome Completo", "Idade(Na Matrícula)", "E-mail", "Endereço","CEP", "Telefone", "Curso", "Observações", "Ativo"};
        tableModel.setColumnIdentifiers(columnNames);

        table = new JTable(tableModel);


        table.setPreferredSize(new Dimension(1100, 500));
        table.setPreferredScrollableViewportSize(table.getPreferredSize());


        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);


        add(panel);

        pack();

    }
}
