package core.workflow.constructor.domain.entity.triggers;

import core.workflow.constructor.domain.entity.field.Field;
import lombok.Data;

import java.util.List;

@Data
public class Event {
    private String id;
    private List<Field> requiredFields;
}
