package com.co.develop.rojinsky.meets.data;

import com.co.develop.rojinsky.meets.models.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<People, Long> {
    Optional<People> findByUsername(String username);
}
