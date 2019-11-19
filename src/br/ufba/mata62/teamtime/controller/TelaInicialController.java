package br.ufba.mata62.teamtime.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
//import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class TelaInicialController {

	private JFrame frmSistemaAcadmico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialController window = new TelaInicialController();
					window.frmSistemaAcadmico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicialController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaAcadmico = new JFrame();
		frmSistemaAcadmico.setTitle("Sistema Acad\u00EAmico - UFBA");
		frmSistemaAcadmico.setBounds(100, 100, 800, 600);
		frmSistemaAcadmico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaAcadmico.getContentPane().setLayout(new MigLayout("", "[239px]", "[27px][27px][27px][27px]"));
		
		JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
		btnCadastrarAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnCadastrarAluno, "cell 0 0,growx,aligny top");
		
		JButton btnListarAlunos = new JButton("Listar Alunos");
		btnListarAlunos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnListarAlunos, "cell 0 1,growx,aligny top");
		
		JButton btnVisualizarCurrculoDo = new JButton("Visualizar Curr\u00EDculo do Curso");
		btnVisualizarCurrculoDo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnVisualizarCurrculoDo, "cell 0 2,growx,aligny top");
		
		JButton btnVisualizarEscalonament = new JButton("Visualizar Escalonamento");
		btnVisualizarEscalonament.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnVisualizarEscalonament, "cell 0 3,growx,aligny top");
		
		JMenuBar menuBar = new JMenuBar();
		frmSistemaAcadmico.setJMenuBar(menuBar);
		
		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnOpes);
		
		JMenuItem mntmCadastrarAluno = new JMenuItem("Cadastrar Aluno");
		mnOpes.add(mntmCadastrarAluno);
		
		JMenuItem mntmListarAlunos = new JMenuItem("Listar Alunos");
		mnOpes.add(mntmListarAlunos);
		
		JMenuItem mntmVisualizarCurrculoDo = new JMenuItem("Visualizar Curr\u00EDculo do Curso");
		mnOpes.add(mntmVisualizarCurrculoDo);
		
		JMenuItem mntmVisualizarEscalonamento = new JMenuItem("Visualizar Escalonamento");
		mnOpes.add(mntmVisualizarEscalonamento);
	}

}
