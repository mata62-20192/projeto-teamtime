package br.ufba.mata62.teamtime.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class InforAlunoController {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InforAlunoController window = new InforAlunoController();
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
	public InforAlunoController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][][][][][][][][]"));
		
		JLabel lblInformaes = new JLabel("Informações");
		lblInformaes.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(lblInformaes, "cell 1 0");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().add(lblNome, "cell 1 2");
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel, "cell 2 2 4 1,growx");
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().add(lblMatrcula, "cell 1 3");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_1, "cell 2 3 2 1");
		
		JLabel lblIngressouEm = new JLabel("Ingressou em:");
		lblIngressouEm.setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().add(lblIngressouEm, "cell 1 4");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_2, "cell 2 4 2 1");
		
		JLabel lblHistrico = new JLabel("Exibir histórico:");
		lblHistrico.setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().add(lblHistrico, "cell 1 6");
		
		JButton btnHistrico = new JButton("TXT");
		btnHistrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHistrico.setToolTipText("Visualizar histórico completo de aluno no formato .txt");
		frame.getContentPane().add(btnHistrico, "cell 3 6");
		
		JButton btnHtml = new JButton("HTML");
		btnHtml.setToolTipText("Visualizar histórico completo de aluno no formato .html");
		frame.getContentPane().add(btnHtml, "cell 4 6");
		
		JButton btnVoltar = new JButton("Voltar");
		frame.getContentPane().add(btnVoltar, "cell 5 9");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnVisualizar = new JMenu("Visualizar");
		menuBar.add(mnVisualizar);
		
		JMenu mnNewMenu = new JMenu("Histórico");
		mnVisualizar.add(mnNewMenu);
		
		JMenuItem mntmHtml = new JMenuItem("HTML");
		mnNewMenu.add(mntmHtml);
		
		JMenuItem mntmTxt = new JMenuItem("TXT");
		mnNewMenu.add(mntmTxt);
	}

}
