package Model;

public class AprovedReq {

    private int classID;
    private int rID;
    private int teacherNum;

    public AprovedReq(int classID, int rID, int teacherNum) {
        this.classID = classID;
        this.rID = rID;
        this.teacherNum = teacherNum;
    }

    public int getClassID() {
        return classID;
    }

    public int getRID() {
        return rID;
    }

    public int getTeacherNum() {
        return teacherNum;
    }
}
