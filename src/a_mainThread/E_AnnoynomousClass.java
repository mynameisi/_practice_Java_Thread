package a_mainThread;
public class E_AnnoynomousClass {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new XiYiFu_3());	//创建“洗衣服”对应线程对象
		t1.start();					//启动洗衣服线程

		Thread t2 = new Thread(new ZuoFan_3());	//创建“做饭”对应线程对象
		t2.start();					//启动做饭线程
		
		t2.join();					//main线程挂起，直到 饭做完，需要2秒(虚拟20分钟)
		t1.join();					//main线程挂起，直到 衣服洗完，需要5秒(需要50分钟)
		
		long end = System.currentTimeMillis();
		System.out.println("耗时: "+(end-start)/100+"分钟"); //总共消耗5秒，虚拟50分钟
	}
}

class XiYiFu_3 implements Runnable {		//把"洗衣服"的任务装到一个线程类中
	public void run() {
		try {
			Thread.sleep(5000);		//让当前线程挂起5秒，模拟需要50分钟洗衣服
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("洗衣服完毕");
	}
}

class ZuoFan_3 implements Runnable {		//把"做饭"的任务装到一个线程类中
	public void run() {
		try {
			Thread.sleep(2000);		//让当前线程挂起2秒，模拟需要20分钟做饭
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("做饭完毕");
	}
}
