package Object.Project;

import java.util.LinkedList;

import Object.User.User;

public class InPreparation extends Project{



	public InPreparation(String start, String name, String end, String funding, double fund, String objective,
			String info, LinkedList<User> participants) {
		super(start, name, end, funding, fund, objective, info, participants);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "In Preparation";
	}

}
