package a_mainThread;

/**
 * 本类练习如何获得
 * 1. 静态方法的所在类的名称
 * 2. 实例方法的所在类的名称
 * 3. 不同方法所在线程的名称
 * 
 * @author wangguozheng
 *
 */
public class A_MainThread {
	public static void main(String[] args) {
		//打印:XXX 类 再 XXX 线程
		//注意，每一个类都会有一个Class类型引用 class 表示自身的类
		System.out.println("类: "+A_MainThread.class.getName()+" 在线程: "+Thread.currentThread().getName());
		
		//2. 补充完成show()，并推测以下代码的结果，并解释原因

		
		//3. 补充完成Test1，并推测以下代码的结果，并解释原因

		
		//4. 让程序“睡”3秒

		
		//5. 补充完成Test2，并推测以下代码的结果，并解释原因

	}
	
	public static void show(){
		//打印:XXX 类 再 XXX 线程
		
	}

}

class Test1{
	public void show(){
		//打印:XXX 类 再 XXX 线程
		
	}
	public static void staticShow(){
		//打印:XXX 类 再 XXX 线程
		
	}
}
