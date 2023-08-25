package xyz.orbismc.TownyHOA;

import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;

public class TownyHOA extends JavaPlugin {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void onEnable() {
        System.out.println(ANSI_GREEN + "TownyHOA has been enabled!" + ANSI_RESET)
        HOAConfig.getInstance().load();
        if config.getBoolean("important.is-disabled")
            public void onDisable() {
                System.out.println(ANSI_RED + "TownyHOA is not enabled" + ANSI_RESET)
            }
        
    }

    public void onDisable() {
        System.out.println(ANSI_CYAN + "TownyHOA has been disabled!" + ANSI_RESET)
    }
}