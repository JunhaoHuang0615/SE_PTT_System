package Model;

public class Class {

    private int classID;
    private int numOfStudent;

    public Class(int classID, int numOfStudent) {
        this.classID = classID;
        this.numOfStudent = numOfStudent;
    }
    
    public String toWriter() {
    	return classID+" "+numOfStudent;
    }

    public int getClassID() {
        return classID;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    @Override
    public String toString() {
    	return "class ID: " + classID;
    }
}
