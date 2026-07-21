package dev.vivekanand.sbapiproject;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("production")
@Service
public class SampleServiceProductionImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "Welcome to Production Application";
    }
}
