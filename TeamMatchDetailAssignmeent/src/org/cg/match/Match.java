package org.cg.match;

import org.cg.team.Team;

public class Match {
	
	private String  date;
	private Team teamone;
	private Team teamtwo;
	
	private String venue;
	private Team team;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Team getTeamone() {
		return teamone;
	}
	public void setTeamone(Team teamone) {
		this.teamone = teamone;
	}
	public Team getTeamtwo() {
		return teamtwo;
	}
	public void setTeamtwo(Team teamtwo) {
		this.teamtwo = teamtwo;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Match(String date, Team teamone, Team teamtwo, String venue) {
		super();
		this.date = date;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
		this.venue = venue;
		
	}
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Match [date=" + date + ", teamone=" + teamone + ", teamtwo=" + teamtwo + ", venue=" + venue + ", team="
				+ team + "]";
	}
	
	


}
