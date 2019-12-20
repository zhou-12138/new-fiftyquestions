package com.minirisoft;

import java.util.Random;


public class Wushiti {
	static int  zhi[]=new int[50];
	static String[] suanshu=new String[50]; 
	static int shu_z=0;
	static int shu_y=0;
	static int fu=0;
	static int jieguo=0;

	public static void main(String[] args) {
    suanshushi();           //Ëæ»úÉú³ÉÎåÊ®Ìâ
    daan();                 //Êä³öÎåÊ®Ìâ´ð°¸
	}
	public static void suanshushi() {
		Random r=new Random(); 
		System.out.println("ÌâÄ¿ÈçÏÂ£º ");
	    System.out.println("¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª");
		for(int i=0;i<50;) {
			shu_z=r.nextInt(101);
			shu_y=r.nextInt(101);
			fu=r.nextInt(2);
			if(fu==0) {
			suanshu[i]=shu_z+""+"-"+shu_y+"";
			zhi[i]=jieguo=shu_z-shu_y;}
			else {
			suanshu[i]=shu_z+""+"+"+shu_y+"";
				zhi[i]=jieguo=shu_z+shu_y;}	
			if(jieguo<=100&&jieguo>=0) {
				int flag=0;
				for (int k=0;k<i;k++) {
					if(suanshu[i].equals(suanshu[k])==false) {suanshu[i]=suanshu[i];}
					else {flag=1;}
				}
				if(flag==1) continue; 
				System.out.print((i+1)+":  \t"+suanshu[i]+"=\t");
				i++;
				if(i%5==0) {System.out.println();}
			}
			
			
		}
	}
	

	public static void daan() {
	    System.out.println("ÌâÄ¿´ð°¸ÈçÏÂ£º ");
	    System.out.println("¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª");
		int j;
		for(j=0;j<50;) {
			System.out.print((j+1)+":  \t"+zhi[j]+"\t");
		j++;
		if(j%5==0)
			System.out.println();
		}
	}
		
	
}
