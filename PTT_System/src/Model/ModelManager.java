package Model;

public class ModelManager {
	
	private Admin admin;
	private PTT_Director pttDirector;
	private Class_Director class_Director;
	
	public ModelManager(Admin admin, PTT_Director pttDirector, Class_Director class_Director) {
		this.admin = admin;
		this.pttDirector = pttDirector;
		this.class_Director = class_Director;
	}

	public Admin getAdmin() {
		return admin;
	}

	public PTT_Director getPttDirector() {
		return pttDirector;
	}

	public Class_Director getClass_Director() {
		return class_Director;
	}
	
	
	
	

}
