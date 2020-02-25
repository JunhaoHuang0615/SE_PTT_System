package Model;

import java.io.PrintStream;

public class Teacher {
	
	private int teacherID;
	private String name;
	private String skill;
	private String avaliableTime;
//	private int responsedClass;
	
	public Teacher(int teacherID,String name,String skill,String avaliableTime) {
		
		this.teacherID = teacherID;
		this.name = name;
		this.skill = skill;
		this.avaliableTime = avaliableTime;
//		this.responsedClass = null;
		
	}

	public int getTeacherID() {
		return teacherID;
	}

	public String getName() {
		return name;
	}

	public String getSkill() {
		return skill;
	}

	public String getAvaliableTime() {
		return avaliableTime;
	}
	
	public void print(PrintStream ps) {
		ps.print(teacherID + " " + name + " " + skill + " " + avaliableTime + "\n");
	}
	
	
}
