package View;


import java.util.ArrayList;

import Model.List_Of_Request;
import Model.Request;

public class RequestListView {
	//============================================
	//=============== Attributes ================
	//============================================
	
	
	List_Of_Request requests;
	
	//============================================
	//=============== Constructor ================
	//============================================
	
	public RequestListView(List_Of_Request requests) {
		
		this.requests = requests;
		
	}
	
	
	
	//============================================
	//=============== Method =====================
	//============================================
	
	public String showundisposedList() {
		String output = "";
		ArrayList<Request> ls = requests.getUndisposedList();
		for (Request request : ls) {
			output += "RequestID: "+ request.getRequestId() + "\n";
		}
		return output;
		
	}
	
	public String showAcceptedList() {
		String output = "";
		ArrayList<Request> ls = requests.getAcceptedList();
		for (Request request : ls) {
			output += "RequestID: "+ request.getRequestId() + "\n";
		}
		return output;
		
	}
	
	public String showRejectedList() {
		String output = "";
		ArrayList<Request> ls = requests.getRejectedList();
		for (Request request : ls) {
			output += "RequestID: "+ request.getRequestId() + "\n";
		}
		return output;
		
	}

}
