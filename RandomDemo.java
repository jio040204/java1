package ex;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random  r= new Random();
		
		for(int i=1;i<6;i++)
			System.out.println(r.nextInt(100));
	}
}
