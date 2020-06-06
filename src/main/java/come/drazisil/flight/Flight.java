package come.drazisil.flight;

import org.bstats.bukkit.Metrics;
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

        int pluginId = 7760; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);

        // Optional: Add custom charts
        metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
