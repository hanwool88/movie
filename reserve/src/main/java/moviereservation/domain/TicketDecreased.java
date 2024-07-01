package moviereservation.domain;

import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

@Data
@ToString
public class TicketDecreased extends AbstractEvent {

    private Long id;
    private Date date;
    private Integer stock;
    private String movieName;
}
