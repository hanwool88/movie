package moviereservation.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import moviereservation.config.kafka.KafkaProcessor;
import moviereservation.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MovieRepository movieRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    public void wheneverReserved(
        @Payload Reserved reserved
    ) {
        Reserved event = reserved;
        // Sample Logic //
        Movie.decreaseTicket(event);
    }

    public void wheneverReserveCanceled(
        @Payload ReserveCanceled reserveCanceled
    ) {
        ReserveCanceled event = reserveCanceled;
        // Sample Logic //
        Movie.increaseTicket(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
