//��������1,����2,�A������2�ɡA���J�X��

import  java.io.*;
public class TeamB {
		public static void main(String[] args) throws IOException{
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		int bsum=0,sum=0,a=0,b=0,c=0,d=0,e=0;
		int akg=0,bkg=0,ckg=0,dp=0,ep=0;
		boolean cheeck=true;
		do{
			System.out.print("1. �� 2. �R 3. �`�M 4. ����\n"+"��J���:");
			int num=Integer.parseInt(br.readLine());
			switch(num){
				case 1:
					System.out.println("1.���� 2. ���� 3. �ѥ]��\n"+"��J���:");
					int sell=Integer.parseInt(br.readLine());
					switch(sell){
						case 1:
							System.out.println("�@���200�� �n��X��:");
							akg=Integer.parseInt(br.readLine());
							a+=akg;
							sum+=200*a;
							break;
						case 2:
							System.out.println("�@���150�� �n��X��:");
							bkg=Integer.parseInt(br.readLine());
							b+=bkg;
							sum+=150*b;
							break;
						case 3:
							System.out.println("�@���100�� �n��X��:");
							ckg=Integer.parseInt(br.readLine());
							c+=ckg;
							sum+=100*c;
							break;
						default:
						System.out.println("error");
						break;
					}
					break;
				case 2:
					System.out.println("1.���� 2. �f����\n"+"��J���:");
					int buy=Integer.parseInt(br.readLine());
					switch(buy){
						case 1:
							System.out.println("�@�]250�� �n�R�X�]:");
							dp=Integer.parseInt(br.readLine());
							d+=dp;
							bsum+=d*250;
							break;
						case 2:
							System.out.println("�@�]50�� �n�R�X�]:");
							ep=Integer.parseInt(br.readLine());
							e+=ep;
							bsum+=e*50;
							break;
						
							default:
							System.out.println("error");
							break;
					}
					break;
				case 3:
					System.out.println("�ثe��X:"+sum+"�ثe�R�J:"+bsum);
					break;
				case 4:
					System.out.print("��:\n"+"����:"+a+"�� �@"+200*a+"��\n����:"+b+"�� �@"+150*b+"��\n�ѥ]��:"+c+"�� �@"+100*c+"��\n");
					System.out.print("�R:\n"+"����:"+d+"�] �@"+d*250+"��\n�f����:"+e+"�] �@"+e*50+"��\n");
					System.out.print("���J�`�M:"+sum+"\n��X�`�M:"+bsum+"\n�b�ȧQ��:"+(sum-bsum)+"\nEXIT");
					try{
						PrintWriter pw=new PrintWriter
						(new BufferedWriter(new FileWriter("bug.txt")));
						pw.println("��:");
						pw.println("����:"+a+"�� �@"+200*a+"��");
						pw.println("����:"+b+"�� �@"+150*b+"��");
						pw.println("�ѥ]��:"+c+"�� �@"+100*c+"��");
						pw.println("�R:");
						pw.println("����:"+d+"�] �@"+d*250+"��");
						pw.println("�f����:"+e+"�] �@"+e*50+"��");
						pw.print("���J�`�M:"+sum+"\n��X�`�M:"+bsum+"\n�b�ȧQ��:"+(sum-bsum)+"\n");
						pw.close();
						}
					catch(IOException w){
						System.out.println("error");
					}
					cheeck=false;
					break;
			default:
				System.out.println("error");
				break;
			}
		}while(cheeck);
		}
}

 

 

 

 