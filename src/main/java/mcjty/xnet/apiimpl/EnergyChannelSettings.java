package mcjty.xnet.apiimpl;

import mcjty.xnet.api.channels.IChannelSettings;
import mcjty.xnet.api.channels.IControllerContext;
import mcjty.xnet.api.gui.IEditorGui;
import mcjty.xnet.api.gui.IndicatorIcon;
import mcjty.xnet.blocks.controller.GuiController;
import net.minecraft.nbt.NBTTagCompound;

import javax.annotation.Nullable;
import java.util.Map;

public class EnergyChannelSettings implements IChannelSettings {

    @Override
    public void readFromNBT(NBTTagCompound tag) {
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
    }

    @Override
    public void tick(int channel, IControllerContext context) {
    }

    @Override
    public boolean isEnabled(String tag) {
        return true;
    }

    @Nullable
    @Override
    public IndicatorIcon getIndicatorIcon() {
        return new IndicatorIcon(GuiController.iconGuiElements, 11, 80, 11, 10);
    }

    @Nullable
    @Override
    public String getIndicator() {
        return null;
    }

    @Override
    public void createGui(IEditorGui gui) {
    }

    @Override
    public void update(Map<String, Object> data) {
    }
}
