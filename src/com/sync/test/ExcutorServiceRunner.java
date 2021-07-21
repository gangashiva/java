package com.sync.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//executorService.execute(new Task1());
	}

}
