package favoritenliste;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDatabaseSelection;
	private JRadioButton rdbtnSQLite;
	private JRadioButton rdbtnMySql;
	private JButton btnLogin;
	private JTable filmTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		lblDatabaseSelection = new JLabel("Please select your preferred Database");
		contentPane.add(lblDatabaseSelection);

		rdbtnSQLite = new JRadioButton("SQLite");
		contentPane.add(rdbtnSQLite);
		rdbtnSQLite.setSelected(true);

		rdbtnMySql = new JRadioButton("MySQL");
		contentPane.add(rdbtnMySql);

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnSQLite);
		btnGroup.add(rdbtnMySql);

		btnLogin = new JButton("Continue");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		contentPane.add(btnLogin);
	}

	private void login() {
		LoginWindow loginWindow = new LoginWindow(this); // this = parent
		loginWindow.setVisible(true);
		
		if (loginWindow.getLoginStatus()) {
			lblDatabaseSelection.setVisible(false);
			rdbtnSQLite.setVisible(false);
			rdbtnMySql.setVisible(false);
			btnLogin.setVisible(false);
			
			setBounds(100, 100, 500, 300);
			
			JLabel lblNumFilms = new JLabel();
			lblNumFilms.setText(String.valueOf(getNumFilms()) + " Films");
			contentPane.add(lblNumFilms);
			
			List<Film> films = getFilms();
			
			String[] columnNames = { "Title", "Year" };
			DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // init with 0 rows
			
			for (Film film : films) {
				tableModel.addRow(new Object[] { film.getTitle(), film.getYear() });
			}
			
			filmTable = new JTable(tableModel);
			JScrollPane scrollPane = new JScrollPane(filmTable);
			scrollPane.setBounds(10, 140, 550, 200);
			contentPane.add(scrollPane);
		}
	}

	public boolean sqliteSelected() {
		return rdbtnSQLite.isSelected();
	}

	private int getNumFilms() {
		return Database.getNumFilms(sqliteSelected());
	}
	
	private List<Film> getFilms() {
		return Database.getFilms(sqliteSelected());
	}
}
