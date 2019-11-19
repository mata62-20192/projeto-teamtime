package br.ufba.mata62.teamtime.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class Escalonamento {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.getContentPane().add(list, "cell 1 3 24 15,grow");
		
		JScrollBar scrollBar = new JScrollBar();
		frame.getContentPane().add(scrollBar, "cell 25 3 1 15,growy");
	}

}
