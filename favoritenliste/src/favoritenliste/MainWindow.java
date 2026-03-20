package favoritenliste;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JRadioButton rdbtnSQLite;
	static JRadioButton rdbtnMYSql
	JRadioButton rdbtnMySQL;

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
		
		JLabel lblDatabaseSelection = new JLabel("Please select your preferred Database");
		contentPane.add(lblDatabaseSelection);
		
		rdbtnSQLite = new JRadioButton("SQLite");
		contentPane.add(rdbtnSQLite);
		rdbtnSQLite.setSelected(true);
		
		rdbtnMySQL = new JRadioButton("MySQL");
		contentPane.add(rdbtnMySQL);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnSQLite);
		btnGroup.add(rdbtnMySQL);
		
		JButton btnLogin = new JButton("Login");
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
		
		if (loginWindow.)
	}
	
	public static Boolean sqliteSelected() {
		if (rdbtnSQLite.isSelected()) return true;
		return false;
	}
	
	public static void getNumFilms() {
		// Define in db
	}
}
