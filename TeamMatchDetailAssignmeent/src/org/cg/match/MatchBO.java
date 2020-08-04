package org.cg.match;

import org.cg.team.Team;

public class MatchBO {
	
	public Match createMatch(String data, Team[] teamList)
	{
		String[] matchDetail= data.split(",");
		Team t1=new Team();
		Team t2=new Team();
		for(Team team:teamList )
		{
			if(team.getName().equalsIgnoreCase(matchDetail[1])) {
				t1.setName(matchDetail[1]);
				break;
			}
		}
		for(Team team:teamList)
		{
			if(team.getName().equalsIgnoreCase(matchDetail[2]))
			{
				t2.setName(matchDetail[2]);
				break;
			}
		}
		
		Match match=new Match(matchDetail[0],t1,t2,matchDetail[3]);
		String matchOutput=String.format("%-15s %-15s %-15s %s", matchDetail[0],t1.getName(),t2.getName(),matchDetail[3]);
		System.out.println(matchOutput);
		
		return match;
		
	}
	public Team[] findTeam(String matchDate,Match[] matchList) {
		Team[] team =new Team[2];
		for(Match m : matchList) {
			if(m.getDate().equals(matchDate)) {
				team[0]=m.getTeamone();
				team[1]=m.getTeamtwo();
				return team;
			}
		}
		return team;
		
	}
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(Match match : matchList) {
			if(match.getTeamone().getName().equalsIgnoreCase(teamName) || match.getTeamtwo().getName().equalsIgnoreCase(teamName)) {
				System.out.println(match);
			}
		}
	}

}
