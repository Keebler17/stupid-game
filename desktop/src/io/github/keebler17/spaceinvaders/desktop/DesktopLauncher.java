package io.github.keebler17.spaceinvaders.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import io.github.keebler17.spaceinvaders.SpaceInvaders;
//import io.github.keebler17.spaceinvaders.screens.WebInvadersApplicationListener;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		// new LwjglApplication(new WebInvadersApplicationListener(), config);
		new LwjglApplication(new SpaceInvaders(), config);
	}
}
