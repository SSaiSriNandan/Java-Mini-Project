import javax.swing.JFileChooser;

public class GetFile {
	JFileChooser FileChooser = new JFileChooser();
		
	public String PickMe() throws Exception {
		
		if(FileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ) {
			
			java.io.File file = FileChooser.getSelectedFile();
			
			//System.out.println(file);
			String location = file.getPath();
			return(location);
		}
		else {
			//System.out.println("nope");
			return("nope");
		}
	}
}
