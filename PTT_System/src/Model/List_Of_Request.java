package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class List_Of_Request implements Iterator<Request>,Iterable<Request>{
	
	//============================================
	//=============== Attributes ================
	//============================================
	
	private ArrayList<Request> requests = new ArrayList<Request>();

	private int pos = 0;
	
	//============================================
	//=============== Singleton Pattern ================
	//============================================
	
	private List_Of_Request(){};
	
	private static List_Of_Request instance = new List_Of_Request(); 
	
	public static List_Of_Request getInstance(){
		return instance;
	}
	
	//============================================
	//=============== Method =====================
	//============================================
	public void addToList(Request request) {
		System.out.println("Request :"+ request.getRequestId()+ " added to list ");
		requests.add(request);
	}
	
	//remove from list by request object
	
	public void removeFromList(Request request) {
		
		requests.remove(request);
		
	}
	
	//remove from list by request id
	public void removeFromList(int requestID) {
		
		requests.remove(requestID);
		
	}
	
	//get Request by request id
	public Request getRequest(int requestid) {
		
		return requests.get(requestid);
	}
	
	//get list
	public ArrayList<Request> getRequests() {
		return requests;
	}

	
	//return undisposed list
	
	public ArrayList<Request> getUndisposedList() {
		ArrayList<Request> ls = new ArrayList<Request>();
		
		for (Request request : requests) {
			if(request.getFlag()==0) {
				ls.add(request);
			}
			
		}
		return ls;
	}
	
	//return accepted list
	public ArrayList<Request> getAcceptedList() {
		ArrayList<Request> ls = new ArrayList<Request>();
		
		for (Request request : requests) {
			if(request.getFlag()==1) {
				ls.add(request);
			}
			
		}
		return ls;
	}
	
	//	return rejected list
	public ArrayList<Request> getRejectedList() {
		ArrayList<Request> ls = new ArrayList<Request>();
		
		for (Request request : requests) {
			if(request.getFlag()==2) {
				ls.add(request);
			}
			
		}
		return ls;
	}
	
	//=====================================================
	//====================For iterator====================
	//=====================================================
	@Override
	public boolean hasNext() {
		if(pos < requests.size()) {
			return true;
		}else {
			return false;
		}	
	}

	@Override
	public Request next() {
		return requests.get(pos++);
	}

	@Override
	public Iterator<Request> iterator() {
		return this;
	}
	
	//=====================================================
	//=====================================================
	
}
