package com.appicient.langfella.application.databaseports;

import com.appicient.langfella.application.databaseports.models.Reading;
import org.springframework.data.jpa.repository.JpaRepository;

// TODO: NOTE: ReadingEntity is the DB representation of what we are going to persist and retrieve then map to domain Entities
public interface ReadingDao extends JpaRepository<Reading, Integer> {
}
