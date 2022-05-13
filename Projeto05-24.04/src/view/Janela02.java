package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela02 extends JFrame {
	
	private JPanel contentPane = new JPanel();
	private JLabel rotulo1 = new JLabel("LOGIN NO SISTEMA");
	private JLabel rotulo2 = new JLabel("Usuário");
	private JLabel rotulo3 = new JLabel("Senha: ");
	
	public Janela02() {
		super("Janela 2");
		setBounds(100, 50, 270, 200);
		getContentPane().setLayout(null);
		
		rotulo1.setBounds(80, 20, 120, 20);
		add(rotulo1);
		
		rotulo2.setBounds(20, 60, 120, 20);
		add(rotulo2);
		
		rotulo3.setBounds(20, 90, 120, 20);
		add(rotulo3);
	}

}
