//��J��invetory.txt���ۦP�ƶq�����t�B

import java.io.*;
public class G {
public static void main(String[] args) throws IOException{
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
	String[] name1={"�F��","�d�~�H��","�󭺯Q","�e��","���k","�V�ήL��","����"};
	String[] name2={"����","����","�պ�","�C��","���","���","����","����","�Ⱥ�"};
	String[] name3={"�ե��N","�եɼY","�եɦչ�","��¯","�ȼY","�Ȧչ�","��¯","���Y","���չ�","�����N","���ɼY","���ɦչ�"};

	int[] money1={10000,100000,700,40,200,350,3000};
	int[] money2={200,900,4000,700,700,500,4000,10000,5000};
	int[] money3={500,900,1000,700,1000,1200,4000,10000,15300,5000,10000,24000};
	int[][] num1=new int[7][3];
	int[][] num2=new int[9][3];
	int[][] num3=new int[12][3];
	
	int sum1=0;
	int	sum2=0;
	int sum3=0;
	
	try{
		BufferedReader tr =
				new BufferedReader(new FileReader("inventory.txt"));
		for(int i=0;i<3;i++){
			String str = tr.readLine();
			String[] a = str.split(",");
			for(int j = 0; j < a.length ; j++ ){
				if(i==0)
					num1[j][1]=Integer.parseInt(a[j]);
				else if(i==1)
					num2[j][1]=Integer.parseInt(a[j]);
				else if(i==2)
					num3[j][1]=Integer.parseInt(a[j]);
			}
		}
		tr.close();
	}catch(IOException e){
		System.out.println("error");
	}
	for(int i = 0; i < 7 ; i++){
		num1[i][0] = Integer.parseInt(br.readLine());
		num1[i][2] = (num1[i][0]-num1[i][1]);
	}
	for(int i = 0;i < 7 ; i++){
		System.out.println(name1[i]+"�t�B:"+num1[i][2]+"�t��:"+(num1[i][2]*money1[i]));
		sum1 += (num1[i][2]*money1[i]);
	}
	System.out.println("�t�B�`��:"+sum1);
	for(int i = 0;i < 9 ; i++){
		num2[i][0] = Integer.parseInt(br.readLine());
		num2[i][2] = num2[i][0]-num2[i][1];
	}
	for(int i = 0; i < 9 ;i++){
		System.out.println(name2[i]+"�t�B:"+num2[i][2]+"�t��:"+(num2[i][2]*money2[i]));
		sum2 += (num2[i][2]*money2[i]);
	}
	System.out.println("�t�B�`��:"+sum2);
	for(int i = 0; i < 12 ;i++){
		num3[i][0] = Integer.parseInt(br.readLine());
		num3[i][2] = num3[i][0]-num3[i][1];
	}
	for(int i = 0 ; i < 12 ; i++){
		System.out.println(name3[i]+"�t�B:"+num3[i][2]+"�t��:"+(num3[i][2]*money3[i]));
		sum3 += (num3[i][2]*money3[i]);
	}
	System.out.println("�t�B�`��:"+sum3);

	}
}