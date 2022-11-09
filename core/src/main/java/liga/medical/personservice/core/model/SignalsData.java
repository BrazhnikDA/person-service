package liga.medical.personservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignalsData {
    @NonNull
    private Integer id;

    @NonNull
    private Integer personDataId;

    private String description;

    @NonNull
    private String type;

}
