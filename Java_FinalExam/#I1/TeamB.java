//��m�g��

import java.io.*;


public class TeamB {
	public static void main(String[] args)throws IOException
	{
		String yy[]={"�s","��","�L","��","�v","��","��","�m","��","�h"};
		String xx[]={"�B"};
		
		String str1="Teemo rides a thin line between chipper compatriot and unrepentant killer,but there`s no one else I`d rather have as a friend.";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ϥΪ̿�J�n�˯�����r:");
		
		String str2=br.readLine();
		char ch =str2.charAt(0);
		int num =str1.indexOf(ch);
		
		
		
		
		int a,b,num1;
		num1=num+1;
		a=num1%10;
		b=num1/10;
		
		if(a==8&&b==6)//�P�_�O�_����killer
		System.out.println("Teemo�b��"+ yy[6]+xx[0]+yy[8] + "�Ӧ�m");
		else
			System.out.println("Teemo is not here");
		

	}

}
