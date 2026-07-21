package dev.vivekanand.sbapiproject;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("staging")
@Service
public class SampleServiceStagingImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "Welcome to Staging Application";
    }
}
