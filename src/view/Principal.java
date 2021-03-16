package view;

import java.util.concurrent.Semaphore;

import controller.ThreadProcessamento;

public class Principal {

	public static void main(String[] args) {

		int permissao = 1;
		Semaphore semaforo = new Semaphore(permissao);

		for (int idThread = 1; idThread <= 21; idThread++) {

			Thread tProcesso = new ThreadProcessamento(semaforo,idThread);
			tProcesso.start();
		}

	}

}