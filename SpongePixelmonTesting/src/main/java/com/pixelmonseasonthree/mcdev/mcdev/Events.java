package com.pixelmonseasonthree.mcdev.mcdev;


import jdk.nashorn.internal.ir.Block;
import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.InteractBlockEvent;

import java.util.EventListener;

public class Events implements EventListener {

    @Listener
    public void onInteraction(InteractBlockEvent event){
        Player player = event.getCause().last(Player.class).get();
        BlockSnapshot block = event.getTargetBlock();



    }

}
