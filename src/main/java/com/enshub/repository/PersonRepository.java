package com.enshub.repository;

import com.enshub.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fengwen on 23/11/2018.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
