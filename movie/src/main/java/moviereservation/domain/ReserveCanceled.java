package moviereservation.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReserveCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String reserveStatus;
    private Integer amount;
    private Date reserveDate;
    private Long movieId;

}
//>>> DDD / Domain Event
