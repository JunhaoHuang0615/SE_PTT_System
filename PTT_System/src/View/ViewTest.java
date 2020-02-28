package View;
import Model.ReaderFromFile;

public class ViewTest {
 
	public static void main(String[] args) {
		
		ReaderFromFile reader = new ReaderFromFile("database.txt");
		reader.readFromFile();
		
		SystemWindow sw = new SystemWindow();
		sw.getInnerPanel().showPDV();
	}
}
