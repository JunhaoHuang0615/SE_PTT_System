package Model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriterToFile {

	private BufferedWriter writer;
	private File file;
	
	public WriterToFile(String url) {
		file = new File(url);
		try {
			writer = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeToFile() {
		try {
		    writer.append("Teacher");
		    addTeacher(List_Of_Teacher.getInstance().getTeacherList());
		    writer.append("\nClass");
		    addClass(List_Of_Class.getInstance().getClassList());
		    writer.append("\nRequest");
		    addRequest(List_Of_Request.getInstance().getRequests());
		    writer.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				writer.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void addTeacher(ArrayList<Teacher> LoT) {
		for(Teacher t : LoT) {
			try {
				writer.append("\n"+t.toWriter());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public void addClass(ArrayList<Class> LoC) {
		for(Class c : LoC) {
			try {
				writer.append("\n"+c.toWriter());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void addRequest(ArrayList<Request> LoR) {
		for(Request r : LoR) {
			try {
				writer.append("\n"+r.toWriter());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
		
}
