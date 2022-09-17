/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Sing {

	private static final Singleton uniqueInstance = new Singleton();

	private Sing() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}