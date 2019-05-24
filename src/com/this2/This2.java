package com.this2;

public class This2 {
	int x = 188, y;		//声明成员变量

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2 e = new This2();
		e.f();
	}
	
	void f() {
		int x = 3;	//声明局部变量
		y = x; //y得到的值是3，而非成员变量x的值（188）；成员变量被隐藏
		System.out.println("y=" + y);
		
		y = this.x; //y得到的值是成员变量x的值，即：188；通过this引用成员变量
		System.out.println("y=" + y);
	}

}
