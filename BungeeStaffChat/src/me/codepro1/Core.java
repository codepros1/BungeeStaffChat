package me.codepro1;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class Core
  extends Plugin
{
  public void onEnable()
  {
    ProxyServer.getInstance().getPluginManager().registerCommand(this, new StaffChat());
  }
}
