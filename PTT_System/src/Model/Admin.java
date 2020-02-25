package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    private int userType;

    public Admin(String name, int userType) {
        super(name);
        this.userType = userType;
    }

    public void check(List_Of_Request requestList) {

        Scanner s = new Scanner(System.in);
        ArrayList<Request> approvedList = requestList.getAcceptedList();

        if (approvedList.size() == 0) {
            System.out.println("Hi Admin, there are no Aproved Requirment.");
        } else {

            System.out.println("Hi Admin, there are " + approvedList.size() + " Aproved Requirment.");
            System.out.println("Please imput:\n1 to check by requestID\n2 to check by classID\n3 to check all\nPress Enter to confirm");
            int input = s.nextInt();
            s.nextLine();
            if (input == 1) {
                System.out.println("imput which requirment you wanna check 1 - " + approvedList.size());
                im = s.nextInt();
                s.nextLine();
                approvedList.get(im - 1).print(System.out);
                ;
            }
            if (input == 2) {
                System.out.println("imput ClassID");
                in = s.nextInt();
                s.nextLine();
                arl.findByClassID(in).print(System.out);
                ;
            }
            if (input == 3) {
                arl.printList(System.out);
            }

        }
    }


}
