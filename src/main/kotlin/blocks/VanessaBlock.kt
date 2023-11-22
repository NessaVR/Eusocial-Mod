package com.nessavr.vanessamod.blocks


import net.minecraft.world.level.block.Block

object VanessaBlock : Block(
    Properties
        .of()
        .instabreak()
        .friction(10f)
)