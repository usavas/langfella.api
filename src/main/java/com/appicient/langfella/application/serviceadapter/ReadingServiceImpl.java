package com.appicient.langfella.application.serviceadapter;

import com.appicient.langfella.application.databaseports.ReadingDao;
import com.appicient.langfella.application.databaseports.models.Reading;
import com.appicient.langfella.application.serviceports.ReadingService;

import java.util.Optional;

public class ReadingServiceImpl implements ReadingService {
    private final ReadingDao readingDao;

    public ReadingServiceImpl(ReadingDao readingDao){
        this.readingDao = readingDao;
    }

    public void AddNewReading(ReadingDto readingDto){
        // convert dto to DB entity
        Reading readingEntity =
                new Reading(
                        readingDto.getId(),
                        readingDto.getTitle(),
//                        readingDto.getLanguage(),
                        readingDto.getSource()
//                        readingDto.getContentItems(),
//                        readingDto.getAuthors()
        );
        // and then save it to DB
        readingDao.save(readingEntity);
    }

    @Override
    public Optional<Reading> GetReadingById(int id) {
        return readingDao.findById(id);
    }
}
