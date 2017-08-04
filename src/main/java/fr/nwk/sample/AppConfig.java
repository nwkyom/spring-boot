package fr.nwk.sample;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${app.mode}")
    private String appMode;

    @Value("${app.name}")
    private String appName;

    public String getAppMode() {
        return appMode;
    }

    public void setAppMode(String appMode) {
        this.appMode = appMode;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
