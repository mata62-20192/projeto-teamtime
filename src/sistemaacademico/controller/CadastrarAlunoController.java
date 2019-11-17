package sistemaacademico.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class CadastrarAlunoController {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAlunoController window = new CadastrarAlunoController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastrarAlunoController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(new MigLayout("", "[222px][101px][][][][][][][]", "[23px][][17px][17px][17px][25px][][][][][]"));
		
		JLabel lblCadastrarEstudante = new JLabel("Cadastrar Estudante");
		lblCadastrarEstudante.setBounds(6, 6, 222, 23);
		lblCadastrarEstudante.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblCadastrarEstudante, "cell 0 1");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(6, 36, 47, 17);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNome, "cell 0 4");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Dialog", Font.PLAIN, 14));
		formattedTextField.setToolTipText("Nome completo do aluno");
		formattedTextField.setBounds(234, 35, 5, 19);
		frame.getContentPane().add(formattedTextField, "cell 1 4 4 1,growx");
		
		JLabel lblNDeMatrcula = new JLabel("N\u00BA de Matr\u00EDcula: ");
		lblNDeMatrcula.setBounds(6, 61, 118, 17);
		lblNDeMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNDeMatrcula, "cell 0 6");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		formattedTextField_1.setToolTipText("Número de matrícula do aluno");
		formattedTextField_1.setBounds(234, 60, 5, 19);
		frame.getContentPane().add(formattedTextField_1, "cell 1 6 2 1,growx");
		
		JLabel lblSemestreDeIngresso = new JLabel("Semestre de ingresso: ");
		lblSemestreDeIngresso.setBounds(6, 86, 163, 17);
		lblSemestreDeIngresso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblSemestreDeIngresso, "cell 0 8");
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		formattedTextField_2.setToolTipText("Semestre de ingresso do aluno");
		formattedTextField_2.setBounds(234, 85, 5, 19);
		frame.getContentPane().add(formattedTextField_2, "cell 1 8 2 1,growx");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(234, 141, 101, 25);
		frame.getContentPane().add(btnCadastrar, "cell 3 10,alignx right");
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(341, 172, 93, 25);
		frame.getContentPane().add(btnNewButton, "cell 4 10,alignx right");
	}

}
