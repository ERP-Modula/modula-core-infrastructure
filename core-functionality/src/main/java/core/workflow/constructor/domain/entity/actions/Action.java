package core.workflow.constructor.domain.entity.actions;


import core.workflow.constructor.domain.entity.Category;
import core.workflow.constructor.domain.entity.field.Field;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Action {
    private String name;
    private String description;
    private Category category;
    private List<Field> requiredFields;
    private List<Field> producedFields;
}
