package io.github.keebler17.spaceinvaders;

import java.util.ArrayList;

import io.github.keebler17.spaceinvaders.obj.AlienBullet;
import io.github.keebler17.spaceinvaders.obj.PlayerBullet;

public class Global {
	// This is a better way to do global variables... I did not know that last time.
	// with the static keyword, Global.variable can be used. No instances needed.
	
	public static ArrayList<AlienBullet> alienBullets;
	public static ArrayList<PlayerBullet> playerBullets;
	
	public static final int BULLET_WIDTH = 5;
	public static final int BULLET_HEIGHT = 10;
	
	public static int score = 0;
	
	public static final int ALIEN_WIDTH = 110;
	public static final int ALIEN_HEIGHT = 80;
	
	public static void init() {
		alienBullets = new ArrayList<AlienBullet>();
		playerBullets = new ArrayList<PlayerBullet>();
		score = 0;
	}
	
	public static final int MAX_SCORE = 440;
}
