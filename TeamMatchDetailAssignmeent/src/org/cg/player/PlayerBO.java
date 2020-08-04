package org.cg.player;

public class PlayerBO {
	
	public Player createPlayer(String data)
	{
		String players[]=data.split(",");
		Player player=new Player(players[0],players[1],players[2]);
		return player;
	}

}
