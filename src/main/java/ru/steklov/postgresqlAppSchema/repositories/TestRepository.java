package ru.steklov.postgresqlAppSchema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.steklov.postgresqlAppSchema.entities.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
