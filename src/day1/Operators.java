package day1;

public class Operators {
	
	public static void main (String[] args) {
		
		int x = (5+6);
		int y = (5-6);
		int z = (5*6);
		int a = (5/6);
		int c = 80%2; 
		
		System.out.println(x + "\n");
		
		int d = 20, b = 10; 
		
		System.out.println(d > b); //true
		System.out.println(d < b); //false
		System.out.println(d >= b); //true
		System.out.println(d <= b); //false
		System.out.println(d == b); //false
		System.out.println((d != b) + "\n"); //true
		
		
		boolean e = true, o = false; 
		
		System.out.println(e && o); //false		
		System.out.println(e || o); //true
		System.out.println(!e); //false
		System.out.println(!o + "\n"); //true
		
		
		byte aa = 10;
		aa++; 
		System.out.println(aa + "\n");
		
		short xx = 20;
		
		short res = xx++;
		
		System.out.println(res);
		System.out.println(xx + "\n");
		
		int bb = 20;
		int rest = ++bb;
		System.out.println(rest + "\n" + "\n"+ "\n");
		
		
		
		long k = 10, i = 15, j = 20, l = 25, m = 30, n = 35;
		
		k += 5; i -= 5; j *= 5; l /= 5; m = 5; n %= 5;
		
		System.out.println(k);
		System.out.println(i);
		System.out.println(j);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n + "\n" + "\n"+ "\n" + "\n"+ "\n");
		
		
		
		
		
		int age = 40; 
		String outcome = (age >= 40) ? "Reached the age of Hereafter" : "Still young to fool around"; 
			System.out.println(outcome + "\n"+ "\n");
		
		
		
		
		
		
		
		
	}

}
