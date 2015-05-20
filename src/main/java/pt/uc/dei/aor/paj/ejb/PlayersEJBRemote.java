package pt.uc.dei.aor.paj.ejb;


import java.util.List;

import javax.ejb.Remote;

import pt.uc.dei.aor.paj.data.Player;


@Remote
public interface PlayersEJBRemote {
	public void populate();
	public List<Player> playersTallerThan(float threshold);
}
