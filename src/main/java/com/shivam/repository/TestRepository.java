package com.shivam.repository;

import com.shivam.entity.TestEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, UUID> {
}
