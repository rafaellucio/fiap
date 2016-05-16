package br.com.fiap.threads.exercicios;

import java.util.ArrayList;

public class ThreadsDisplayMessage extends Thread {
	public ArrayList<String> listMsg = new ArrayList<>();
	
	public ThreadsDisplayMessage(ArrayList<String> listMsg) {
		this.listMsg = listMsg;
	}
	
	@Override
	public void run() {
		int i = 0;
		
		while(i < listMsg.size()) {
			try {
				System.out.println(listMsg.get(i));
				sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				i++;
			}
		}
	}

	public void setListMsg(String msg) {
		this.listMsg.add(msg);
	}
}
