package xyz.orbismc.TownyHOA;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class HOAConfig {

    private final static HOAConfig instance = new HOAConfig(); // Initiate the config

    private File file;
    private YamlConfiguration config;

    private HOAConfig() {
    }

    public void load() {
    file = new File(TownyHOA.getInstance().getDataFolder(), "config.yml"); // Load the config file

    if (!file.exists())
        TownyHOA.getInstance().saveResource("config.yml", false); // Save the config file

    config = new YamlConfiguration();
    config.options().parseComments(true); // Handle some config settings

    try {
        config.load(file); // Test that the config can be loaded

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
   
    public static HOAConfig getInstance() {
        return instance;
    }
}