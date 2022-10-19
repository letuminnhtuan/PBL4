package SourcePBL4.PBL4.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import SourcePBL4.PBL4.GUI.fLoginClient;

public class LoginClientCtrl implements ActionListener{
	public fLoginClient f;
	public LoginClientCtrl(fLoginClient f) {
		this.f = f;
	}
	public void actionPerformed(ActionEvent e) {
		if(LogIn()) {
			try {
				f.socket = new Socket("localhost", 9999);
				System.out.println("asd");
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public boolean LogIn() {
		String username = f.txtUsername.getText();
		String password = f.txtPassword.getText();
		if(username.equals("abc") && password.equals("abc")) {
			return true;
		}
		else return false;
	}
}
