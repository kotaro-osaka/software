package gui;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home {

	private JFrame frame;
	
	private ButtonGroup btnGroupDbSelection;
	private JRadioButton rdbtnSQLite;
	private JRadioButton rdbtnMySQL;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		initialize();
		
		setContent();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setContent() {
		btnGroupDbSelection = new ButtonGroup();
		
		rdbtnSQLite = new JRadioButton("SQLite");
		rdbtnSQLite.addActionListener(new ActionListener() {
			database.setDatenbank("SQLite");
		});
		
		rdbtnMySQL = new JRadioButton("MySQL");
		rdbtnMySQL.addActionListener(new ActionListener() {
			// database.setDatenbank("MySQL");
		});
		
		JRadioButton rdbtnSqlite = new JRadioButton("SQLite");
		rdbtnSqlite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database.setDatenbank("SQLite");
				textUrl.setText(database.getAktiveUrl());
				
			}
		});
		
		rdbtnSqlite.setSelected(true);
		buttonGroup.add(rdbtnSqlite);
		rdbtnSqlite.setBounds(192, 25, 93, 23);
		contentPane.add(rdbtnSqlite);
		
		JRadioButton rdbtnMysql = new JRadioButton("MySQL");
		rdbtnMysql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.setDatenbankTo("MySql");
				textUrl.setText(db.getAktiveUrl());
			}
		});
		
		buttonGroup.add(rdbtnMysql);
		rdbtnMysql.setBounds(295, 25, 96, 23);
		contentPane.add(rdbtnMysql);
	}

}
