package domain.trigger;

import domain.field.Field;
import lombok.Data;

import java.util.List;


@Data
public class Trigger {
   private String id;
   private List<Field> producedFields;
}

