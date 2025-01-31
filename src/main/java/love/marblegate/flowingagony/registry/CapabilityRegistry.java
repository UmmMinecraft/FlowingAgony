package love.marblegate.flowingagony.registry;

import love.marblegate.flowingagony.capibility.abnormaljoy.AbnormalJoyCapability;
import love.marblegate.flowingagony.capibility.hatredbloodlinestatus.HatredBloodlineStatusCapability;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CapabilityRegistry {
    @SubscribeEvent
    public static void onSetUpEvent(FMLCommonSetupEvent event) {
        HatredBloodlineStatusCapability.register();
        AbnormalJoyCapability.register();
    }
}
