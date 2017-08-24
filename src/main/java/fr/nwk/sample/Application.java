package fr.nwk.sample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private HierarchicalConfig hierarchicalConfig;

    @Autowired
    private MyService myService;

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting " + myService.getServiceName());
        System.out.println("App mode: " + appConfig.getAppMode());
        System.out.println("App name: " + appConfig.getAppName());
        System.out.println("Service hostname: " + hierarchicalConfig.getHostname());
        System.out.println("Service port: " + hierarchicalConfig.getPort());
    }
}
