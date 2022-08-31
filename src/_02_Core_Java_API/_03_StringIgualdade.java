package _02_Core_Java_API;

public class _03_StringIgualdade {
			String name;
			public static void main(String[] args) {
			_03_StringIgualdade t1 = new _03_StringIgualdade(); //Objeto_1
			_03_StringIgualdade t2 = new _03_StringIgualdade();	//Objeto_2
			_03_StringIgualdade t3 = t1;						//Objeto_1
			System.out.println(t1 == t3);		// true
			System.out.println(t1 == t2);		// false
			System.out.println(t1.equals(t2));	// false equals é a mesma coisa de ==
		}
	}