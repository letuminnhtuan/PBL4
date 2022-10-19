package SourcePBL4.PBL4.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SourcePBL4.PBL4.Controller.LoginClientCtrl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.net.Socket;

import javax.swing.JButton;

public class fLoginClient extends JFrame {

	private JPanel contentPane;
	public JTextField txtUsername;
	public JTextField txtPassword;
	public Socket socket;
	public JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fLoginClient frame = new fLoginClient();
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
	public fLoginClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 168);
		setTitle("Client");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 120, 28);
		contentPane.add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setBounds(153, 10, 262, 28);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPassword.setColumns(10);
		txtPassword.setBounds(153, 48, 262, 28);
		contentPane.add(txtPassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(10, 48, 120, 28);
		contentPane.add(lblPassword);
		
		btnLogin = new JButton("Log in");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(295, 86, 120, 38);
		btnLogin.addActionListener(new LoginClientCtrl(this));
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(153, 86, 120, 38);
		contentPane.add(btnExit);
	}
}
