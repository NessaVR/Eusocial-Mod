@file:Suppress("HasPlatformType", "unused")

package com.nessavr.vanessamod.init

import com.nessavr.vanessamod.MODID
import com.nessavr.vanessamod.items.SadObsidianMaker
import net.minecraft.world.item.Item
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

object ItemRegistry {

    // for register
    private val ITEMS: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS, MODID)

    fun register(bus: IEventBus) = ITEMS.register(bus)

    // ==================== //
    //     Normal Items     //
    // ==================== //

    val SAD_OBSIDIAN_MAKER = ITEMS.register("sad_obsidian_maker") { SadObsidianMaker }

}