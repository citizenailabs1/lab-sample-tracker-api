package com.labtracker;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController                 // "I answer web requests with data"
@RequestMapping("/samples")     // "My address is /samples"
public class SampleController {

    private final SampleRepository repository;

    public SampleController(SampleRepository repository) {
        this.repository = repository;   // Spring hands the waiter a cook
    }

    // GET /samples  ->  all samples
    @GetMapping
    public List<Sample> getAllSamples() {
        return repository.findAll();
    }

    // GET /samples/3  ->  just sample #3 (or "404 Not Found")
    @GetMapping("/{id}")
    public ResponseEntity<Sample> getSampleById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
