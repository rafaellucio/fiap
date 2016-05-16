package br.com.fiap.threads.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ThreadDisplayTime extends Thread {
	
	ArrayList<String> listMsg = new ArrayList<>();
	private LocalDateTime localDateTime = null;
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	
	public ThreadDisplayTime(ArrayList<String> listMsg) {
		this.listMsg = listMsg;
	}
		
	@Override
	public void run() {
		try {
			int i = 0;
			
			while(i < listMsg.size()){
				localDateTime = LocalDateTime.now();
				System.out.println(localDateTime.format(format));
				i++;
				sleep(10000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
