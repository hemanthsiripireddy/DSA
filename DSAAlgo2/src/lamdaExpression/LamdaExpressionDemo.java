package lamdaExpression;

public class LamdaExpressionDemo {
	public static void method() {
		A object=() -> System.out.println("hi");
		object.show();
		A obj=() -> {
			System.out.println("hi");
			System.out.println("hello");
		};
		obj.show();
		A obj1=new A() {
			public void show() {
				System.out.println("my name is method");
			}
		};
		obj1.show();
		B b=new B() {
			public void eat() {
				System.out.println("I'm eating");
				System.out.println("I'm sleeping");
			}
			public void sleep() {
				System.out.println("I'm sleeping");
			}
		};
		b.sleep();
	}

}
