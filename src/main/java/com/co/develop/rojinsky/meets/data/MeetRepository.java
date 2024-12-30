package com.co.develop.rojinsky.meets.data;

import com.co.develop.rojinsky.meets.models.Meet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetRepository extends JpaRepository<Meet, Long> {
}
