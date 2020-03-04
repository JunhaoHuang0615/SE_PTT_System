package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class List_Of_TeacherTester {

    @Test
    public void test() {
        assertNotNull(List_Of_Teacher.getInstance());
        assertNotNull(List_Of_Teacher.getInstance().getTeacherList());

        Teacher t1 = new Teacher("name1", "skill1", "time1");
        Teacher t2 = new Teacher("name2", "skill2", "time2");
        List_Of_Teacher.getInstance().add(t1);
        List_Of_Teacher.getInstance().add(t2);
        assertEquals("0 name1 skill1 time1\n1 name2 skill2 time2\n", List_Of_Teacher.getInstance().print());

        assertEquals(2, List_Of_Teacher.getInstance().getTeacherList().size());
        assertEquals(t1, List_Of_Teacher.getInstance().get(0));
        assertEquals(t2, List_Of_Teacher.getInstance().get(1));

        List_Of_Teacher.getInstance().remove(t1);
        // assertNull(List_Of_Teacher.getInstance().get(0));

        assertEquals(1, List_Of_Teacher.getInstance().getTeachersByRequest("skill2", "time2").size());
        assertEquals("1 name2 skill2 time2\n", List_Of_Teacher.getInstance().print());
    }
}
