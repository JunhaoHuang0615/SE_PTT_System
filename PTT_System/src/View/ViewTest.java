package View;

import Model.List_Of_Class;
import Model.List_Of_Request;
import Model.Request;
import Model.SystemFactory;

public class ViewTest {
 
	public static void main(String[] args) {
		List_Of_Request.getInstance().addToList(SystemFactory.createRequest(13, 1, 0, "Math","Mon"));
		List_Of_Request.getInstance().addToList(SystemFactory.createRequest(15, 2, 0, "Math","Tue"));
		List_Of_Request.getInstance().addToList(SystemFactory.createRequest(13, 1, 0, "Math","Wed"));
		
		List_Of_Class.getInstance().add(SystemFactory.createClass(1, 20));
		List_Of_Class.getInstance().add(SystemFactory.createClass(1, 20));
		List_Of_Class.getInstance().add(SystemFactory.createClass(2, 40));
		
		SystemWindow sw = new SystemWindow();
		
		sw.getInnerPanel().showCDV();
	}
}
