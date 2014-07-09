package org.apollo.net.release.r317;

import org.apollo.game.event.impl.UpdateTileItemEvent;
import org.apollo.net.codec.game.DataType;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.codec.game.GamePacketBuilder;
import org.apollo.net.release.EventEncoder;

/**
 * An {@link EventEncoder} for the {@link UpdateTileItemEvent}.
 * 
 * @author Major
 */
public final class UpdateTileItemEventEncoder extends EventEncoder<UpdateTileItemEvent> {

    @Override
    public GamePacket encode(UpdateTileItemEvent event) {
	GamePacketBuilder builder = new GamePacketBuilder(84);
	builder.put(DataType.BYTE, event.getPositionOffset());
	builder.put(DataType.SHORT, event.getId());
	builder.put(DataType.SHORT, event.getPreviousAmount());
	builder.put(DataType.SHORT, event.getAmount());
	return builder.toGamePacket();
    }

}