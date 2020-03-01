package View;
import Controller.Controller;
import Model.ReaderFromFile;

public class ViewTest {
 
	public static void main(String[] args) {
		
		ReaderFromFile reader = new ReaderFromFile("database.txt");
		reader.readFromFile();
		
		
		SystemWindow sw = new SystemWindow();
		Controller.getController().setView(sw);
		sw.getInnerPanel().showPDV();
	}
}
