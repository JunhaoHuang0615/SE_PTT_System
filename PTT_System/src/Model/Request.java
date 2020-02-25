package Model;

public class Request {
	//============================================
	//=============== Attributes ================
	//============================================
	private static int ID=0; // this will automatically increase when a request is generated.
	private int requestId;
	private int classId;
	private int numOfTeacher;
	private int flag = 0; //if the flag is 0, this means this request haven't been checked by PTT director
							// 1 means accepted
							// 2 means rejected
	private String requiredSkill;
	
	//============================================
	//=============== Constructor ================
	//============================================
	
	public Request(int numOfTeacher, int requestId) {
		
		this.numOfTeacher = numOfTeacher;
		this.requestId = requestId;
		ID++;
		
	}
	//if it doesn't pass id here, then it will automatically assigned
	public Request(int numOfTeacher, int classId, String requiredSkill) {
		this.requiredSkill = requiredSkill;
		this.numOfTeacher = numOfTeacher;
		this.requestId = ID;
		ID++;
		
	}
	
	//=======================================================
	//=============== Getter and Setter =====================
	//=======================================================
	
	
	public int getRequestId() {
		return requestId;
	}
	public int getNumOfTeacher() {
		return numOfTeacher;
	}
	public void setNumOfTeacher(int numOfTeacher) {
		this.numOfTeacher = numOfTeacher;
	}
	public int getFlag() {
		return flag;
	}
	public int getClassId() {
		return classId;
	}
	public String getRequiredSkill() {
		return requiredSkill;
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
	
	public String showDetails() {
		String outcome = "";
		outcome += "RequestID: " + requestId + "\n";
		outcome += "Number_of_Teacher: " + numOfTeacher + "\n";
		outcome += "Status: ";
		if(flag == 0) {
			outcome += "undisposed";
		}
		else if(flag == 1) {
			outcome += "accepted";
		}
		else if(flag == 2) {
			outcome += "rejected";
		}
		return outcome;
	}
	

}