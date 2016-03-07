package Object.Project;

import java.util.LinkedList;
import Object.User.User;

public abstract class Project {
	private int id;
	private String start;
	private String name;
	private String end;
	private String funding;
	private double fund;
	private String objective;
	private String info;
	private LinkedList<User> participants;


	public Project(String start, String name, String end, String funding, double fund, String objective, String info,
			LinkedList<User> participants) {
		super();
		this.start = start;
		this.setName(name);
		this.end = end;
		this.funding = funding;
		this.fund = fund;
		this.objective = objective;
		this.info = info;
		this.participants = participants;
	}

	public abstract String state();

	public void add(User user) {
		participants.add(user);
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	public double getFund() {
		return fund;
	}

	public void setFund(double fund) {
		this.fund = fund;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public LinkedList<User> getParticipants() {
		return participants;
	}

	public void setParticipants(LinkedList<User> participants) {
		this.participants = participants;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
