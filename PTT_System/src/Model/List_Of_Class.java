package Model;

import java.util.ArrayList;

public class List_Of_Class {
    private ArrayList<Class> classList;

    public List_Of_Class() {
        this.classList = new ArrayList<>();
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

    public Class get(int classID) {
        for (Class c : classList) {
            if (c.getClassID() == classID) {
                return c;
            }
        }
        return null;
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Here are " + classList.size() + " classes :");
        for (Class c : classList) {
            stringBuilder.append("\n");
            stringBuilder.append("classId :" + c.getClassID());
            stringBuilder.append("student num :" + c.getNumOfStudent());
        }
        return stringBuilder.toString();
    }
}
