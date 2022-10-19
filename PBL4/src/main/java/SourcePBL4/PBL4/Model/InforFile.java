package SourcePBL4.PBL4.Model;

import java.util.Date;

public class InforFile {
	public String FileName;
	public Date FileDate;
	public String FileType;
	public double FileSize;
	
	public InforFile(String fileName, Date fileDate, String fileType, double fileSize) {
		super();
		FileName = fileName;
		FileDate = fileDate;
		FileType = fileType;
		FileSize = fileSize;
	}
	
}
