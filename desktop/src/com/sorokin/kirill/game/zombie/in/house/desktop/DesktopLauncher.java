package com.sorokin.kirill.game.zombie.in.house.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sorokin.kirill.game.zombie.in.house.GdxGame;
import com.sorokin.kirill.game.zombie.in.house.Preferences;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = Preferences.VIEWPORT_HEIGHT;
		config.width = Preferences.VIEWPORT_WIDTH;
		new LwjglApplication(new GdxGame(), config);
	}
}
