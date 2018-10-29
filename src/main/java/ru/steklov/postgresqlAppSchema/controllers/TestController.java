package ru.steklov.postgresqlAppSchema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.steklov.postgresqlAppSchema.entities.TestEntity;
import ru.steklov.postgresqlAppSchema.repositories.TestRepository;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "test", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class TestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/{id}")
    public Optional<TestEntity> getTestEntity(@PathVariable long id) {
        return testRepository.findById(id);
    }

    @PostMapping
    public TestEntity saveTestEntity(@RequestBody TestEntity testEntity) {
        return testRepository.save(testEntity);
    }
}
