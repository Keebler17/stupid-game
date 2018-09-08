package io.github.keebler17.spaceinvaders;

import com.badlogic.gdx.Game;

import io.github.keebler17.spaceinvaders.screens.LoseScreen;
import io.github.keebler17.spaceinvaders.screens.MainScreen;
import io.github.keebler17.spaceinvaders.screens.WinScreen;

public class SpaceInvaders extends Game {

	public MainScreen main_screen;
	
	public WinScreen win_screen;

	public LoseScreen lose_screen;
	
	@Override
	public void create() {
		Global.init();
		Assets.load();
		win_screen = new WinScreen(this);
		main_screen = new MainScreen(this);
		lose_screen = new LoseScreen(this);

		setScreen(main_screen);
	}
	
	public void reset() {
		main_screen = new MainScreen(this);
		
		Global.init();
		setScreen(main_screen);
	}

}
