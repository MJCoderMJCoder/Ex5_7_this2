package com.this2;

public class This2 {
	int x = 188, y;		//������Ա����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2 e = new This2();
		e.f();
	}
	
	void f() {
		int x = 3;	//�����ֲ�����
		y = x; //y�õ���ֵ��3�����ǳ�Ա����x��ֵ��188������Ա����������
		System.out.println("y=" + y);
		
		y = this.x; //y�õ���ֵ�ǳ�Ա����x��ֵ������188��ͨ��this���ó�Ա����
		System.out.println("y=" + y);
	}

}
