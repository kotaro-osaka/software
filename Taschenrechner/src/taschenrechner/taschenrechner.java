package taschenrechner;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Taschenrechner {

	private JFrame frame = new JFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taschenrechner window = new Taschenrechner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Taschenrechner() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		topPanel.setBackground(Color.GRAY);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setSize(new Dimension(10, 10));
		bottomPanel.setBackground(Color.BLACK);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topPanel, bottomPanel);
		GridBagLayout gbl_bottomPanel = new GridBagLayout();
		gbl_bottomPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_bottomPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_bottomPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_bottomPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		bottomPanel.setLayout(gbl_bottomPanel);
		
		JButton btnNewButton = new JButton("C");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		bottomPanel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 2;
		gbc_btnNewButton_4.gridy = 0;
		bottomPanel.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("÷");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 3;
		gbc_btnNewButton_8.gridy = 0;
		bottomPanel.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_1 = new JButton("7");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		bottomPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 1;
		bottomPanel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 1;
		bottomPanel.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_9 = new JButton("×");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_9.gridx = 3;
		gbc_btnNewButton_9.gridy = 1;
		bottomPanel.add(btnNewButton_9, gbc_btnNewButton_9);
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 2;
		bottomPanel.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 1;
		gbc_btnNewButton_6.gridy = 2;
		bottomPanel.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_7.gridx = 2;
		gbc_btnNewButton_7.gridy = 2;
		bottomPanel.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("-");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_10.gridx = 3;
		gbc_btnNewButton_10.gridy = 2;
		bottomPanel.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("1");
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 0;
		gbc_btnNewButton_11.gridy = 3;
		bottomPanel.add(btnNewButton_11, gbc_btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 1;
		gbc_btnNewButton_12.gridy = 3;
		bottomPanel.add(btnNewButton_12, gbc_btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_13.gridx = 2;
		gbc_btnNewButton_13.gridy = 3;
		bottomPanel.add(btnNewButton_13, gbc_btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("+");
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_14.gridx = 3;
		gbc_btnNewButton_14.gridy = 3;
		bottomPanel.add(btnNewButton_14, gbc_btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_15.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_15.gridx = 0;
		gbc_btnNewButton_15.gridy = 4;
		bottomPanel.add(btnNewButton_15, gbc_btnNewButton_15);
		
		JButton btnNewButton_18 = new JButton(",");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
		gbc_btnNewButton_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_18.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_18.gridx = 1;
		gbc_btnNewButton_18.gridy = 4;
		bottomPanel.add(btnNewButton_18, gbc_btnNewButton_18);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
		gbc_btnNewButton_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_16.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_16.gridx = 2;
		gbc_btnNewButton_16.gridy = 4;
		bottomPanel.add(btnNewButton_16, gbc_btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("=");
		btnNewButton_17.setBackground(Color.ORANGE);
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_17.gridx = 3;
		gbc_btnNewButton_17.gridy = 4;
		bottomPanel.add(btnNewButton_17, gbc_btnNewButton_17);
		topPanel.setLayout(new BorderLayout());
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		topPanel.add(lblNewLabel);
		splitPane.setDividerLocation(100);
		splitPane.setResizeWeight(0.5);
		splitPane.setDividerSize(0);
		splitPane.setBorder(null);
		
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
	}
}