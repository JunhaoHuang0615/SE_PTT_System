package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTester {

    @Test
    public void testUser(){
        User user1 = Admin.getInstance();
        assertEquals("Administrator", user1.getName());

        User user2 = PTT_Director.getInstance();
        assertEquals("PTT_Director", user2.getName());

        User user3 =  Class_Director.getInstance();
        assertEquals("Class_Director", user3.getName());
    }

    @Test
    public void testAdmin(){
        Admin admin = Admin.getInstance();
        assertNotNull(admin.checkRequestList(List_Of_Request.getInstance()));
        assertNotNull(admin.checkTeacherList(List_Of_Teacher.getInstance()));
    }


    @Test
    public void testClassDirector(){
        Class_Director classDirector = Class_Director.getInstance();
        assertNotNull(classDirector.checkRequestList(List_Of_Request.getInstance()));

        int numOfTeacher = 5;
        int classId = 1;
        int flag = 0;
        String requiredSkill = "skill1";
        String requiredTime = "time1";

        Request request = SystemFactory.createRequest(numOfTeacher, classId, flag, requiredSkill, requiredTime);
        classDirector.addToList(request, List_Of_Request.getInstance());
        assertEquals(1, classDirector.checkRequestList(List_Of_Request.getInstance()).size());

        classDirector.createRequest(1,1,"skill1", "Mon");
    }

    @Test
    public void testPTTDirector(){
        PTT_Director pttDirector = PTT_Director.getInstance();

        assertNotNull(pttDirector.checkRequirement(List_Of_Request.getInstance()));
        assertNotNull(pttDirector.checkApproved(List_Of_Request.getInstance()));

        int numOfTeacher = 5;
        int classId = 1;
        int flag = 0;
        String requiredSkill = "skill1";
        String requiredTime = "time1";

        Request request = SystemFactory.createRequest(numOfTeacher, classId, flag, requiredSkill, requiredTime);
        pttDirector.acceptRequest(request);
        pttDirector.rejectRequest(request);
    }
}
