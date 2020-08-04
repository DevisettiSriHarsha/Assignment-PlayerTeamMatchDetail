package org.cg.app;

import java.util.Scanner;

import org.cg.match.Match;
import org.cg.match.MatchBO;
import org.cg.player.Player;
import org.cg.player.PlayerBO;
import org.cg.team.Team;
import org.cg.team.TeamBO;

public class AppMain {

	public static void main(String[] args) {
		
		
		PlayerBO playerbo=new PlayerBO();
		TeamBO teambo=new TeamBO();
		MatchBO matchbo=new MatchBO();
		Scanner scanner=new Scanner(System.in);
		
		
		Player[] players=new Player[10];
		Team[] teams=new Team[10];
		Match[] matches =new Match[10];
		
		int playerCount=0;
		int teamCount=0;
		int matchCount=0;
		String option=null;
		
		System.out.println("enter the player count");
		int pcount=scanner.nextInt();
		for(int i=0,j=1;i<pcount;i++,j++) {
			System.out.println("enter "  +j+  " player details");
			String playerDetails=scanner.next();
			Player player=playerbo.createPlayer(playerDetails);
			players[playerCount]=player;
			playerCount++;
			System.out.println("player created" +player);
		}
		
		System.out.println("enter the Team count");
		int tcount=scanner.nextInt();
		for(int i=0,j=1;i<tcount;i++,j++) {
			System.out.println("enter " +j+ " team details");
			String teamdetails=scanner.next();
			Team team=teambo.createTeam(teamdetails, players);
			teams[teamCount]=team;
			teamCount++;
			System.out.println("team created"+team);
		}
		
		System.out.println("enter the match count");
		int mcount=scanner.nextInt();
		for(int i=0,j=1;i<mcount;i++,j++) {
			System.out.println("enter " +j+ " match details");
			String matchdetails=scanner.next();
			Match match=matchbo.createMatch(matchdetails, teams);
			matches[matchCount]=match;
			matchCount++;
			System.out.println("match created"+match);
		}
		
		do {
			System.out.println("1.Find Team ");
			System.out.println("2.Find All Matches In A Specific Venue ");
			int ch=scanner.nextInt();
			switch(ch){
			case 1:
				
				System.out.println("enter date");
				String matchDate=scanner.next();
				Team[] team = matchbo.findTeam(matchDate, matches);
				System.out.println("Teams : ");
				System.out.println(team[0].getName()+","+team[1].getName());
				break;
				
			case 2:
				
				System.out.println("Enter Team Name :");
				String teamName = scanner.next();
				matchbo.findAllMatchesOfTeam(teamName, matches);
				break;
				
			default:
				
				
				System.out.println("Invalid Input!!!");
				break;	
			}
			System.out.println("do you want to continue yes or no");
			option = scanner.next();
			
		}while(!option.equalsIgnoreCase("no"));
		
		System.out.println("exit");
	

	}

}
