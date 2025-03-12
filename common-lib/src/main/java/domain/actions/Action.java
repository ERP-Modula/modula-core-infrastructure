package domain.actions;


import domain.field.Field;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Action {
    private String name;
    private List<Field> requiredFields;
    private List<Field> producedFields;
}
