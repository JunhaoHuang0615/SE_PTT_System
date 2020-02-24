package Admin;

public class Test {
	
	public static void main(String args[]) {
		
		AprovedReq ar1 = new AprovedReq(1,1,33);
		AprovedReq ar2 = new AprovedReq(2,2,35);
		AprovedReq ar3 = new AprovedReq(3,3,54);
		AprovedReq ar4 = new AprovedReq(4,4,39);
		
		ApprovedReqList arl = new ApprovedReqList();
		arl.add(ar1);
		arl.add(ar2);
		arl.add(ar3);
		arl.add(ar4);
		
		Admin ad = new Admin("Administrator");
		ad.check(arl);
		}

}
