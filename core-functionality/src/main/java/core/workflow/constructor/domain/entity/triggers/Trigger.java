package core.workflow.constructor.domain.entity.triggers;

import com.example.googledocs.domain.entity.Category;
import com.example.googledocs.domain.entity.field.Field;
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
