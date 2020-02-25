package Model;

import java.util.ArrayList;

public class List_Of_Class {
	
	// This class will satisfied with Singleton Pattern
	//============================================
	//=============== Attributes ================
	//============================================
	
	private ArrayList<Class> classList = new ArrayList<Class>();
	
	
	//============================================
	//=============== Singleton Pattern ================
	//============================================
	
	private List_Of_Class() {};
	
	public static List_Of_Class getInstance(){
	      return instance;
	   }
	private static List_Of_Class instance = new List_Of_Class(); 
	
	//============================================
	//=============== Method =====================
	//============================================
	public void addToList(Class class1) {
		classList.add(class1);
	}
	
	//remove from list by class object
	
	public void removeFromList(Class class1) {
		
		classList.remove(class1);
		
	}
	
	//remove from list by request id
	public void removeFromList(int classID) {
		
		classList.remove(classID);
		
	}
	
	//get Class by class id
	public Class getRequest(int classID) {
		
		return classList.get(classID);
	}

	public ArrayList<Class> getClassList() {
		return classList;
	}
	
	
	
	

}
