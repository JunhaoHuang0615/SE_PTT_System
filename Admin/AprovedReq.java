package Admin;

import java.io.PrintStream;

public class AprovedReq {
	
	private int RID;
	private int ClassID;
	private int teacherNum;
	private int status;
	
	public AprovedReq(int rid, int cid, int teacherNum) {
		this.RID = rid;
		this.ClassID = cid;
		this.teacherNum = teacherNum;
		this.status = 2;
	}

	public int getRID() {
		return RID;
	}

	public int getClassID() {
		return ClassID;
	}

	public int getStatus() {
		return status;
	}

	public int getTeacherNum() {
		return teacherNum;
	}
	
	public void print(PrintStream ps) {
		ps.print(RID + " " + ClassID + " " + teacherNum);
	}
	

}
