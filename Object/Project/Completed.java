package Object.Project;

import java.util.LinkedList;

import Object.User.User;

public class Completed extends Project {
	public Completed(String start, String name, String end, String funding, double fund, String objective, String info,
			LinkedList<User> participants) {
		super(start, name, end, funding, fund, objective, info, participants);
		// TODO Auto-generated constructor stub
	}

	private int teacherId;


	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "Completed";
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

}
