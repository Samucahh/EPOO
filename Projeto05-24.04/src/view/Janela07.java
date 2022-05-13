package view;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela07 extends JFrame {
	private JPanel contentPane = new JPanel();
	private JLabel rotulo1 = new JLabel("FORMATAÇÃO DO TEXTO");
	private JLabel rotulo2 = new JLabel("Negrito");
	private JLabel rotulo3 = new JLabel("Itálico");
	private JLabel rotulo4 = new JLabel("Sublinhado");
	private JLabel rotulo5 = new JLabel("Tipo de Fonte:");

	private JCheckBox opcao1 = new JCheckBox();
	private JCheckBox opcao2 = new JCheckBox();
	private JCheckBox opcao3 = new JCheckBox();
	private JComboBox lista1 = new JComboBox(fontes);
	private static final String[] fontes = { "Arial", "Arial Black", "Comic Sans	MS", "Courier New", "Tahoma",
			"Verdana" };

	public Janela07() {
		super("Janela 7");
		setBounds(300, 200, 310, 300);
		getContentPane().setLayout(null);

		rotulo1.setBounds(75, 20, 150, 20);
		add(rotulo1);

		opcao1.setBounds(20, 60, 20, 20);
		add(opcao1);

		rotulo2.setBounds(40, 60, 150, 20);
		add(rotulo2);

		opcao2.setBounds(100, 60, 20, 20);
		add(opcao2);

		rotulo3.setBounds(120, 60, 150, 20);
		add(rotulo3);

		opcao3.setBounds(180, 60, 20, 20);
		add(opcao3);

		rotulo4.setBounds(200, 60, 150, 20);
		add(rotulo4);

		rotulo5.setBounds(20, 90, 150, 20);
		add(rotulo5);

		lista1.setMaximumRowCount(6);
		lista1.setBounds(110, 90, 150, 20);
		add(lista1);
	}
}