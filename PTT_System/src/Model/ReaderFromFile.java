package Model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReaderFromFile {
	
	private BufferedReader reader;
	private File file;
	private String flag;

	public ReaderFromFile(String url) {
		
		file = new File(url);
		flag = "";
		
		
	}
	
	public void readFromFile() {
		try {
			String temp;
			reader = new BufferedReader(new FileReader(file));
			temp = reader.readLine();
			while(temp != null) {
				temp = setState(temp,reader);
				if(flag.equals("Request")) {
					if(temp!=null) {
						newRequest(temp);
					}
				}
				else if(flag.equals("Teacher")&&!temp.equals("Class")) {
					if(temp!=null) {
					newTeacher(temp);
					}
				}
				else if(flag.equals("Class")) {
					if(temp!=null) {
					newClass(temp);
					}
				}
				temp = reader.readLine();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				reader.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public String setState(String temp,BufferedReader reader) {
		try {
		if(temp.equals("Request")) {
			flag = temp;
			temp = reader.readLine();
		}
		else if(temp.equals("Teacher")) {
			flag = temp;
			temp = reader.readLine();
		}
		else if(temp.equals("Class")) {
			flag = temp;
			temp = reader.readLine();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	public void newRequest(String temp) {
		String[] split = temp.split(" ");
		Request r = SystemFactory.createRequest(Integer.parseInt(split[0]), Integer.parseInt(split[1]),Integer.parseInt(split[2]), split[3]);
		List_Of_Request.getInstance().addToList(r);
	}
	
	public void newTeacher(String temp) {
		String[] split = temp.split(" ");
		Teacher t = SystemFactory.createTeacher(split[0], split[1], split[2]);
		List_Of_Teacher.getInstance().add(t);
	}
	
	public void newClass(String temp) {
		String[] split = temp.split(" ");
		Class c = SystemFactory.createClass(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		List_Of_Class.getInstance().add(c);
	}
}