package com.nessavr.vanessamod.creativetabs

import com.nessavr.vanessamod.MODID
import com.nessavr.vanessamod.blocks.VanessaBlock
import com.nessavr.vanessamod.items.SadObsidianMaker
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.ItemStack
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod

@Suppress("unused")
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
object VanessaCreativeModTab {

    @SubscribeEvent
    fun buildContents(event: BuildCreativeModeTabContentsEvent) {
        if (event.tabKey == ResourceLocation(MODID, "vanessa")) {
            event.accept(ItemStack(VanessaBlock))
            event.accept(ItemStack(SadObsidianMaker))
        }
    }
}
