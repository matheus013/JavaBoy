package Util;

import java.util.LinkedList;

import Object.Project.Completed;
import Object.Project.InPreparation;
import Object.Project.InProcess;
import Object.Project.Project;
import Object.User.Graduate;
import Object.User.Graduation;
import Object.User.Teacher;
import Object.User.User;
import Post.Post;

public class Util {
	public void showU(LinkedList<User> users) {
		for (User user : users) {
			System.out.println(user.getId() + " - " + user.getName());
		}
	}

	public void showU(LinkedList<User> users, LinkedList<User> comp) {
		for (User user : users) {
			if (!comp.contains(user))
				System.out.println(user.getId() + " - " + user.getName());
		}
	}

	public void showU(LinkedList<User> users, StateUser state) {
		for (User user : users) {
			switch (state) {
			case TEACHER:
				if (user instanceof Teacher)
					System.out.println(user.getId() + " - " + user.getName());
				break;
			case GRADUATE:
				if (user instanceof Graduate)
					System.out.println(user.getId() + " - " + user.getName());
				break;
			case GRADUATION:
				if (user instanceof Graduation)
					System.out.println(user.getId() + " - " + user.getName());
				break;
			}
		}
	}

	public void showP(LinkedList<Project> projects) {
		for (Project project : projects) {
			System.out.println(project.getId() + " - " + project.getName());
		}
	}

	public void showP(LinkedList<Project> projects, StateProject state) {
		for (Project project : projects) {

			switch (state) {
			case COMPLETED:
				if (project instanceof Completed)
					System.out.println(project.getId() + " - " + project.getName());
				break;
			case INPREPARATION:
				if (project instanceof InPreparation)
					System.out.println(project.getId() + " - " + project.getName());
				break;
			case INPROCESS:
				if (project instanceof InProcess)
					System.out.println(project.getId() + " - " + project.getName());
				break;
			}
		}
	}

	public int countPosts(LinkedList<Post> posts, int id) {
		int count = 0;
		for (Post post : posts) {
			if (post.getIdProject() == id)
				count++;
		}
		return count;
	}

	private void getPosts(LinkedList<Post> posts, int id) {
		for (Post post : posts) {
			if (post.getIdAuthor() == id)
				System.out.println(post.getContent());
		}
	}
	private void getProject(User user, LinkedList<Project> comp) {
		for (Project project : comp) {
			if (project.getParticipants().contains(user))
				System.out.println(project.getId() + " - " + project.getName());
		}
	}
	public void consult(User user, LinkedList<Post> posts, LinkedList<Project> projects) {
		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Address: " + user.getAddress());
		System.out.println("My Posts");
		getPosts(posts, user.getId());
		System.out.println("My Projects");
		getProject(user, projects);

	}
}
