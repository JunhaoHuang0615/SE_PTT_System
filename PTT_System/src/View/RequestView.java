package View;

import Model.Request;

public class RequestView {
	
	//============================================
	//=============== Attributes ================
	//============================================
	
	
	Request request;
	
	//============================================
	//=============== Constructor ================
	//============================================
	
	public RequestView(Request request) {
		
		this.request = request;
		
	}
	
	//============================================
	//=============== Method =====================
	//============================================
	
	public String showDetails() {
		String outcome = "";
		outcome += "RequestID: " + request.getRequestId() + "\n";
		outcome += "Number_of_Teacher: " + request.getNumOfTeacher() + "\n";
		outcome += "Status: ";
		if(request.getFlag() == 0) {
			outcome += "undisposed";
		}
		else if(request.getFlag() == 1) {
			outcome += "accepted";
		}
		else if(request.getFlag() == 2) {
			outcome += "rejected";
		}
		return outcome;
	}
}
