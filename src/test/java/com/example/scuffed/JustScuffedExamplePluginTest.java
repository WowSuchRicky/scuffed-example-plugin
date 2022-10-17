package com.example.scuffed;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class JustScuffedExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(JustScuffedExamplePlugin.class);
		RuneLite.main(args);
	}
}