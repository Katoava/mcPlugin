package com.pixelmonseasonthree.mcdev.mcdev;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextStyles;

public class SendMessage implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
            if(src instanceof Player){

                Player player = (Player) src;
                int x = player.getLocation().getBlockX(),
                z = player.getLocation().getBlockZ();

                player.sendMessage(Text.of(TextColors.AQUA,TextStyles.BOLD, "hello" + player.getName()));


            }
            else{
                src.sendMessage(Text.of("Only players can send messages"));

            }



        return CommandResult.success();
    }
}
