package Model;

public class SystemFactory {

	
	
	//============================================
	//=============== Method =====================
	//============================================
	
	//create Request
	
	public Request createRequest(int NumOfTeacher,int requestid) {
		
		return new Request(NumOfTeacher,requestid);
		
	}
	
	public Request createRequest(int NumOfTeacher) {
		
		return new Request(NumOfTeacher);
		
	}
	
	
	//create Request list
	public List_Of_Request createRequestList() {
		
		return new List_Of_Request();
	}
	
	
}
