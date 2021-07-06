package de.nicolube.devsadditions.config

class EmergencyConfig {
    var levels: Map<Int, EmergencyLevelConfig> = mapOf();
}

class EmergencyLevelConfig {
    var ontime: Int? = 0;
    var votes: Int? = 0;
    var permission: String? = "";
}