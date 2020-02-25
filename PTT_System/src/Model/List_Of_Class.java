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
	
	//get Class by class id
	public Class getRequest(int classID) {
		
		return classList.get(classID);
	}

    public void add(Class c) {
        for (Class c1 : classList) {
            if (c1.getClassID() == c.getClassID()) {
                return;
            }
        }
        classList.add(c);
    }

    public void remove(int classID){
        for(Class c : classList){
            if (c.getClassID() == classID){
                classList.remove(c);
                return;
            }
        }
    }

    public void remove(Class c) {
        for (Class c1 : classList) {
            if (c1.getClassID() == c.getClassID()) {
                classList.remove(c);
            }
        }
    }

}
