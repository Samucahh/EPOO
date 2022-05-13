package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela05 extends JFrame {

	private JPanel contentPane = new JPanel();
	private JLabel rotulo1 = new JLabel("CADASTRO DE ANIMAIS");
	private JLabel rotulo2 = new JLabel("Nome do animal:");
	private JLabel rotulo3 = new JLabel("Espécie:");
	private JLabel rotulo4 = new JLabel("Canina");
	private JLabel rotulo5 = new JLabel("Felina");
	private JTextField campo1 = new JTextField();
	private JRadioButton opcao1 = new JRadioButton("Canina", true);
	private JRadioButton opcao2 = new JRadioButton("Felina", false);
	private ButtonGroup grupo = new ButtonGroup();
	private JButton botao1 = new JButton("Cadastrar Animal");

	public Janela05() {
		super("Janela 5");
		setBounds(200, 100, 300, 230);
		getContentPane().setLayout(null);
		
		
		rotulo1.setBounds(80, 20, 150, 20);
		add(rotulo1);
		
		rotulo2.setBounds(20, 60, 150, 20);
		add(rotulo2);
		
		rotulo3.setBounds(20, 90, 150, 20);
		add(rotulo3);		
		
		campo1.setBounds(120, 60, 150, 20);
		campo1.setToolTipText("Digite o nome do animal aqui");
		add(campo1);
		
		opcao1.setBounds(120, 90, 15, 20);
		add(opcao1);
		
		opcao2.setBounds(120, 110, 15, 20);
		add(opcao2);

		grupo.add(opcao1);
		grupo.add(opcao2);
		
		rotulo4.setBounds(140, 90, 150, 20);
		add(rotulo4);
		
		rotulo5.setBounds(140, 110, 150, 20);
		add(rotulo5);
		
		botao1.setBounds(75, 150, 150, 20);
		add(botao1);
	}

}
