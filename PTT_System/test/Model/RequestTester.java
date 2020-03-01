package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RequestTester {

    @Test
    public void test() {
        int numOfTeacher = 5;
        int classId = 1;
        int flag = 0;
        String requiredSkill = "skill1";
        String requiredTime = "time1";

        Request request = SystemFactory.createRequest(numOfTeacher, classId, flag, requiredSkill, requiredTime);
        assertEquals(numOfTeacher, request.getNumOfTeacher());

        assertNotEquals(-1, request.getRequestId());

        request.setNumOfTeacher(2);
        assertEquals(2, request.getNumOfTeacher());

        assertEquals(flag, request.getFlag());
        assertEquals(classId, request.getClassId());

        assertEquals(requiredSkill, request.getRequiredSkill());

        request.requestAccepted();
        assertEquals(1, request.getFlag());

        request.requestRejected();
        assertEquals(2, request.getFlag());

        assertEquals("2 1 2 skill1 time1", request.toWriter());
        request.showDetails();

        request.showUPDetails();

        System.out.println(request.toString());
    }
}
