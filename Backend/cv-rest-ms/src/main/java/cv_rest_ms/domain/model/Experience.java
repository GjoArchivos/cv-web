package cv_rest_ms.domain.model;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
public class Experience {

    private final Long id;
    private final String company;
    private final String position;
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;

    private final List<String> activities;
    private final List<String> technologies;
}