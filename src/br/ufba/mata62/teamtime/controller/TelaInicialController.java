package br.ufba.mata62.teamtime.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TelaInicialController extends JFrame{

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
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarAlunoController cadastraraluno = new CadastrarAlunoController();
				cadastraraluno.frame.setVisible(true);
				dispose();
			}
		});
		btnCadastrarAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnCadastrarAluno, "cell 0 0,growx,aligny top");
		
		JButton btnListarAlunos = new JButton("Listar Alunos");
		btnListarAlunos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnListarAlunos, "cell 0 1,growx,aligny top");
		
		JButton btnVisualizarCurrculoDo = new JButton("Visualizar Curr\u00EDculo do Curso");
		btnVisualizarCurrculoDo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnVisualizarCurrculoDo, "cell 0 2,growx,aligny top");
		
		JButton btnVisualizarEscalonament = new JButton("Visualizar Escalonamento");
		btnVisualizarEscalonament.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Escalonamento escalonamento = new Escalonamento();
				escalonamento.frame.setVisible(true);
				dispose();
			}
		});
		btnVisualizarEscalonament.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmSistemaAcadmico.getContentPane().add(btnVisualizarEscalonament, "cell 0 3,growx,aligny top");

		
	}

}
