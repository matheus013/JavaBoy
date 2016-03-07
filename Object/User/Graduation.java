package Object.User;

public class Graduation extends Student {
	public Graduation(int id, String name, String email, String address) {
		super(id, name, email, address);
		numberProjects = 0;
	}

	private int numberProjects;

	public int getNumberProjects() {
		return numberProjects;
	}

	public Boolean addProject() {
		if (numberProjects == 2)
			return false;
		
		return true;
	}

}
