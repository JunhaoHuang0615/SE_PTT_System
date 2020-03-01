package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class List_Of_ClassTester {

    @Test
    public void test(){
        assertNotNull(List_Of_Class.getInstance());
        assertNotNull(List_Of_Class.getInstance().getClassList());

        Class c1 = new Class(1, 1);
        Class c2 = new Class(2, 2);
        List_Of_Class.getInstance().add(c1);
        List_Of_Class.getInstance().add(c1);
        List_Of_Class.getInstance().add(c2);
        assertEquals(2, List_Of_Class.getInstance().getClassList().size());

        assertEquals(c1, List_Of_Class.getInstance().getRequest(0));
        assertEquals(c2, List_Of_Class.getInstance().getRequest(1));

        List_Of_Class.getInstance().remove(c1);
        // assertNull(List_Of_Class.getInstance().getRequest(0));
        assertEquals(1, List_Of_Class.getInstance().getClassList().size());

        List_Of_Class.getInstance().remove(2);
        assertEquals(0, List_Of_Class.getInstance().getClassList().size());
        // assertNull(List_Of_Class.getInstance().getRequest(0));
    }
}
