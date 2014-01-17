import java.util.*;
import java.io.*;
public class TeamH {

	public static void main(String[] args)throws IOException
	{
		PrintWriter pc=new PrintWriter(new BufferedWriter(new FileWriter("PUCCA.txt")));//�s�W�ɮ�
		for(int i = 0 ; i < 20 ; i++)
		{
			int j=0 ;
			pc.print(i + 1 + "\t") ;
			j++ ;
			for(; j < 6 ; j++)
				pc.print((int)( Math.random() * 10+1) + "\t") ;
			pc.println() ;

		}
		pc.close() ;

		int[][] pu = new int [20][7] ;
		BufferedReader f = 
		new BufferedReader(new FileReader("PUCCA.txt")) ;

		for(int a = 0 ; a < 20 ; a++)
		{ 
			String str1 = f.readLine() ;
			for(int b = 0 ; b < 6 ; b++)
			{
				StringTokenizer s = new StringTokenizer(str1) ;
				while(s.hasMoreTokens())
				{
					pu[a][b] = Integer.parseInt(s.nextToken()) ;
					System.out.print(pu[a][b] + "\t") ;
					b++ ;
				}
				pu[a][6] = pu[a][1] + pu[a][2] + pu[a][3] + pu[a][4] + pu[a][5] ;
			}
			System.out.println(pu[a][6]) ;

		}

		f.close() ;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("��J�s�� : ") ;
		String str = br.readLine() ;
		int IP = Integer.parseInt(str) ;
		for(int x = 0 ; x < 20 ; x++)
		{ 
			for(int y = 0 ; y < 20 ; y++) 
			{ 
				if(pu[x][6] > pu[y][6])
				{
		
					for(int m = 0 ; m < 7 ; m++)
					{ 
						int tmp = pu[x][m] ; 
						pu[x][m] = pu[y][m] ; 
						pu[y][m] = tmp ; 
					} 
				}
			} 
		}
		int n = 0 ;
		while(n < 20)
		{
			if(pu[n][0] == IP)
			{
				System.out.println("�s�� : "+pu[n][0]) ;
				System.out.println("�Ĥ@����Q : "+pu[n][1]+"000") ;
				System.out.println("�ĤG����Q : "+pu[n][2]+"000") ;
				System.out.println("�ĤT����Q : "+pu[n][3]+"000") ;
				System.out.println("�ĥ|����Q : "+pu[n][4]+"000") ;
				System.out.println("�Ĥ�����Q : "+pu[n][5]+"000") ;
				System.out.println("�`��Q : "+pu[n][6]+"000") ;
				n++ ;
				System.out.println("�W�� :" + n) ;
				n = 20 ;
			}
			else
			{
				n++ ;
			}
		}
	}
}
