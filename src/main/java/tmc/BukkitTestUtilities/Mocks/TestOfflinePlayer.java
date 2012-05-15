package tmc.BukkitTestUtilities.Mocks;// Created by cyrus on 5/15/12 at 4:06 PM

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.Map;

public class TestOfflinePlayer implements OfflinePlayer {
    private boolean isOp = false;
    private boolean hasPlayedBefore = false;
    private boolean whitelisted = false;
    private boolean banned = false;
    private boolean online = false;
    private long lastPlayed = 0;
    private long firstPlayed = 0;
    private String name = "A Player";
    private Player player = new TestPlayer(name);

    @Override
    public boolean isOnline() {
        return online;
    }

    public void setIsOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    @Override
    public boolean isBanned() {
        return banned;
    }

    @Override
    public void setBanned(boolean b) {
        banned = b;
    }

    @Override
    public boolean isWhitelisted() {
        return whitelisted;
    }

    @Override
    public void setWhitelisted(boolean b) {
        whitelisted = b;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public long getFirstPlayed() {
        return firstPlayed;
    }

    public void setFirstPlayed(long firstPlayed) {
        this.firstPlayed = firstPlayed;
    }

    @Override
    public long getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(long lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    @Override
    public boolean hasPlayedBefore() {
        return hasPlayedBefore;
    }

    public void setHasPlayedBefore(boolean playedBefore) {
        hasPlayedBefore = playedBefore;
    }

    @Override
    public Location getBedSpawnLocation() {
        return null; 
    }

    @Override
    public Map<String, Object> serialize() {
        return null; 
    }

    @Override
    public boolean isOp() {
        return isOp; 
    }

    @Override
    public void setOp(boolean b) {
        isOp = b;
    }
}
