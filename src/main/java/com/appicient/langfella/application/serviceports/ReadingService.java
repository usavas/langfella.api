package com.appicient.langfella.application.serviceports;

import com.appicient.langfella.application.databaseports.models.Reading;
import com.appicient.langfella.application.serviceadapter.ReadingDto;

import java.util.Optional;

public interface ReadingService {
     void AddNewReading(ReadingDto readingDto);
     Optional<Reading> GetReadingById(int id);
}
