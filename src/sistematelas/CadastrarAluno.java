package sistematelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class CadastrarAluno {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAluno window = new CadastrarAluno();
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
	public CadastrarAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][grow][][][][][][][][][][][]", "[][][][][][][][][]"));
		
		JLabel lblCadastrarEstudante = new JLabel("Cadastrar Estudante");
		lblCadastrarEstudante.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(lblCadastrarEstudante, "cell 2 0,alignx center,aligny center");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNome, "cell 2 2,alignx leading");
		
		JFormattedTextField frmtdtxtfldNomeCompletoDo = new JFormattedTextField();
		frmtdtxtfldNomeCompletoDo.setText("Nome completo do aluno");
		frmtdtxtfldNomeCompletoDo.setToolTipText("Nome completo do aluno");
		frame.getContentPane().add(frmtdtxtfldNomeCompletoDo, "cell 3 2 2 1,growx");
		
		JLabel lblNDeMatrcula = new JLabel("N\u00BA de Matr\u00EDcula: ");
		lblNDeMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNDeMatrcula, "cell 2 4,alignx leading");
		
		JFormattedTextField frmtdtxtfldNmeroDeMatrcula = new JFormattedTextField();
		frmtdtxtfldNmeroDeMatrcula.setToolTipText("N\u00FAmero de matr\u00EDcula");
		frame.getContentPane().add(frmtdtxtfldNmeroDeMatrcula, "cell 3 4 2 1,growx");
		
		JLabel lblSemestreDeIngresso = new JLabel("Semestre de ingresso: ");
		lblSemestreDeIngresso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblSemestreDeIngresso, "cell 2 6,alignx leading");
		
		JFormattedTextField frmtdtxtfldSemestreDeIngresso = new JFormattedTextField();
		frmtdtxtfldSemestreDeIngresso.setToolTipText("Semestre de ingresso");
		frame.getContentPane().add(frmtdtxtfldSemestreDeIngresso, "cell 3 6 2 1,growx");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		frame.getContentPane().add(btnCadastrar, "cell 3 8,alignx right");
		
		JButton btnCancelar = new JButton("Cancelar");
		frame.getContentPane().add(btnCancelar, "cell 4 8");
	}

}
