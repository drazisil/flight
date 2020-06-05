package come.drazisil.flight;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Flight extends JavaPlugin {

    public static Flight plugin;
    public static Logger logger;

    @Override
    public void onEnable() {
        // Plugin startup logic


        plugin = this;
        logger = getLogger();

        this.getCommand("fly").setExecutor(new CommandFly());
        getServer().getPluginManager().registerEvents(new MyListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
