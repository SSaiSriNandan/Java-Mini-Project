import java.io.FileWriter;

import javax.swing.JFileChooser; 

public class NewFile {
	JFileChooser FileChooser = new JFileChooser();
	
	
	public String NewMe() throws Exception {
		
		
		if(FileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ) {
			//FileChooser.setFileFilter(new FileTypeFilter(".dir", "Folder"));
			java.io.File file = FileChooser.getSelectedFile();
			
			//System.out.println(file);
			String location = file.getPath();
			FileWriter fw=new FileWriter(location);    
	         fw.write("Welcome to javaTpoint.");    
	         fw.close();
			return(location);
		}
		else {
			//System.out.println("nope");
			System.out.println("Success...");
			return("nope");   
             
            
         
		}
	}
}
