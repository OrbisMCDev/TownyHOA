package xyz.orbismc.TownyHOA;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.file;

public class HOAConfig {

    private final static HOAConfig instance = new HOAConfig();

    private File file;
    private YamlConfiguration config;

    private HOAConfig() {
    }

    public void load() {
        file = new File(TownyHOA.getInstance().getDataFolder(), "config.yml");

        if (!file.exists())
            TownyHOA.getInstance().saveResource(resourcepath: "settings.yml", replace: false);
    }

        config = new YamlConfiguration();
        config.options().parseCommments(value:true);

        try {
            config.load(file);

        } catch (Exception ex) {
            e.printStackTrace();
        }
    

    public static HOAConfig getInstance() {
        return instance;
    }
}