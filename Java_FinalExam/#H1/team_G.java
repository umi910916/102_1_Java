//��������1,����2,�A������2�ɡA���J�X��

import java.io.*;
public class Team_G
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String[][] word={{"����","����","�ѥ]��"},
						 {"����","�f����"}
						 };
		int buysum=0,salesum=0,a=0,b=0,c=0,d=0,e=0;
		int akg=0,bkg=0,ckg=0,dpacket=0,epacket=0;	
		int hold=1;
		while(hold!=-1)
		{
			System.out.print("1.�� 2.�R 3.�`�M 4.����\n"+"Input choose:");
			int num=Integer.parseInt(br.readLine());
			switch(num)
			{
				case 1:
					System.out.println("1."+word[0][0]+"2."+word[0][1]+"3."+word[0][2]+"\nInput sale:");
					int sell=Integer.parseInt(br.readLine());
					switch(sell)
					{
						case 1:
							System.out.println("�@���200�� �n��X��:");
							akg=Integer.parseInt(br.readLine());
							a+=akg;
							salesum+=200*a;
							break;
						case 2:
							System.out.println("�@���150�� �n��X��:");
							bkg=Integer.parseInt(br.readLine());
							b+=bkg;
							salesum+=150*b;
							break;
						case 3:
							System.out.println("�@���100�� �n��X��:");
							ckg=Integer.parseInt(br.readLine());
							c+=ckg;
							salesum+=100*c;
							break;
						default:
							System.out.println("error");
							break;
					}
					break;
				case 2:
					System.out.println("1."+word[1][0]+"2."+word[1][1]+"\nInput buy:");
					int buy=Integer.parseInt(br.readLine());
					switch(buy)
					{
						case 1:
							System.out.println("�@�]250�� �n�R�X�]:");
							dpacket=Integer.parseInt(br.readLine());
							d+=dpacket;
							buysum+=d*250;
							break;
						case 2:
							System.out.println("�@�]50�� �n�R�X�]:");
							epacket=Integer.parseInt(br.readLine());
							e+=epacket;
							buysum+=e*50;
							break;
							default:
							System.out.println("error");
							break;
					}
					break;
				case 3:
					System.out.println("�ثe��X:"+salesum+"�ثe�R�J:"+buysum);
					break;
				case 4:
					System.out.println("��:");
					System.out.println("\t"+word[0][0]+":"+a+"�� �@"+200*a+"��");
					System.out.println("\t"+word[0][1]+":"+b+"�� �@"+150*b+"��");
					System.out.println("\t"+word[0][2]+":"+c+"�� �@"+100*c+"��");
					System.out.println("�R:");
					System.out.println("\t"+word[1][0]+":"+d+"�] �@"+d*250+"��");
					System.out.println("\t"+word[1][1]+":"+e+"�] �@"+e*50+"��");
					System.out.println("���J�`�M:"+salesum);
					System.out.println("��X�`�M:"+buysum);
					System.out.println("�b�ȧQ��:"+(salesum-buysum));
					
					PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("bug.txt")));
					pw.println("��:");
					pw.println("\t"+word[0][0]+":"+a+"�� �@"+200*a+"��");
					pw.println("\t"+word[0][1]+":"+b+"�� �@"+150*b+"��");
					pw.println("\t"+word[0][2]+":"+c+"�� �@"+100*c+"��");
					pw.println("�R:");
					pw.println("\t"+word[1][0]+":"+d+"�] �@"+d*250+"��");
					pw.println("\t"+word[1][1]+":"+e+"�] �@"+e*50+"��");
					pw.println("���J�`�M:"+salesum);
					pw.println("��X�`�M:"+buysum);
					pw.println("�b�ȧQ��:"+(salesum-buysum));
					pw.close();
					hold=-1;
					break;
				default:
					System.out.println("error");
					break;
			}
		}
	}
}