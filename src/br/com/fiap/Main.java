package br.com.fiap;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import br.com.fiap.threads.exercicios.ThreadDisplayTime;
import br.com.fiap.threads.exercicios.ThreadsDisplayMessage;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			list.add("THREAD1: Mensagem numero: " + i);
		}
		
		ThreadsDisplayMessage threadsDisplayMessage = new ThreadsDisplayMessage(list);
		ThreadDisplayTime threadDisplayTime = new ThreadDisplayTime(list);
		
		threadsDisplayMessage.start();
		threadDisplayTime.start();
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println(threadsDisplayMessage.getState());
				System.out.println(threadDisplayTime.getState());
			}
		};
		
		timer.scheduleAtFixedRate(task, new Date(), 5000);
		
	}
}
