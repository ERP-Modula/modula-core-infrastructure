package domain.process;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("node_placements")
public class NodePlacement {
    @PrimaryKey
    private String id;

    private Integer x;
    private Integer y;
}
