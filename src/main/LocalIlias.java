package main;

import java.awt.EventQueue;

import view.LoginWindow;

public class LocalIlias {
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginWindow();
			}
		});
	}
}
