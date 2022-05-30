package face;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FaceAutor extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textNacionalidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaceAutor frame = new FaceAutor();
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
	public FaceAutor() {
		setTitle("Cadastro autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(151, 90, 222, 47);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(23, 97, 78, 29);
		contentPane.add(lblNewLabel_1);
		
		textNacionalidade = new JTextField();
		textNacionalidade.setColumns(10);
		textNacionalidade.setBounds(151, 148, 222, 47);
		contentPane.add(textNacionalidade);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nacionalidade");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(23, 155, 107, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cadastro autor");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(166, 23, 149, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JButton register = new JButton("Cadastrar");
		register.setFont(new Font("Tahoma", Font.ITALIC, 13));
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		register.setBounds(170, 227, 89, 23);
		contentPane.add(register);
		
		JButton cancel = new JButton("Cancelar");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancel.setFont(new Font("Tahoma", Font.ITALIC, 13));
		cancel.setBounds(269, 227, 89, 23);
		contentPane.add(cancel);
		
		String nome = textNome.getName();
		String nacionalidade = textNacionalidade.getText();
		
	}
}
