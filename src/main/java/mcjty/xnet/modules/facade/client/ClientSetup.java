package mcjty.xnet.modules.facade.client;

import mcjty.xnet.modules.cables.CableModule;
import mcjty.xnet.modules.facade.FacadeModule;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderTypeLookup;

public class ClientSetup {
    public static void initClient() {
        RenderTypeLookup.setRenderLayer(FacadeModule.FACADE.get(), (RenderType) -> true);
    }

    public static void registerBlockColor() {
        Minecraft.getInstance().getBlockColors().register(new FacadeBlockColor(),
                FacadeModule.FACADE.get(), CableModule.CONNECTOR.get(), CableModule.ADVANCED_CONNECTOR.get());
    }
}
