package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TicketDecreased extends AbstractEvent {

    private Long id;
    private Date date;
    private Integer stock;
    private String movieName;
    private Long reserveId;

    public TicketDecreased(Movie aggregate) {
        super(aggregate);
    }

    public TicketDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
