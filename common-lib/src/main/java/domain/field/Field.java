package domain.field;

import lombok.Data;

@Data
public class Field {
    private String key;
    private FieldType type;
    private String stringValue;
}
