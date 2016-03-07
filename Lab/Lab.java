package Lab;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

import Builder.Builder;
import Object.Project.Completed;
import Object.Project.InProcess;
import Object.Project.Project;
import Object.User.Teacher;
import Object.User.User;
import Post.Post;
import Util.StateProject;
import Util.Util;

public class Lab {
	private LinkedList<User> users;
	private LinkedList<Project> projects;
	private LinkedList<Post> posts;
	private Scanner cin = new Scanner(System.in);
	Util util;

	public void add() throws Exception {
		System.out.println("1 - User\n2 - Project");
		int op = cin.nextInt();
		Builder builder = new Builder();
		switch (op) {
		case 1:
			users.add(builder.buildUser(users.size()));
			System.out.println("User added");
			break;

		case 2:
			projects.add(builder.buildProject(projects.size()));
			System.out.println("Project added");
			break;
		}
	}

	public void alloc() throws Exception {

		util.showP(projects, StateProject.INPREPARATION);

		System.out.println("Project:");
		int idProject = cin.nextInt();

		util.showU(users, projects.get(idProject).getParticipants());

		System.out.println("User:");
		int idUser = cin.nextInt();

		User u = users.get(idUser);
		projects.get(idProject).add(u);
		projects.set(idProject, (u instanceof Teacher) ? (InProcess) projects.get(idProject) : projects.get(idProject));
		System.out.println(projects.get(idProject).getName() + " in " + projects.get(idProject).state());
	}

	public void post() throws Exception {
		util.showP(projects, StateProject.INPROCESS);

		System.out.println("Project:");
		int idProject = cin.nextInt();

		util.showU(projects.get(idProject).getParticipants());

		int idUser = cin.nextInt();
		Calendar date = Calendar.getInstance();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		posts.add(new Post(idUser, idProject, formatter.format(date.getTime()), projects.get(idProject).getName()));
		System.out.println("Posted");
	}

	public void completeProject() throws Exception {
		util.showP(projects, StateProject.INPROCESS);
		System.out.println("Project: ");

		int id = cin.nextInt();

		if (util.countPosts(posts, id) < 1)
			System.out.println("It is not possible to complete project");
		else {
			Project p = projects.get(id);
			projects.set(id, (Completed) p);
			System.out.println("Project completed");
		}
	}

	public void consultUser() {
		System.out.println("user: ");
		util.showU(users);
		int idUser = cin.nextInt();
		util.consult(users.get(idUser), posts, projects);
	}
}
