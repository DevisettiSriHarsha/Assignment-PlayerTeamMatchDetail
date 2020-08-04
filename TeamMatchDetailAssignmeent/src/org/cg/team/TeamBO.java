package org.cg.team;

import org.cg.player.Player;

public class TeamBO {
	
	public Team createTeam(String data,Player[] playerList)
	{
		String[] teamDetail=data.split(",");
		Player player=null;
		for(Player p:playerList) {
			if(p.getName().equals(teamDetail[1])) {
				player=p;
				break;
			}
		}
		Team team =new Team(teamDetail[0], player);
		return team;
	}

}
