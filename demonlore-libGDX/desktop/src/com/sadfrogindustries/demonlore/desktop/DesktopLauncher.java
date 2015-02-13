package com.sadfrogindustries.demonlore.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.sadfrogindustries.demonlore.DemonLore;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		// Pack textures if any asset file has been modified. Can apparently be done like this:
		// TexturePacker.processIfModified("input folder", "output folder", "name of output");

		new LwjglApplication(new DemonLore(), config);
	}
}
