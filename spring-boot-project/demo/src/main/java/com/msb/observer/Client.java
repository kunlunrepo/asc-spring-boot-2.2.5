package com.msb.observer;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 14:30
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象Obserable
		ConcreteSubject subject = new ConcreteSubject();

		// 创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();

		//将上面三个观察者对象添加到目标对象subject的观察者容器中
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);

		// 1.改变subject对象的状态
		subject.set(3000);
		System.out.println("=============状态修改了");
		// 观察者的状态发送了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());

		// 2.改变subject对象的状态
		subject.set(600);
		System.out.println("=============状态修改了");
		// 观察者的状态发送了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());

		// 3.移除一个订阅者
		subject.deleteObserver(obs2);
		subject.set(100);
		System.out.println("=============状态修改了");
		// 观察者的状态发送了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState()); // 移除后就订阅不到了
		System.out.println(obs3.getMyState());

	}
}
