package a_mainThread;

/**
 * ������ϰ��λ��
 * 1. ��̬�����������������
 * 2. ʵ�������������������
 * 3. ��ͬ���������̵߳�����
 * 
 * @author wangguozheng
 *
 */
public class A_MainThread {
	public static void main(String[] args) {
		//��ӡ:XXX �� �� XXX �߳�
		//ע�⣬ÿһ���඼����һ��Class�������� class ��ʾ�������
		System.out.println("��: "+A_MainThread.class.getName()+" ���߳�: "+Thread.currentThread().getName());
		
		//2. �������show()�����Ʋ����´���Ľ����������ԭ��

		
		//3. �������Test1�����Ʋ����´���Ľ����������ԭ��

		
		//4. �ó���˯��3��

		
		//5. �������Test2�����Ʋ����´���Ľ����������ԭ��

	}
	
	public static void show(){
		//��ӡ:XXX �� �� XXX �߳�
		
	}

}

class Test1{
	public void show(){
		//��ӡ:XXX �� �� XXX �߳�
		
	}
	public static void staticShow(){
		//��ӡ:XXX �� �� XXX �߳�
		
	}
}
