package xyz.gghost.jskype.api.events;

import lombok.Getter;
import xyz.gghost.jskype.api.event.Event;
import xyz.gghost.jskype.internal.impl.Group;
import xyz.gghost.jskype.var.User;
@Deprecated
/**
 * Event not inuse - careful when using UserTypingEvent
 */
@Getter
public class UserStoppedTypingEvent extends Event {

    private final User user;
    private final Group group;

    public UserStoppedTypingEvent(Group group, User user) {
        this.user = user;
        this.group = group;
    }
}
