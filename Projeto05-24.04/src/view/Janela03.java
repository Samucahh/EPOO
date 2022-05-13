package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Janela03 extends JFrame{
	
	private JPanel contentPane = new JPanel();
	private JLabel rotulo1 = new JLabel("LOGIN NO SISTEMA");
	private JLabel rotulo2 = new JLabel("Usuário");
	private JLabel rotulo3 = new JLabel("Senha: ");
	private JTextField campo1 = new JTextField();
	private JPasswordField campo2 = new JPasswordField();
	
	public Janela03() {
		super("Janela 3");
		setBounds(100, 50, 270, 200);
		
		getContentPane().setLayout(null);
		
		rotulo1.setBounds(80, 20, 120, 20);
		add(rotulo1);
		
		rotulo2.setBounds(20, 60, 100, 20);
		add(rotulo2);
		
		rotulo3.setBounds(20, 90, 100, 20);
		add(rotulo3);
		
		
		campo1.setBounds(80,  60,  150, 20);
		campo1.setToolTipText("Digite aqui o seu usuário");
		add(campo1);
		
		campo2.setBounds(80, 90, 100, 20);
		campo1.setToolTipText("Digite aqui sua senha");
		add(campo2);
		
		
		
		
		
	}
	

}
