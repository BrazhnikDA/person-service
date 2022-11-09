package liga.medical.personservice.core.model;

import lombok.Data;

@Data
public class SignalsData {
    private long id;
    private long personDataId;
    private String description;
}
