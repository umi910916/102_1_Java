import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SSS {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int[][] fianl = new int[4][4];
		int out=0;
		int money = 0;
		while(out==0){
			System.out.println("1����,2�׫~,3���A,4���G,5���}...");
			String str = br.readLine();
			int count = Integer.parseInt(str);
				switch(count){
					case 1:
						int out1 = 0;
						while(out1==0){
							System.out.println("1.�C����20��");
							System.out.println("2.�ᷦ��25��");
							System.out.println("3.���R��40��");
							System.out.println("4.�Ťߵ�20��");
							System.out.println("5.���}...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*20+"��");
								fianl[0][0]+=many;
								money=money+many*20;
							}
							if(buy ==2){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*25+"��");
								fianl[0][1]+=many;
								money=money+many*25;
							}
							if(buy ==3){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*40+"��");
								fianl[0][2]+=many;
								money=money+many*40;
							}
							if(buy ==4){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*20+"��");
								fianl[0][3]+=many;
								money=money+many*20;
							}
							if(buy ==5){
								out1=1;
							}
						}
						break;
					case 2:
						int out2 = 0;
						while(out2==0){
							System.out.println("1.����200��");
							System.out.println("2.�ަ�150��");
							System.out.println("3.����100��");
							System.out.println("4.�Ϧ�100��");
							System.out.println("5.���}...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*200+"��");
								fianl[1][0]+=many;
								money=money+many*200;
							}
							if(buy ==2){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*150+"��");
								fianl[1][1]+=many;
								money=money+many*150;
							}
							if(buy ==3){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"��");
								fianl[1][2]+=many;
								money=money+many*100;
							}
							if(buy ==4){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"��");
								fianl[1][3]+=many;
								money=money+many*100;
							}
							if(buy ==5){
								out2=1;
							}
						}
						break;
					case 3:
						int out3 = 0;
						while(out3==0){
							System.out.println("1.����160��");
							System.out.println("2.���l200��");
							System.out.println("3.�D��150��");
							System.out.println("4.�p��100��");
							System.out.println("5.���}...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*160+"��");
								fianl[2][0]+=many;
								money=money+many*160;
							}
							if(buy ==2){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*200+"��");
								fianl[2][1]+=many;
								money=money+many*200;
							}
							if(buy ==3){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*150+"��");
								fianl[2][2]+=many;
								money=money+many*150;
							}
							if(buy ==4){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"��");
								fianl[2][3]+=many;
								money=money+many*100;
							}
							if(buy ==5){
								out3=1;
							}
						}
						break;
					case 4:
						int out4 = 0;
						while(out4==0){
							System.out.println("1.�h��100��");
							System.out.println("2.���s�G60��");
							System.out.println("3.��K90��");
							System.out.println("4.���K��150��");
							System.out.println("5.���}...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"��");
								fianl[3][0]+=many;
								money=money+many*100;
							}
							if(buy ==2){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*60+"��");
								fianl[3][1]+=many;
								money=money+many*60;
							}
							if(buy ==3){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*90+"��");
								fianl[3][2]+=many;
								money=money+many*90;
							}
							if(buy ==4){
								System.out.println("�ƶq");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*150+"��");
								fianl[3][3]+=many;
								money=money+many*150;
							}
							if(buy ==5){
								out4=1;
							}
						}
						break;
					case 5:
						out = 1;
						break;
				}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(fianl[i][j]!=0){
					if(i==0){
						if(j==0){
							System.out.println("�C����20��*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("�ᷦ��25��*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("���R��40��*"+fianl[i][j]);
						}
						else{
							System.out.println("�Ťߵ�20��*"+fianl[i][j]);
						}
					}
					else if(i==1){
						if(j==1){
							System.out.println("����200��*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("�ަ�150��*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("����100��*"+fianl[i][j]);
						}
						else{
							System.out.println("�Ϧ�100��*"+fianl[i][j]);
						}
					}
					else if(i==2){
						if(j==0){
							System.out.println("����160��*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("���l200��*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("�D��150��*"+fianl[i][j]);
						}
						else{
							System.out.println("�p��100��*"+fianl[i][j]);
						}
					}
					else{
						if(j==0){
							System.out.println("�h��100��*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("���s�G60��*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("��K90��*"+fianl[i][j]);
						}
						else{
							System.out.println("���K��150��*"+fianl[i][j]);
						}
					}
				}
			}
		}
		System.out.println("�`�B"+money);
	}
}