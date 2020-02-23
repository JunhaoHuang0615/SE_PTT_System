package Model;

public class Request {
	//============================================
	//=============== Attributes ================
	//============================================
	private static int ID; // this will automatically increase when a request is generated.
	private int requestId;
	private int NumOfTeacher;
	private int flag = 0; //if the flag is 0, this means this request haven't been checked by PTT director
							// 1 means accepted
							// 2 means rejected
	
	
	//============================================
	//=============== Constructor ================
	//============================================
	
	public Request(int NumOfTeacher, int requestId) {
		
		this.NumOfTeacher = NumOfTeacher;
		this.requestId = requestId;
		ID++;
		
	}
	//if it doesn't pass id here, then it will automatically assigned
	public Request(int NumOfTeacher) {
		
		this.NumOfTeacher = NumOfTeacher;
		this.requestId = ID;
		ID++;
		
	}
	
	//=======================================================
	//=============== Getter and Setter =====================
	//=======================================================
	
	
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getNumOfTeacher() {
		return NumOfTeacher;
	}
	public void setNumOfTeacher(int numOfTeacher) {
		NumOfTeacher = numOfTeacher;
	}
	public int getFlag() {
		return flag;
	}
	
	
	//============================================
	//=============== Method =====================
	//============================================
	

	public void requestAccepted() {
		this.flag = 1;
	}
	
	public void requestRejected() {
		this.flag = 2;
	}
	

}
