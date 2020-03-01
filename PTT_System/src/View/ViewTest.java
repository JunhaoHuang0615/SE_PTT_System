

package View;

import java.io.FileNotFoundException;
import java.io.FileReader;

import Controller.Controller;
import Model.List_Of_Class;
import Model.List_Of_Request;
import Model.ModelManager;
import Model.ReaderFromFile;
import Model.Request;
import Model.SystemFactory;

public class ViewTest {
 
	public static void main(String[] args) {
//		List_Of_Request.getInstance().addToList(SystemFactory.createRequest(13, 1, 0, "Math","Mon"));
//		List_Of_Request.getInstance().addToList(SystemFactory.createRequest(15, 2, 0, "Math","Tue"));
//		List_Of_Request.getInstance().addToList(SystemFactory.createRequest(13, 1, 0, "Math","Wed"));
//		
//		List_Of_Class.getInstance().add(SystemFactory.createClass(1, 20));
//		List_Of_Class.getInstance().add(SystemFactory.createClass(1, 20));
//		List_Of_Class.getInstance().add(SystemFactory.createClass(2, 40));
		try {
			ReaderFromFile fr = new ReaderFromFile("ken.txt");
			fr.readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		SystemWindow sw = new SystemWindow();
		Controller.getController().setView(sw);
		sw.getInnerPanel().showLGV();
		//sw.getInnerPanel().showCDV();
	}
}

