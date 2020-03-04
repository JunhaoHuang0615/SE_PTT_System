package Model;

import java.io.PrintStream;
import java.util.ArrayList;

public class ApprovedReqList {

    private ArrayList<AprovedReq> listOfAprovedReq = new ArrayList<AprovedReq>();

    public void add(AprovedReq ar) {
        listOfAprovedReq.add(ar);
    }

    public void remove(AprovedReq ar) {
        listOfAprovedReq.remove(ar);
    }

    public AprovedReq get(int index) {
        return listOfAprovedReq.get(index);
    }

    public ArrayList<AprovedReq> getList() {
        return listOfAprovedReq;
    }

    public AprovedReq findByClassID(int ClassID) {
        for (AprovedReq ar : listOfAprovedReq) {
            if (ar.getClassID() == ClassID) ;
            return ar;
        }
        return null;
    }

    public int NumOfReq() {
        return listOfAprovedReq.size();
    }


    public void printList(PrintStream ps) {
        String arList = "";
        arList += "List of aproved requirment";
        for (AprovedReq ar : listOfAprovedReq) {
            arList += ar.getRID() + " " + ar.getClassID() + " " + ar.getTeacherNum() + "\n";
        }
        ps.print(arList);
    }

}
