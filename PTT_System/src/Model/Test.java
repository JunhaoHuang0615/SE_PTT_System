package Model;

public class Test {

	public static void main(String[] args) {
		ReaderFromFile reader = new ReaderFromFile("database.txt");
		reader.readFromFile();
		
	    Class_Director cd = (Class_Director)SystemFactory.createUser(1, "JJ");
	    cd.creatRequest(1, 3, "Game","Mon");
	    
		System.out.println(List_Of_Request.getInstance().getRequests().get(0).getClassId()+"-----------------------------------");
		
		WriterToFile writer = new WriterToFile("database.txt");
		writer.writeToFile();
	}
}
