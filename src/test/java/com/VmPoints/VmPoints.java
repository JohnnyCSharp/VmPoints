package com.VmPoints;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class VmPoints
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(VmPointsPlugin.class);
		RuneLite.main(args);
	}
}