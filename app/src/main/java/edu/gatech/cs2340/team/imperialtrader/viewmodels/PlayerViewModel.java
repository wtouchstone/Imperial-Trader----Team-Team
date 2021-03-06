package edu.gatech.cs2340.team.imperialtrader.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import edu.gatech.cs2340.team.imperialtrader.model.Model;
import edu.gatech.cs2340.team.imperialtrader.entity.Player;
import edu.gatech.cs2340.team.imperialtrader.model.PlayerInteractor;


/**
 * This ViewModel would support activities that need to interact with player
 */
public class PlayerViewModel extends AndroidViewModel {
    private final PlayerInteractor model;
    private final Player player;

    /**
     * Constructor for PlayerViewModel
     * @param application Application
     */
    public PlayerViewModel(@NonNull Application application) {
        super(application);
        model = Model.getInstance().getPlayerInteractor();
        player = model.getPlayer();
    }

    /**
     * Method to update a player
     * @param p Player
     */
    public void updatePlayer(Player p) {
        model.updatePlayer(p);
    }

    /**
     * Getter for a player
     * @return Player
     */
    public Player getPlayer() {
            return player;
    }
}
