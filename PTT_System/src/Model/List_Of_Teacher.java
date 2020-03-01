package Model;

import java.util.ArrayList;

public class List_Of_Teacher {
	
	private ArrayList<Teacher> lot = new ArrayList<Teacher>();
	
	//============================================
	//=============== Singleton Pattern ================
	//============================================
	
	private List_Of_Teacher(){};
	
	private static List_Of_Teacher instance = new List_Of_Teacher(); 
	
	public static List_Of_Teacher getInstance(){
		return instance;
	}
	

	public void add(Teacher t) {
		lot.add(t);
		System.out.println("New Teacher added to list!");
	}
	
	public void remove(Teacher t) {
		lot.remove(t);
	}
	
	public Teacher get(int teacherID) {
		return lot.get(teacherID);
	}
	
	public ArrayList<Teacher> getTeachersByRequest(String skill, String avaliableTime){
		ArrayList<Teacher> lor = new ArrayList<Teacher>();
		for(Teacher t : lot) {
			if(t.getSkill().equals(skill)&&t.getAvaliableTime().equals(avaliableTime))
			lor.add(t);
		}
		return lor;
	}
	
	public String print() {
		String printList;
		printList = "";
		for(Teacher t : lot) {
			printList += t.getTeacherID() + " " + t.getName() + " " + t.getSkill() + " " + t.getAvaliableTime() + "\n";
		}
		return printList;
	}


	public ArrayList<Teacher> getTeacherList() {
		return lot;
	}
	
	
	
	}