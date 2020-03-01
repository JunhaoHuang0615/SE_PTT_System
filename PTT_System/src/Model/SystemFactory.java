package Model;

public class SystemFactory {

	
	
	//============================================
	//=============== Method =====================
	//============================================
	
	//create Request
	
	public static Class createClass(int classID,int numOfStudent) {
		
		return new Class(classID,numOfStudent);
		
	}
	
	public static Request createRequest(int numOfTeacher, int classId,int flag ,String requiredSkill,String requiredTime) {
		
		return new Request(numOfTeacher,classId,flag,requiredSkill,requiredTime);
		
	}
	
	public static Teacher createTeacher(String name,String skill,String avaliableTime) {
		
		return new Teacher(name,skill,avaliableTime);
		
	}
	
}
