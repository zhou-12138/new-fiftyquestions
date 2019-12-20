package boss;

import java.util.Random;

public class Exe {		
	static String a[] = new String [50];
	public static  void main(String[] args)  {
		addexe();	
		subexe();
		binexe();
	}
	
	public static void  subexe() {
		subquestions b = new subquestions();
		System.out.println("以下是减法算式：");
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<50;) {
			a[i] = b.generatebinaryoperation('-');
			int flag=0;
			for (int k1=0;k1<i;k1++) {
				if(a[i].equals(a[k1])==false) {a[i]=a[i];}
				else {flag=1;}
			}
			if(flag==1) continue; 
			System.out.print((i+1)+":  \t"+a[i]+"=\t");
			i++;
			if(i%5==0)
				System.out.println();
		}
	}
	public static void  addexe() {
		addquestions b = new addquestions();
		System.out.println("以下是加法算式：");
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<50;) {
			a[i] = b.generatebinaryoperation('+');
			int flag=0;
			for (int k1=0;k1<i;k1++) {
				if(a[i].equals(a[k1])==false) {a[i]=a[i];}
				else {flag=1;}
			}
			if(flag==1) continue; 
			System.out.print((i+1)+":  \t"+a[i]+"=\t");
			i++;
			if(i%5==0)
				System.out.println();
		}
	}
	public static void  binexe() {
		System.out.println("以下是混合算式：");
		System.out.println("-----------------------------------------------------------------------------");
		Random random = new Random();

		for(int i=0;i<50;) {		
			int x = 0;
		    x = random.nextInt(2);
			if(x == 1) {
				addquestions b = new addquestions();
				a[i] = b.generatebinaryoperation('+');
			}
			else {
				subquestions b = new subquestions();
				a[i] = b.generatebinaryoperation('-');
			}
			int flag=0;
			for (int k1=0;k1<i;k1++) {
				if(a[i].equals(a[k1])==false) {a[i]=a[i];}
				else {flag=1;}
			}
			if(flag==1) continue; 
			System.out.print((i+1)+":  \t"+a[i]+"=\t");
			i++;
			if(i%5==0)
				System.out.println();
		}
	}
}

