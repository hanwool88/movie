package moviereservation.infra;

import java.util.List;
import moviereservation.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "reservelists",
    path = "reservelists"
)
public interface ReservelistRepository
    extends PagingAndSortingRepository<Reservelist, Long> {
    List<Reservelist> findByReserveId(Long reserveId);
}
