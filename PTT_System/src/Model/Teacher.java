package Model;

import java.io.PrintStream;

public class Teacher {
	
	private static int ID;
	private int teacherID;
	private String name;
	private String skill;
	private String avaliableTime;
	private Request responsedClass;
	
	public Teacher(String name,String skill,String avaliableTime) {
		
		
		this.teacherID = ID;
		this.name = name;
		this.skill = skill;
		this.avaliableTime = avaliableTime;
		this.responsedClass = null;
		ID++;
		
	}
	
	public String toWriter() {
		return name+" "+skill+" "+avaliableTime;
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
