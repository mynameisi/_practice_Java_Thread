package a_mainThread;
public class C_Thread {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		
		
		
		long end = System.currentTimeMillis();
		System.out.println("��ʱ: "+(end-start)/100+"����"); //�ܹ�����5�룬����50����
	}
}

class XiYiFu {		//��"ϴ�·�"������װ��һ���߳�����, ģ����Ҫ50����ϴ�·�

}

class ZuoFan extends Thread {		//��"����"������װ��һ���߳����У�ģ����Ҫ20��������

}


