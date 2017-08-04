package fr.nwk.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("staging")
public class TestStagingAppConfig {

    @Autowired
    AppConfig appConfig;


    @Test
    public void testProperties() {
        assertThat(appConfig.getAppMode(), equalTo("staging"));
        assertThat(appConfig.getAppName(), equalTo("staging-app"));
    }

}
