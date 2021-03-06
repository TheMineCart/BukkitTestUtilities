package tmc.BukkitTestUtilities.Mocks;

import com.avaje.ebean.config.ServerConfig;
import org.apache.commons.lang.ArrayUtils;
import org.bukkit.*;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;

import java.io.File;
import java.util.*;
import java.util.logging.Logger;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.intersection;
import static com.google.common.collect.Sets.newHashSet;

public class TestServer implements Server {

    private String serverName = "Test Server";
    private boolean whitelist = false;

    Map<String, World> worlds = newHashMap();
    TestPlayer[] onlinePlayerArray = {};
    TestOfflinePlayer[] offlinePlayerArray = {};

    public void addWorld(World world) {
        worlds.put(world.getName(), world);
    }

    @Override
    public String getName() {
        return serverName;
    }

    public void setName(String name) {
        serverName = name;
    }

    @Override
    public String getVersion() {
        return null;  
    }

    @Override
    public String getBukkitVersion() {
        return null;  
    }

    @Override
    public Player[] getOnlinePlayers() {
        return onlinePlayerArray;
    }

    public void addOnlinePlayer(TestPlayer player) {
        onlinePlayerArray = (TestPlayer[]) ArrayUtils.addAll(onlinePlayerArray, new TestPlayer[]{player});
    }

    @Override
    public int getMaxPlayers() {
        return 0;  
    }

    @Override
    public int getPort() {
        return 0;  
    }

    @Override
    public int getViewDistance() {
        return 0;  
    }

    @Override
    public String getIp() {
        return null;  
    }

    @Override
    public String getServerName() {
        return serverName;
    }

    @Override
    public String getServerId() {
        return null;  
    }

    @Override
    public String getWorldType() {
        return null;  
    }

    @Override
    public boolean getGenerateStructures() {
        return false;  
    }

    @Override
    public boolean getAllowEnd() {
        return false;  
    }

    @Override
    public boolean getAllowNether() {
        return false;  
    }

    @Override
    public boolean hasWhitelist() {
        return whitelist;
    }

    @Override
    public void setWhitelist(boolean b) {
        whitelist = b;
    }

    @Override
    public Set<OfflinePlayer> getWhitelistedPlayers() {
        HashSet<OfflinePlayer> offlinePlayers = newHashSet();
        for(TestOfflinePlayer player : offlinePlayerArray) {
            if(player.isWhitelisted()) offlinePlayers.add(player);
        }
        return offlinePlayers;
    }

    @Override
    public void reloadWhitelist() {
        
    }

    @Override
    public int broadcastMessage(String s) {
        return 0;  
    }

    @Override
    public String getUpdateFolder() {
        return null;  
    }

    @Override
    public File getUpdateFolderFile() {
        return null;  
    }

    @Override
    public long getConnectionThrottle() {
        return 0;  
    }

    @Override
    public int getTicksPerAnimalSpawns() {
        return 0;  
    }

    @Override
    public int getTicksPerMonsterSpawns() {
        return 0;  
    }

    @Override
    public Player getPlayer(String s) {
        for(Player player: onlinePlayerArray) {
            if(player.getName().equals(s)){
                return player;
            }
        }
        return null;  
    }

    @Override
    public Player getPlayerExact(String s) {
        return getPlayer(s);
    }

    @Override
    public List<Player> matchPlayer(String s) {
        return null;  
    }

    @Override
    public PluginManager getPluginManager() {
        return null;  
    }

    @Override
    public BukkitScheduler getScheduler() {
        return null;  
    }

    @Override
    public ServicesManager getServicesManager() {
        return null;  
    }

    @Override
    public List<World> getWorlds() {
        return null;
    }

    @Override
    public World createWorld(WorldCreator worldCreator) {
        return null;
    }

    @Override
    public boolean unloadWorld(String s, boolean b) {
        return false;
    }

    @Override
    public boolean unloadWorld(World world, boolean b) {
        return false;
    }

    @Override
    public World getWorld(String s) {
        return worlds.get(s);
    }

    @Override
    public World getWorld(UUID uuid) {
        return null;
    }

    @Override
    public MapView getMap(short i) {
        return null;  
    }

    @Override
    public MapView createMap(World world) {
        return null;  
    }

    @Override
    public void reload() {
        
    }

    @Override
    public Logger getLogger() {
        return null;  
    }

    @Override
    public PluginCommand getPluginCommand(String s) {
        return null;  
    }

    @Override
    public void savePlayers() {
        
    }

    @Override
    public boolean dispatchCommand(CommandSender commandSender, String s) throws CommandException {
        return false;  
    }

    @Override
    public void configureDbConfig(ServerConfig serverConfig) {
        
    }

    @Override
    public boolean addRecipe(Recipe recipe) {
        return false;  
    }

    @Override
    public List<Recipe> getRecipesFor(ItemStack itemStack) {
        return null;  
    }

    @Override
    public Iterator<Recipe> recipeIterator() {
        return null;  
    }

    @Override
    public void clearRecipes() {
        
    }

    @Override
    public void resetRecipes() {
        
    }

    @Override
    public Map<String, String[]> getCommandAliases() {
        return null;  
    }

    @Override
    public int getSpawnRadius() {
        return 0;  
    }

    @Override
    public void setSpawnRadius(int i) {
        
    }

    @Override
    public boolean getOnlineMode() {
        return false;  
    }

    @Override
    public boolean getAllowFlight() {
        return false;  
    }

    @Override
    public boolean useExactLoginLocation() {
        return false;  
    }

    @Override
    public void shutdown() {
        
    }

    @Override
    public int broadcast(String s, String s1) {
        return 0;  
    }

    @Override
    public OfflinePlayer getOfflinePlayer(String s) {
        for(OfflinePlayer player : offlinePlayerArray) {
            if(player.getName().equals(s)) return player;
        }
        return null;  
    }

    public void addOfflinePlayer(OfflinePlayer player) {
        offlinePlayerArray = (TestOfflinePlayer[]) ArrayUtils.add(offlinePlayerArray, player);
    }

    @Override
    public Set<String> getIPBans() {
        return null;  
    }

    @Override
    public void banIP(String s) {
        
    }

    @Override
    public void unbanIP(String s) {
        
    }

    @Override
    public Set<OfflinePlayer> getBannedPlayers() {
        HashSet<OfflinePlayer> bannedPlayers = newHashSet();
        for(OfflinePlayer player : offlinePlayerArray) {
            if(player.isBanned()) bannedPlayers.add(player);
        }
        return bannedPlayers;
    }

    @Override
    public Set<OfflinePlayer> getOperators() {
        HashSet<OfflinePlayer> oppedPlayers = newHashSet();
        for(OfflinePlayer player : offlinePlayerArray) {
            if(player.isOp()) oppedPlayers.add(player);
        }
        return oppedPlayers;
    }

    @Override
    public GameMode getDefaultGameMode() {
        return null;  
    }

    @Override
    public void setDefaultGameMode(GameMode gameMode) {
        
    }

    @Override
    public ConsoleCommandSender getConsoleSender() {
        return null;  
    }

    @Override
    public File getWorldContainer() {
        return null;  
    }

    @Override
    public OfflinePlayer[] getOfflinePlayers() {
        return offlinePlayerArray;
    }

    @Override
    public Messenger getMessenger() {
        return null;  
    }

    @Override
    public HelpMap getHelpMap() {
        return null;  
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, InventoryType inventoryType) {
        return null;  
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i) {
        return null;  
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i, String s) {
        return null;  
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {
        
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return null;  
    }
}
