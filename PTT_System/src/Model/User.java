package Model;

public abstract class User {
	
	
	protected String name;
	
	public User(String name) {
		this.name = name;
		
	}
	
	protected User() {
		
	}


    public String getName() {
        return name;
    }

}
