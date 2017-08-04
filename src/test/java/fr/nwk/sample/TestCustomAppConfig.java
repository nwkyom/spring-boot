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
public class TestCustomAppConfig {

    @Autowired
    MyBean myBean;


    @Test
    public void testProperties() {
        assertThat(myBean.getName(), equalTo("my-bean"));

    }

//    @Configuration
//    @PropertySource("file:src/test/resources/my-test.properties")
//    static class Config {
//
//    }

}
