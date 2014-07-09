package org.apollo.game.event.impl;

import org.apollo.game.model.Position;

/**
 * The third {@link ObjectActionEvent}.
 * 
 * @author Graham
 */
public final class ThirdObjectActionEvent extends ObjectActionEvent {

    /**
     * Creates the third object action event.
     * 
     * @param id The id.
     * @param position The position.
     */
    public ThirdObjectActionEvent(int id, Position position) {
	super(3, id, position);
    }

}