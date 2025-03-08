package core.workflow.constructor.domain.entity.triggers;

import com.example.googledocs.domain.entity.field.Field;
import lombok.Data;

import java.util.List;

@Data
public class Event {
    private String id;
    private List<Field> requiredFields;
}
