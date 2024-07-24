package config;

import org.aeonbits.owner.ConfigCache;

public class ConfigurationManager {


    private ConfigurationManager() {

    }

    public  static  AppConfig getAppConfig() {
        return ConfigCache.getOrCreate(AppConfig.class);
    }
}
