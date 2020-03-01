package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AprovedReqTester {

    @Test
    public void test() {
        for (int i = 0; i < 1000; ++i) { 
            int classID = i;
            int rID = i;
            int teacherNum = i;
            AprovedReq req = new AprovedReq(classID, rID, teacherNum);
            assertEquals(classID, req.getClassID());
            assertEquals(rID, req.getRID());
            assertEquals(teacherNum, req.getTeacherNum());
        }

    }
}
