package SourcePBL4.PBL4.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;

import SourcePBL4.PBL4.GUI.fLoginServer;

public class LoginServerCtrl implements ActionListener{
	public fLoginServer f;
	public LoginServerCtrl(fLoginServer f) {
		this.f = f;
	}
	public void actionPerformed(ActionEvent e) {
		if(LogIn()) {
			try {
				f.serverSocket = new ServerSocket(9999);
				f.socket = f.serverSocket.accept();
				System.out.println(f.socket.toString());
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
		if(username.equals("admin") && password.equals("admin")) {
			return true;
		}
		else return false;
	}
}
