package core.workflow.constructor.domain.entity;


import core.workflow.constructor.domain.entity.actions.Action;
import core.workflow.constructor.domain.entity.triggers.Trigger;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Module {
    private UUID id;
    private String uniqueName;
    private List<Action> actions;
    private List<Trigger> triggers;
}
