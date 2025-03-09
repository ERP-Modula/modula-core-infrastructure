package core.workflow.constructor.domain.entity.triggers;



import core.workflow.constructor.domain.entity.Category;
import core.workflow.constructor.domain.entity.field.Field;
import lombok.Data;

import java.util.List;

@Data
public class Trigger {
    private String name;
    private String description;
    private Category category;
    private Event event;
    private List<Field> producedFields;
}
