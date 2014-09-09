package org.apollo.net.release.r317;

import org.apollo.game.message.impl.OpenDialogueInterfaceMessage;
import org.apollo.net.codec.game.DataOrder;
import org.apollo.net.codec.game.DataType;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.codec.game.GamePacketBuilder;
import org.apollo.net.release.MessageEncoder;

/**
 * A {@link MessageEncoder} for the {@link OpenDialogueInterfaceMessage}.
 * 
 * @author Chris Fletcher
 */
public final class OpenDialogueInterfaceMessageEncoder extends MessageEncoder<OpenDialogueInterfaceMessage> {

	@Override
	public GamePacket encode(OpenDialogueInterfaceMessage message) {
		GamePacketBuilder builder = new GamePacketBuilder(164);
		builder.put(DataType.SHORT, DataOrder.LITTLE, message.getInterfaceId());
		return builder.toGamePacket();
	}

}