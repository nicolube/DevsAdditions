package de.nicolube.devsadditions

import com.j256.ormlite.jdbc.JdbcConnectionSource
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource
import de.nicolube.devsadditions.config.Config
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    var emergencyManager: EmergencyManager? = null;
    var config: Config = Config();
    var dbConnectionSource: JdbcConnectionSource? = null;

    override fun onEnable() {
        logger.info("Loading config...")

        logger.info("Connecting to database...")
        connectDatabase()

        logger.info("Starting EmergencyManager...")
        emergencyManager = EmergencyManager();
    }

    override fun onDisable() {

    }

    fun connectDatabase() {

         dbConnectionSource = JdbcPooledConnectionSource(config.database.url, config.database.username, config.database.password)
    }
}