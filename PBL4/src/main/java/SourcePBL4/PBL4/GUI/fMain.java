package SourcePBL4.PBL4.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SourcePBL4.PBL4.Controller.fMainControl;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class fMain extends JFrame {

	private JPanel contentPane;
	public JButton btnUploadFile;
	public JTable table;
	public DefaultTableModel dftable = new DefaultTableModel(new String[] {"Name", "Date", "Type", "Size"}, 0);
	public Object[] row;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fMain frame = new fMain();
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
	
	public fMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ActionListener ac = new fMainControl(this);
		
		btnUploadFile = new JButton("Choose file");
		btnUploadFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUploadFile.setBounds(710, 420, 119, 33);
		btnUploadFile.addActionListener(ac);
		contentPane.add(btnUploadFile);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(dftable);
		table.setBounds(10, 11, 819, 395);
		contentPane.add(table);
	}
}
