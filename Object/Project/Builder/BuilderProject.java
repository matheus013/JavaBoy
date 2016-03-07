package Object.Project.Builder;

import java.util.LinkedList;
import java.util.Scanner;

import Object.Project.InPreparation;
import Object.Project.Project;
import Object.User.User;

public class BuilderProject {
	private Project project;
	private Scanner cin = new Scanner(System.in);

	public Project get(int id) {
		build(id);
		return project;
	}

	private void build(int id) {
		String name = cin.nextLine();
		String start = cin.nextLine();
		String end = cin.nextLine();
		String funding = cin.nextLine();
		double fund = cin.nextDouble();
		String objective = cin.nextLine();
		String info = cin.nextLine();
		project = new InPreparation(start, name, end, funding, fund, objective, info, new LinkedList<User>());
		project.setId(id);

	}
}
