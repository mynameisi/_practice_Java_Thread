package a_mainThread;
public class D_Runnable {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		

		long end = System.currentTimeMillis();
		System.out.println("耗时: "+(end-start)/100+"分钟"); //总共消耗5秒，虚拟50分钟
	}
}

class XiYiFu_2 {		//把"洗衣服"的任务装到一个线程类中

}

class ZuoFan_2 {		//把"做饭"的任务装到一个线程类中

}


