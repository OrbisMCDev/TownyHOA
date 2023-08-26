package xyz.orbismc.TownyHOA;

import org.bukkit.plugin.java.JavaPlugin;
import org.apache.commons.lang3.StringUtils;

/* 
The following work is under the full ownership of the OrbisMC Dev Team
Liscened under the GNU General Public Liscense.
All credits listed in the attached plugin.yml.
*/


public class TownyHOA extends JavaPlugin {

    // Here we define some strings that we will use later on.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String VERSION = "TownyHOA v0.1.0";

    public void onEnable() { // Our main startup code
        HOAConfig.getInstance().load(); // Load the config
        if config.getBoolean("important.is-disabled") { // Check if the plugin is enabled
            public void onDisable() { // Disable the plugin if it is not enabled.
                System.out.println(ANSI_WHITE + "==============================================================" + ANSI_RESET)
                System.out.println(ANSI_RED + VERSION + "is disabled in your config!" + ANSI_RESET)
                System.out.println(ANSI_WHITE + "==============================================================" + ANSI_RESET)
            }
        } else {
            System.out.println(ANSI_WHITE + "==============================================================" + ANSI_RESET)
            System.out.println(ANSI_GREEN + VERSION + "has been enabled!" + ANSI_RESET)
            if(StringUtils.isNotBlank(config.getString("important.launch-message"))) {
                System.out.println(config.getString("important.launch-message") + ANSI_RESET)
            
            } else {
                System.out.println("You can set a custom launch-message in your config files!")
            }
            System.out.println(ANSI_WHITE + "==============================================================" + ANSI_RESET)
        }
        
    }

    public void onDisable() { // Disable the plugin
        System.out.println(ANSI_WHITE + "==============================================================" + ANSI_RESET)
        System.out.println(ANSI_CYAN + VERSION + "has been disabled!" + ANSI_RESET)
        System.out.println(ANSI_WHITE + "==============================================================" + ANSI_RESET)
    }
}