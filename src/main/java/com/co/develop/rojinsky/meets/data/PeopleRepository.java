package com.co.develop.rojinsky.meets.data;

import com.co.develop.rojinsky.meets.models.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
