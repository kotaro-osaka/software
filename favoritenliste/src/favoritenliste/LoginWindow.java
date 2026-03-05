package favoritenliste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputUsername;
	private JPasswordField inputPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow frame = new LoginWindow();
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
	public LoginWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblUsername = new JLabel("Username");
		contentPane.add(lblUsername);
		
		inputUsername = new JTextField(10);
		contentPane.add(inputUsername);
		
		JLabel lblPassword = new JLabel("Password");
		contentPane.add(lblPassword);
		
		inputPassword = new JPasswordField(10);
		contentPane.add(inputPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				authenticate();
			}
		});
		contentPane.add(btnLogin);
	}

	public void authenticate() {
		LoginData[] loginData = Database.getLoginData("SELECT * FROM benutzer ORDER BY benutzer.USER_ID");
		
		String username = inputUsername.getText().trim();
		String password = new String(inputPassword.getPassword()).trim();
		
		// Check if empty
		if (username.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please fill in all fields.");
			return;
		}
		
		// Check against existing credentials
		for (LoginData entry : loginData) {
			if (username.equals(entry.getUserId()) && password.equals(entry.getPassword())) {
				// Continue dialog
				MainWindow mainWindow = new MainWindow();
				mainWindow.setVisible(true);
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Invalid username or password");
			}
		}
	}
}
