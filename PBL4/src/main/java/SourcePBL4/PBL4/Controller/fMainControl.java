
package SourcePBL4.PBL4.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;

import javax.swing.*;

import SourcePBL4.PBL4.Database.FileInfor;
import SourcePBL4.PBL4.GUI.fMain;

public class fMainControl implements ActionListener{
	public fMain f;
	
	public fMainControl(fMain f) {
		this.f = f;
	}
	
	public void actionPerformed(ActionEvent e) {
		File currentFile = new File("D:");
		JFileChooser f = new JFileChooser();
		f.setCurrentDirectory(currentFile);
		int result = f.showOpenDialog(new JFrame());
		if(result == JFileChooser.APPROVE_OPTION) {
			FileInfor infor = new FileInfor();
			File fileChoose = f.getSelectedFile();
			String fileName = fileChoose.getName();
			String fileExten = getFileExtension(fileName);
			String fileType = infor.getFileType(fileExten);
			Date d = new Date();
			Object[] row = { fileName, d.toString(), fileType, fileType };
			this.f.dftable.addRow(row);
		}
	}
	public String getFileExtension(String FileName) {
		String extens = FileName.substring(FileName.indexOf('.') + 1);
		return extens;
	}
}
