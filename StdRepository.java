package com.example.Student.Student.Repository;

import com.example.Student.Student.entity.StdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StdRepository extends JpaRepository<StdEntity, Integer> {
}
