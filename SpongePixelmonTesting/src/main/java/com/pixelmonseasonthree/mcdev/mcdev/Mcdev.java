package com.pixelmonseasonthree.mcdev.mcdev;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.sun.xml.internal.ws.util.xml.ContentHandlerToXMLStreamWriter;
import org.apache.commons.lang3.event.EventListenerSupport;
import org.slf4j.Logger;
import org.spongepowered.api.Server;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.command.SendCommandEvent;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;

import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.plugin.Plugin;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;


@Plugin(
        id = "mcdev",
        name = "Mcdev",
        description = "Makeing a sponge server",
        authors = {
                "karkic"
        }
)
public class Mcdev {

    public static Mcdev instance;

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {


    }

    @Listener
    public void onInitialize( GameInitializationEvent event){

        instance = this;
       logger.info("This is a test");
        CommandSpec command = CommandSpec.builder()
                .permission("PluginSeason3.command.base")
                .description(Text.of("This is the base command"))
                .executor(new SendMessage()).build();
        



        Sponge.getCommandManager().register(instance,command, "PixelmonSeasonThree","Season");

    }

    @Listener
    public void onCommmand(SendCommandEvent event){

        if (event.getCommand().equalsIgnoreCase("say")) {
            Player player = (Player) event.getSource();
            event.setCancelled(true);
        }
    }
}
