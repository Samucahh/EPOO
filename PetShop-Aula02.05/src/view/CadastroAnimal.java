package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CadastroAnimal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNome;
	private JLabel lblRaa;
	private JLabel lblCadastroDeAnimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAnimal frame = new CadastroAnimal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroAnimal() {
		setTitle("Cadastro Animal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESP\u00C9CIE: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(32, 131, 126, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 90, 219, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 128, 219, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 169, 219, 30);
		contentPane.add(textField_2);
		
		lblNome = new JLabel("NOME:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(32, 93, 126, 14);
		contentPane.add(lblNome);
		
		lblRaa = new JLabel("RA\u00C7A:");
		lblRaa.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaa.setBounds(32, 177, 126, 14);
		contentPane.add(lblRaa);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(170, 210, 126, 30);
		contentPane.add(btnNewButton);
		
		lblCadastroDeAnimal = new JLabel("CADASTRO DE ANIMAL");
		lblCadastroDeAnimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAnimal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastroDeAnimal.setBounds(102, 38, 241, 14);
		contentPane.add(lblCadastroDeAnimal);
	}
}
