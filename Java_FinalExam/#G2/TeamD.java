//�{�������e�A�å��C�X�ʶR�̩Ҫ��ӫ~�B����ƶq�A�����`�M

import java.io.*;

public class TeamD {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = 
				  new BufferedReader(new InputStreamReader(System.in)); 
		  
		  int a1,a2,a3,a4;
		  int b1,b2,b3,b4;
		  int c1,c2,c3,c4;
		  int d1,d2,d3,d4;
		  int tmp = 0;
		  
		  for(;;){
			  System.out.println("========");
			  System.out.println("1.����");
			  System.out.println("2.�׫~");
			  System.out.println("3.���A");
			  System.out.println("4.���G");
			  System.out.println("5.����");
			  System.out.println("========");
			  System.out.print("���:");
			  String str1 = br.readLine();
			  int n1 = Integer.parseInt(str1);
		  
			  if(n1 == 1){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.�C����20��");
					  System.out.println("2.�ᷦ��25��");
					  System.out.println("3.���R��40��");
					  System.out.println("4.�Ťߵ�20��");
					  System.out.println("5.��^");
					  System.out.println("========");
					  System.out.print("���:");
					  String str2 = br.readLine();
					  int n2 = Integer.parseInt(str2);
			  
					  if(n2 == 1){
						  System.out.print("�ƶq:");
						  String str3 = br.readLine();
						  a1 = Integer.parseInt(str3);
						  tmp = tmp + (20 * a1);
					  }
					  if(n2 == 2){
						  System.out.print("�ƶq:");
						  String str4 = br.readLine();
						  a2 = Integer.parseInt(str4);
						  tmp = tmp + (25 * a2);
					  }
					  if(n2 == 3){
						  System.out.print("�ƶq:");
						  String str5 = br.readLine();
						  a3 = Integer.parseInt(str5);
						  tmp = tmp + (40 * a3);
					  }
					  if(n2 == 4){
						  System.out.print("�ƶq:");
						  String str6 = br.readLine();
						  a4 = Integer.parseInt(str6);
						  tmp = tmp + (20 * a4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 2){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.����200��");
					  System.out.println("2.�ަ�150��");
					  System.out.println("3.����100��");
					  System.out.println("4.�Ϧ�100��");
					  System.out.println("5.��^");
					  System.out.println("========");
					  System.out.print("���:");
					  String str11 = br.readLine();
					  int n2 = Integer.parseInt(str11);
			  
					  if(n2 == 1){
						  System.out.print("�ƶq:");
						  String str7 = br.readLine();
						  b1 = Integer.parseInt(str7);
						  tmp = tmp + (200 * b1);
					  }
					  if(n2 == 2){
						  System.out.print("�ƶq:");
						  String str8 = br.readLine();
						  b2 = Integer.parseInt(str8);
						  tmp = tmp + (150 * b2);
					  }
					  if(n2 == 3){
						  System.out.print("�ƶq:");
						  String str9 = br.readLine();
						  b3 = Integer.parseInt(str9);
						  tmp = tmp + (100 * b3);
					  }
					  if(n2 == 4){
						  System.out.print("�ƶq:");
						  String str10 = br.readLine();
						  b4 = Integer.parseInt(str10);
						  tmp = tmp + (100 * b4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 3){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.���160��");
					  System.out.println("2.���l200��");
					  System.out.println("3.�D��150��");
					  System.out.println("4.�p��100��");
					  System.out.println("5.��^");
					  System.out.println("========");
					  System.out.print("���:");
					  String str12 = br.readLine();
					  int n2 = Integer.parseInt(str12);
			  
					  if(n2 == 1){
						  System.out.print("�ƶq:");
						  String str13 = br.readLine();
						  c1 = Integer.parseInt(str13);
						  tmp = tmp + (160 * c1);
					  }
					  if(n2 == 2){
						  System.out.print("�ƶq:");
						  String str14 = br.readLine();
						  c2 = Integer.parseInt(str14);
						  tmp = tmp + (200 * c2);
					  }
					  if(n2 == 3){
						  System.out.print("�ƶq:");
						  String str15 = br.readLine();
						  c3 = Integer.parseInt(str15);
						  tmp = tmp + (150 * c3);
					  }
					  if(n2 == 4){
						  System.out.print("�ƶq:");
						  String str16 = br.readLine();
						  c4 = Integer.parseInt(str16);
						  tmp = tmp + (100 * c4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 4){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.�h��100��");
					  System.out.println("2.���s�G60��");
					  System.out.println("3.��K90��");
					  System.out.println("4.���K��150��");
					  System.out.println("5.��^");
					  System.out.println("========");
					  System.out.print("���:");
					  String str17 = br.readLine();
					  int n2 = Integer.parseInt(str17);
			  
					  if(n2 == 1){
						  System.out.print("�ƶq:");
						  String str18 = br.readLine();
						  d1 = Integer.parseInt(str18);
						  tmp = tmp + (100 * d1);
					  }
					  if(n2 == 2){
						  System.out.print("�ƶq:");
						  String str19 = br.readLine();
						  d2 = Integer.parseInt(str19);
						  tmp = tmp + (60 * d2);
					  }
					  if(n2 == 3){
						  System.out.print("�ƶq:");
						  String str20 = br.readLine();
						  d3 = Integer.parseInt(str20);
						  tmp = tmp + (90 * d3);
					  }
					  if(n2 == 4){
						  System.out.print("�ƶq:");
						  String str21 = br.readLine();
						  d4 = Integer.parseInt(str21);
						  tmp = tmp + (150 * d4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 5){
				  System.out.println("�`�B:" + tmp);
				  break;
			  }
		  }
	}
}