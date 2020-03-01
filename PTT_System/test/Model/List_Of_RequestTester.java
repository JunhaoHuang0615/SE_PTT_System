package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class List_Of_RequestTester {

    @Test
    public void test(){
        assertNotNull(List_Of_Request.getInstance());
        assertNotNull(List_Of_Request.getInstance().getRequests());

        Request request1 = new Request(1, 1, 1, "skill1", "time1");
        Request request2 = new Request(2, 2, 2, "skill2", "time2");

        List_Of_Request.getInstance().addToList(request1);
        List_Of_Request.getInstance().addToList(request2);
        assertEquals(2, List_Of_Request.getInstance().getRequests().size());
        assertEquals(0, List_Of_Request.getInstance().getUndisposedList().size()); 
        assertEquals(1, List_Of_Request.getInstance().getAcceptedList().size());
        assertEquals(1, List_Of_Request.getInstance().getRejectedList().size());

        assertEquals(request1, List_Of_Request.getInstance().getRequest(0));
        assertEquals(request2, List_Of_Request.getInstance().getRequest(1));

        List_Of_Request.getInstance().removeFromList(request1);
        assertEquals(1, List_Of_Request.getInstance().getRequests().size());
        List_Of_Request.getInstance().removeFromList(0);
        // assertEquals(, List_Of_Request.getInstance().getRequests().size());

        // List_Of_Request.getInstance().removeFromList(2);
    }

}
