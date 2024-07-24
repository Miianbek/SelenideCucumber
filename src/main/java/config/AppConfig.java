package config;


import org.aeonbits.owner.Config;
@Config.Sources({"classpath:app.properties"})
public interface AppConfig extends Config {

    @Key("browser.name")
    String browser();

    @Key("headless.mode")
    boolean headless();

    @Key("base.url")
    String baseUrl();


}
