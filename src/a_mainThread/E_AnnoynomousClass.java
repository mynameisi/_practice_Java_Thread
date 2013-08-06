package a_mainThread;
public class E_AnnoynomousClass {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new XiYiFu_3());	//������ϴ�·�����Ӧ�̶߳���
		t1.start();					//����ϴ�·��߳�

		Thread t2 = new Thread(new ZuoFan_3());	//��������������Ӧ�̶߳���
		t2.start();					//���������߳�
		
		t2.join();					//main�̹߳���ֱ�� �����꣬��Ҫ2��(����20����)
		t1.join();					//main�̹߳���ֱ�� �·�ϴ�꣬��Ҫ5��(��Ҫ50����)
		
		long end = System.currentTimeMillis();
		System.out.println("��ʱ: "+(end-start)/100+"����"); //�ܹ�����5�룬����50����
	}
}

class XiYiFu_3 implements Runnable {		//��"ϴ�·�"������װ��һ���߳�����
	public void run() {
		try {
			Thread.sleep(5000);		//�õ�ǰ�̹߳���5�룬ģ����Ҫ50����ϴ�·�
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ϴ�·����");
	}
}

class ZuoFan_3 implements Runnable {		//��"����"������װ��һ���߳�����
	public void run() {
		try {
			Thread.sleep(2000);		//�õ�ǰ�̹߳���2�룬ģ����Ҫ20��������
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("�������");
	}
}
