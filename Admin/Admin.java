package Admin;

import java.util.Scanner;

public class Admin {
	
	private String position;
	
	public Admin(String position) {
		this.position = position;
	}
	
	public void check(ApprovedReqList arl) {
		Scanner s = new Scanner(System.in);
		if(arl.NumOfReq() == 0) {
		System.out.println("Hi Admin, there are no Aproved Requirment.");
		}
		else {
			int imput;
			int im;
			int in;
			System.out.println("Hi Admin, there are " + arl.NumOfReq() + " Aproved Requirment.");
			System.out.println("Please imput:\n1 to check by order\n2 to check by class ID\n3 to check all\nPress Enter to confirm");
			imput = s.nextInt();
			s.nextLine();
			if(imput == 1) {
				System.out.println("imput which requirment you wanna check 1 - " + arl.NumOfReq());
				im = s.nextInt();
				s.nextLine();
				arl.get(im-1).print(System.out);;
			}
			if(imput == 2) {
				System.out.println("imput ClassID");
				in = s.nextInt();
				s.nextLine();
				arl.findByClassID(in).print(System.out);;
			}
			if(imput == 3) {
				arl.printList(System.out);
			}
			
		}
	}
	

}
