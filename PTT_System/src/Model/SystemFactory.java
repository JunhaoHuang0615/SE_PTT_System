package Model;

public class SystemFactory {

	
	
	//============================================
	//=============== Method =====================
	//============================================
	
	//create Request
	
	public Class createClass(int classID,int numOfStudent) {
		
		return new Class(classID,numOfStudent);
		
	}
	
	public Request createRequest(int numOfTeacher, int classId, String requiredSkill) {
		
		return new Request(numOfTeacher,classId,requiredSkill);
		
	}
	
	public Teacher createTeacher(int teacherID,String name,String skill,String avaliableTime) {
		
		return new Teacher(teacherID,name,skill,avaliableTime);
		
	}
	
	public User createUser(int userType,String name) {
		if(userType == 1) {
			return new Class_Director(name);
		}
		else if(userType == 2){
			return new PTT_Director(name);
		}
		else if(userType == 3) {
			return new Admin(name);
		}
		return null;
	}
}
