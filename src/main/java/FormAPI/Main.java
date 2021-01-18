package FormAPI;

import FormAPI.Components.EventsListener.PlayerFormRespondedListener;
import FormAPI.Components.EventsListener.PlayerQuitListener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;

public class Main extends PluginBase {

    @Override()
    public void onEnable() {
        this.registerEvents();
        this.getLogger().info("§l§fПлагин на §6FormAPI §aАктивирован§7!");
    }

    @Override()
    public void onDisable() {
        this.getServer().getLogger().info("§l§fПлагин на §6FormAPI §cДеактивирован§7!");
    }

    private void registerEvents() {
        PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents(new PlayerQuitListener(), this);
        pluginManager.registerEvents(new PlayerFormRespondedListener(), this);
    }
}