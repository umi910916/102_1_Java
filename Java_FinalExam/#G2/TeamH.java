//��ܹL�{BUG�Ӧh�A�`���B���~�B���������|��"�C����20��*0"

import java.io.*;
public class TeamH {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br =	new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("1.����2.�׫~3.���A4.���G5.���� ") ;
		System.out.print("��� : ") ;
		String str = br.readLine();
		int n = Integer.parseInt(str);

		String[][] sum = {{"�C����20��" , "�ᷦ��25��" , "���R��40��" , "�Ťߵ�20��" , "��^"} ,
				{"����200��" , "�ަ�150��" , "����100��" , "�Ϧ�100��" , "��^"} ,
				{"���160��" , "���l200��" , "�D��150��" , "�p��100��" , "��^"} ,
				{"�h��100��" , "���s�G60��" , "��K90��" , "���K��150��" , "��^"}} ;
		int[][] m = new int[50][3] ;
		int totle = 0 ;
		int i=0,j=0,a=0,b=0 ;
		int x = 0 , y = 0 ;
		while(x >= 0)
			{
				y = 0 ;
				switch(n)
				{
					case 1 :
						System.out.print("\n1." + sum[i][j] + "\n2." + sum[i][j+1] + "\n3." + sum[i][j+2] + "\n4." + sum[i][j+3] + "\n5." + sum[i][j+4] + "\n") ;
						System.out.print("��� : ") ;
						String str1 = br.readLine() ; 
						int num1 = Integer.parseInt(str1) ;
						System.out.print("�ƶq : ") ;
						String n1 = br.readLine() ; 
						int c1 = Integer.parseInt(n1) ;
						while(y >= 0)
						{
							switch(num1)
							{
								case 1:
									totle += 20 * c1 ;
									m[a][b] = 0 ;
									m[a][b+1] = 0 ;
									m[a][b+2] = c1 ;
									a++ ;
									break ;
								case 2 :
									totle += 25 * c1 ;
									m[a][b] = 0 ;
									m[a][b+1] = 1 ;
									m[a][b+2] = c1 ;
									a++ ;
									break ;
								case 3 :
									totle += 40 * c1 ;
									m[a][b] = 0 ;
									m[a][b+1] = 2 ;
									m[a][b+2] = c1 ;
									a++ ;
									break ;
								case 4 :
									totle += 20 * c1 ;
									m[a][b] = 0 ;
									m[a][b+1] = 3 ;
									m[a][b+2] = c1 ;
									a++ ;
									break ;
								case 5 :
									y = -1 ;
									break ;
							}
							if(y != -1)
							{
								System.out.print("��� : ") ;
								str1 = br.readLine() ; 
								num1 = Integer.parseInt(str1) ;
								if(num1 == 5)
								;
								else
								{
									System.out.print("�ƶq : ") ;
									n1 = br.readLine() ; 
									c1 = Integer.parseInt(n1) ;
								}
							}
						}
						break ;
					case 2 :
						i=1;
						System.out.print("��� : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
						System.out.print("���X : ");
						String str2 = br.readLine(); 
						int num2 = Integer.parseInt(str2);
						System.out.print("�ƶq : ");
						String n2 = br.readLine(); 
						int c2 = Integer.parseInt(n2);
						while(y>=0)
						{
							switch(num2)
							{
								case 1 :
									totle+=20*c2;
									m[a][b]=1;
									m[a][b+1]=0;
									m[a][b+2]=c2;
									a++;
									break;
								case 2 :
									totle+=25*c2;
									m[a][b]=1;
									m[a][b+1]=1;
									m[a][b+2]=c2;
									a++;
									break;
								case 3 :
									totle+=40*c2;
									m[a][b]=1;
									m[a][b+1]=2;
									m[a][b+2]=c2;
									a++;
									break;
								case 4 :
									totle+=20*c2;
									m[a][b]=1;
									m[a][b+1]=3;
									m[a][b+2]=c2;
									a++;
									break;
								case 5 :
									y=-1;
									break;

							}
							if(y!=-1)
							{
								System.out.print("���X : ");
								str2 = br.readLine(); 
								num2 = Integer.parseInt(str2);
								if(num2==5)
									;
								else
								{
									System.out.print("�ƶq : ");
									n2 = br.readLine();
									c2 = Integer.parseInt(n2);
								}
							}
						}
						break;
					case 3 :
						i=2;
						System.out.print("��� : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
						System.out.print("���X : ");
						String str3 = br.readLine(); 
						int num3 = Integer.parseInt(str3);
						System.out.print("�ƶq : ");
						String n3 = br.readLine(); 
						int c3 = Integer.parseInt(n3);
						while(y >= 0)
						{
							switch(num3)
							{
								case 1 :
									totle+=20*c3;
									m[a][b]=2;
									m[a][b+1]=0;
									m[a][b+2]=c3;
									a++;
									break;
								case 2 :
									totle+=25*c3;
									m[a][b]=2;
									m[a][b+1]=1;
									m[a][b+2]=c3;
									a++;
									break;
								case 3 :
									totle+=40*c3;
									m[a][b]=2;
									m[a][b+1]=2;
									m[a][b+2]=c3;
									a++;
									break;
								case 4 :
									totle+=20*c3;
									m[a][b]=2;
									m[a][b+1]=3;
									m[a][b+2]=c3;
									a++;
									break;
								case 5 :
									y=-1;
									break;

							}
							if(y!=-1)
							{
								System.out.print("���X : ");
								str3 = br.readLine();
								num3 = Integer.parseInt(str3);
								if(num3==5)
									;
								else
								{
									System.out.print("�ƶq : ");
									n3 = br.readLine();
									c3 = Integer.parseInt(n3);
								}
							}
						}
						break;
					case 4 :
						i=3;
						System.out.print("��� : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
						System.out.print("���X : ");
						String str4 = br.readLine(); 
						int num4 = Integer.parseInt(str4);
						System.out.print("�ƶq : ");
						String n4 = br.readLine(); 
						int c4 = Integer.parseInt(n4);
						while(y>=0)
						{
							switch(num4)
							{
								case 1 :
									totle+=20*c4;
									m[a][b]=3;
									m[a][b+1]=0;
									m[a][b+2]=c4;
									break;
								case 2 :
									totle+=25*c4;
									m[a][b]=3;
									m[a][b+1]=1;
									m[a][b+2]=c4;
									break;
								case 3 :
									totle+=40*c4;
									m[a][b]=3;
									m[a][b+1]=2;
									m[a][b+2]=c4;
									break;
								case 4 :
									totle+=20*c4;
									m[a][b]=3;
									m[a][b+1]=3;
									m[a][b+2]=c4;
									break;
								case 5 :
									y=-1;
									break;

							}
							if(y!=-1)
							{
								System.out.print("���X : ");
								str4 = br.readLine();
								num4 = Integer.parseInt(str4);
								if(num4==5)
									;
								else
								{
									System.out.print("�ƶq : ");
									n4 = br.readLine();
									c4 = Integer.parseInt(n4);
								}
							}
						}
						break;
					case 5 :
						x=-1;
						break;
				}
					if(x!=-1) 
					{
						System.out.print("1.����2.�׫~3.���A4.���G5.���� ") ;
						System.out.print("��� : ") ;
						str = br.readLine() ;
						n = Integer.parseInt(str) ;
					}
			}
				int c = 0 , d = 0 ;
				for(; c <= a ; c++)
					System.out.print(sum[m[c][d]][m[c][d+1]] + "*" + m[c][d+2] + "\n") ;
					System.out.println("�`�B: "+totle) ;
	}
}
