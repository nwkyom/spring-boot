package fr.nwk.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{

    @Value("${service.name}")
    private String serviceName;

    @Override
    public String getServiceName() {
        return serviceName;
    }
}
