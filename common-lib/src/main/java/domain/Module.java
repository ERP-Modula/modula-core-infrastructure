package domain;

import domain.actions.Action;
import domain.trigger.Trigger;

import java.util.List;
import java.util.UUID;

public class Module {
    private UUID id;
    private String uniqueName;
    private List<Action> actions;
    private List<Trigger> triggers;
}
