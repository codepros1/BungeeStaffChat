package me.codepro1;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class StaffChat
  extends Command
{
  public StaffChat()
  {
    super("sc", "plant.staffchat", new String[] { "sc", "staffchat" });
  }
  
  public void execute(CommandSender cs, String[] args)
  {
    if (args.length == 0)
    {
      cs.sendMessage(new TextComponent(ChatColor.BLUE + "StaffChat: Please enter a message"));
    }
    else
    {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < args.length; i++) {
        builder.append(args[i]).append(" ");
      }
      String message = ChatColor.translateAlternateColorCodes('&', builder.toString().trim());
      for (ProxiedPlayer pl : BungeeCord.getInstance().getPlayers())
      {
        ProxiedPlayer sender1 = (ProxiedPlayer)cs;
        if (pl.hasPermission("plant.staffchat.send")) {
          pl.sendMessage(new TextComponent(ChatColor.BLUE + "Staff: (" + sender1.getServer().getInfo().getName() + ") " + sender1.getName() + ChatColor.AQUA + " :" + message));
        }
      }
    }
  }
}
