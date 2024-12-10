package net.javaguides.springboot.Services;

import net.javaguides.springboot.Entity.WikimediaData;
import net.javaguides.springboot.Repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @Autowired
    private WikimediaDataRepository repository;
    @KafkaListener(topics = "wikimedia_recentchange"
            ,groupId = "myGroup")
    public void consume(String eventMessage)
    {
            LOGGER.info(String.format("Event  Message is ->>> %s",eventMessage.toString()));
        WikimediaData wikimediaData=new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        repository.save(wikimediaData);
    }

}
