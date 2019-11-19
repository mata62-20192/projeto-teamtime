package br.ufba.mata62.teamtime.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.ListModel;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;

import br.ufba.mata62.teamtime.domain.Aluno;
import br.ufba.mata62.teamtime.service.FacadeService;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Escalonamento extends JFrame{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escalonamento window = new Escalonamento();
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
	public Escalonamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String cursoCodigo = "112140";
		FacadeService service = new FacadeService(cursoCodigo);
		service.cadastraAluno("Andre", 1234, 12345678);
        service.cadastraAluno("Walker", 6094, 12345678);
        service.cadastraAluno("Medeiros", 23884, 12345678);
        service.cadastraAluno("Oliveira", 4234, 12345678);
		service.cadastraAluno("vini", 216216674, 20162);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][grow][][][][][][][][][][][][][][][][][][][][grow][]", "[][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblListagemDeEscalonamento = new JLabel("Listagem de escalonamento do curso");
		lblListagemDeEscalonamento.setFont(new Font("Dialog", Font.BOLD, 18));
		frame.getContentPane().add(lblListagemDeEscalonamento, "cell 1 0");
		
		JLabel lblOrdenarPor = new JLabel("Ordenar por:");
		frame.getContentPane().add(lblOrdenarPor, "cell 16 2,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CR Decrescente", "Semestre Crescente"}));
		frame.getContentPane().add(comboBox, "cell 17 2 8 1,growx");
		
		JList list = new JList();
		list.setFont(new Font("Dialog", Font.BOLD, 14));
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(15);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListModel listModel = new DefaultListModel();
		for (Aluno aluno: service.visualizaEscalonamentoCurso()) {
			listModel.addElement("Aluno: " + aluno.getNome() + " - CR: " + aluno.getCR() + " - Semestre: " + aluno.getSemestre());
	   	}	
		
		list.setModel(listModel);
		
		
		frame.getContentPane().add(list, "cell 1 3 24 15,grow");
		
		JScrollBar scrollBar = new JScrollBar();
		frame.getContentPane().add(scrollBar, "cell 25 3 1 15,growy");
	}

}
