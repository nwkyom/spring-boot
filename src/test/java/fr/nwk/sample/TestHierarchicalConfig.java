package fr.nwk.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHierarchicalConfig {

    @Autowired
    HierarchicalConfig hierarchicalConfig;

    @Test
    public void testProperties() {
        assertThat(hierarchicalConfig.getHostname(), equalTo("server-test"));
        assertThat(hierarchicalConfig.getPort(), equalTo("8080"));
    }

}
