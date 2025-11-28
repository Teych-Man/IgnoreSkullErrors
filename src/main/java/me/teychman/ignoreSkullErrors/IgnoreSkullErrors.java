package me.teychman.ignoreSkullErrors;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Filter;

public class IgnoreSkullErrors extends JavaPlugin {

    @Override
    public void onEnable() {
        Filter filter = record -> {

            String msg = record.getMessage();
            if (msg == null) return true;

            return !msg.contains("Couldn't look up profile properties")
                    && !msg.contains("AuthenticationUnavailableException")
                    && !msg.contains("Cannot contact authentication server");
        };

        getLogger().getParent().setFilter(filter);

        getLogger().info("IgnoreSkullErrors enabled.");
    }
}
