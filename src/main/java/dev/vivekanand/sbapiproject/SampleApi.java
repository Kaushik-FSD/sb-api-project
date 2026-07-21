package dev.vivekanand.sbapiproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SampleApi {

    private final SampleService sampleService;

    public SampleApi(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> get() {
        return ResponseEntity.ok(Map.of("message", sampleService.getMessage()));
    }
}
