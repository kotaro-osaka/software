package favoritenliste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginWindow extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputUsername;
	private JPasswordField inputPassword;
	public 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow frame = new LoginWindow(null);
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
	public LoginWindow(JFrame parent) {
		super(parent, "Login", true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

	private void authenticate() {		
		String username = inputUsername.getText().trim();
		String password = new String(inputPassword.getPassword()).trim();
		
		// Check if empty
		if (username.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please fill in all fields.");
			inputUsername.setText("");
			inputPassword.setText("");
			return;
		}
		
		// Check whether user exists
		if (Database.userExists(username, password, MainWindow.sqliteSelected())) {
			loginSuccess = true;
			dispose();			
		} else {
			JOptionPane.showMessageDialog(null, "Invalid username or password");
			inputUsername.setText("");
			inputPassword.setText("");
		}
	}
}
