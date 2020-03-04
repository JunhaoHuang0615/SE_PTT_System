package Model;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ApprovedReqListTester {

    @Test
    public void test() {
        ApprovedReqList list = new ApprovedReqList(); 
        AprovedReq req1 = new AprovedReq(1, 1, 1);
        AprovedReq req2 = new AprovedReq(2, 2, 2);

        list.add(req1);
        list.add(req2);

        assertEquals(req1, list.get(0));
        assertEquals(req2, list.get(1));

        assertEquals(2, list.getList().size());
        assertEquals(req1, list.findByClassID(1));

        assertEquals(2, list.NumOfReq());
        list.remove(req1);
        assertEquals(1, list.NumOfReq());

        list.printList(new PrintStream(System.out));
    }
}
