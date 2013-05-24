package mod.oc.helper;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler
{

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player)
    {
        handlePacket(packet);
    }

    private void handlePacket(Packet250CustomPayload packet)
    {
        DataInputStream input = new DataInputStream(new ByteArrayInputStream(packet.data));
        
        int rand1;
        int rand2;
        
        try{
            rand1 = input.readInt();
            rand2 = input.readInt();
        }catch(IOException e){
            e.printStackTrace();
            return;
        }
        System.out.println(rand1 + " " + rand2);
    }

}
