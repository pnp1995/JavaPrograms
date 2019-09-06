                                      package com.bridgeit.function;

import java.util.concurrent.TimeUnit;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
      //  @SuppressWarnings("unused")
		long st = System.nanoTime();
        TimeUnit.MICROSECONDS.sleep(5);
        //@SuppressWarnings("unused")
		long et = System.nanoTime();
        long Et = et-st;
        System.out.println("Elapsed time Nanosecond:" + et);
        System.out.println("Elaapsed time Milisecond:" +et/1000000);
	}

}
