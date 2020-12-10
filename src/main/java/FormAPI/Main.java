package FormAPI;

import FormAPI.FormAPI.FormEventsHandler;
import cn.nukkit.plugin.PluginBase;

public class FormMain extends PluginBase {

    @Override()
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FormEventsHandler(), this);
        this.getLogger().info("§l§fПлагин на §6FormAPI §aАктивирован§7!");
    }

    @Override()
    public void onDisable() {
        this.getServer().getLogger().info("§l§fПлагин на §6FormAPI §cДеактивирован§7!");
    }
}