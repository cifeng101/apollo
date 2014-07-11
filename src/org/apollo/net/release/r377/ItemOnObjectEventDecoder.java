package org.apollo.net.release.r377;

import org.apollo.game.event.impl.ItemOnObjectEvent;
import org.apollo.net.codec.game.DataOrder;
import org.apollo.net.codec.game.DataTransformation;
import org.apollo.net.codec.game.DataType;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.codec.game.GamePacketReader;
import org.apollo.net.release.EventDecoder;

/**
 * An {@link EventDecoder} for the {@link ItemOnObjectEvent}.
 * 
 * @author Major
 */
public final class ItemOnObjectEventDecoder extends EventDecoder<ItemOnObjectEvent> {

	@Override
	public ItemOnObjectEvent decode(GamePacket packet) {
		GamePacketReader reader = new GamePacketReader(packet);

		int objectId = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE);
		int interfaceId = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE);
		int itemId = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE);
		int y = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE);
		int slot = (int) reader.getUnsigned(DataType.SHORT);
		int x = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD);

		return new ItemOnObjectEvent(interfaceId, itemId, slot, objectId, x, y);
	}

}