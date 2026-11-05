package com.practice;

public class ThreadMethods {

//	public static void main(String[] args) {
//		System.out.println("Main thread start");
//
////		try {
////			Thread.sleep(2000);
////		} catch (Exception e) {
////			// TODO: handle exception
////		}
////		System.out.println("Main thread ends");
//
//		Thread t1 = new Thread(() -> {
//			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//			System.out.println("Thread-0 start");
//		});
//
//		t1.start();
//		System.out.println("Main thread ends");
//
//	}
	// Thread important methods
	// Thread.sleep(milliseconds)-->It is a static method -> TIMED_WAITING
	// RUNNABLE --> TIMED_WAITING --> RUNNABLE
//------------------------------------------------------------------------------------------------------------------
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Main thread start");
//
//		Thread t1 = new Thread(() -> {
//
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//			System.out.println("Thread-0 start");
//		});
//
//		t1.start();
//		//t1.join();//let the t1 thred first complete its execution   --> Main thread ko waiting stage mai le jata hai
//		t1.join(1000);//Ye Main thread ko Timed-waiting stage mai lekar jata hai
//		System.out.println("Main thread ends");
//
//	}

//join()
//Main thread --> waiting
//t1 thread --> Runnable --> Terminated
//Main thread --> waiting -->  Runnable --> Terminated

//--------------------------------------------------------------------------------------------------------------------

//	public static void main(String[] args) {
//		Thread t1 = new Thread(() -> {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("T1 : " + i);
//				Thread.yield();
//			}
//		});
//		Thread t2 = new Thread(() -> {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("T2 : " + i);
//			}
//		});
//
//		t1.start();
//		t2.start();
//
//	}

//Thread.yield(); --> I willing to give my cpu time to someone else with same priority and thats want to run
//1.OS can reject this
//2.It is like a suggestion to the os 
//3.Current thread does not go to WAITING, TIMED-WAITING, BLOCKED
//It does go only to the runnable state 
//Production mai jyda hum ise use nhi krte 
//Fyda kya hai is method ka --> hume scheduling ke bare mai janna hai toh, context switching kaise ho rhi hai, agar dusre thread ko chance jyda dena hai or uski proiority badhani ahi toh

//--------------------------------------------------------------------------------------------------------------------

//	public static void main(String[] args) throws InterruptedException{
//      Thread t1 = new Thread(() -> {
//    	 while(!Thread.currentThread().interrupted()) {
//    		 System.out.println("Running");
//    	 }
//      });
//      
//      t1.start();
//      
//      Thread.sleep(2000);
//      
//      t1.interrupt();
//	}

//Thread --> interrupt flag (default true)
//t1.interrupt() --> Send a signal to t1 thread that it should stop doing what its doing
//we can gracefully handlee --> you can make a thrad run until a condition, canceling a long runnning task, used to stop Thread pool
//isInterrupted() --> return interrupt flag value(true/ false)
//interrupted() --> return interrupt flag value (T/F) but also set it back to false

//--------------------------------------------------------------------------------------------------------------------

//	public static void main(String[] args) {
//		Thread t1 = new Thread( () -> {
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		});
//		
//		System.out.println(t1.isAlive());
//		
//		t1.start();//yha se os mai thread create hue
//		
//		System.out.println(t1.isAlive());
//		
//		try {
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		System.out.println(t1.isAlive());
//
//	}

//isAlive()	 --> start -> Terminate

//--------------------------------------------------------------------------------------------------------------------
//	public static void main(String[] args) {
//    Thread t1 = new Thread(() -> {
//    	System.out.println(Thread.currentThread().getName());
//    });
//    t1.setName("worker - 1");
//    t1.start();
//	}
//currentThread() --> reference	of current running thread

//--------------------------------------------------------------------------------------------------------------------
//public static void main(String[] args) {
//	Thread t1 = new Thread(() -> {
//		System.out.println("Custom- 1 thread running");
//	});
//	
//	Thread t2 = new Thread(() -> {
//		System.out.println("Custom - 2 thread running");
//	});
//	
//	t1.start();
//	System.out.println(t1.getPriority());
//	t1.setPriority(10);
//	System.out.println(t1.getPriority());
//
//	t2.start();
//	System.out.println(t2.getPriority());

	
	
//}
	
//Thread Priority	--  ye bs ek indication hai os ko ,java control nhi kr skta os kisko jyda prority de
//MAX_PRIORITY = 10
//MIN_PRIORITY = 1
//NORM_PRIORITY = 5
//Depends on os : --> may respect prority, or partially respect or not respect 
	

//--------------------------------------------------------------------------------------------------------------------
  public static void main(String[] args) {
	Thread t1 = new Thread(() -> {
		while(true) {
			System.out.println("Running");
		}
	});
	
	t1.setDaemon(true);
	t1.start();
	
	
	try {
		Thread.sleep(2000);//Main thread ko 2 sec ke liye sleep kiya toh 2 sec mai jitni bar Running print hoga uthna hoga
	} catch (Exception e) {
		// TODO: handle exception
	}
	return;
}
  

//Daemon Threads --> Background running thread , Stops immediately once main thread completed
  //like garbage collection --> totally based on Daemon threads
//Threads --> User threads, Daemon thread
  
 
	
	
	
	
	
	
	
	
	
	
}
