package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TicketIncreased extends AbstractEvent {

    private Long id;
    private Date date;
    private Integer stock;
    private String movieName;

    public TicketIncreased(Movie aggregate) {
        super(aggregate);
    }

    public TicketIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
