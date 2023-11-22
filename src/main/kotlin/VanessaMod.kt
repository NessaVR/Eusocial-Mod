package com.nessavr.vanessamod

import com.nessavr.vanessamod.init.BlockItemRegistry
import com.nessavr.vanessamod.init.BlockRegistry
import com.nessavr.vanessamod.init.ItemRegistry
import com.nessavr.vanessamod.keybind.KeyBindHandler.registerKeybindings
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.MOD_BUS

const val MODID = "vanessamod"

@Mod(MODID)
object vanessamod {

    val LOGGER: Logger = LogManager.getLogger("vanessamod")

    init {
        LOGGER.log(Level.INFO, "$MODID has started!")

        MOD_BUS.addListener(::onClientSetup)

        ItemRegistry.register(MOD_BUS)
        BlockRegistry.register(MOD_BUS)
        BlockItemRegistry.register(MOD_BUS)
    }

    @Suppress("UNUSED_PARAMETER")
    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Initializing client... with vanessamod!")
        MOD_BUS.addListener(::registerKeybindings)
    }

}