//��J��invetory.txt���ۦP�ƶq�����t�B

import java.io.*;
public class TeamB {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			String[] w1={"�F��","�d�~�H��","�󭺯Q","�e��","���k","�V�ήL��","����"};
			String[] w2={"����","����","�պ�","�C��","���","���","����","����","�Ⱥ�"};
			String[] w3={"�ե��N","�եɼY","�եɦչ�","��¯","�ȼY","�Ȧչ�","��¯","���Y","���չ�","�����N","���ɼY","���ɦչ�"};
			int[] mt1={10000,100000,700,40,200,350,3000};
			int[] mt2={200,900,4000,700,700,500,4000,10000,5000};
			int[] mt3={500,900,1000,700,1000,1200,4000,10000,15300,5000,10000,24000};
			int[][] n1=new int[7][3];
			int[][] n2=new int[9][3];
			int[][] n3=new int[12][3];
			int sum1=0,sum2=0,sum3=0;
			try{
				BufferedReader dr =
				new BufferedReader(new FileReader("inventory.txt"));
				for(int i=0;i<3;i++){
					String s=dr.readLine();
					String a[]=s.split(",");
					for(int j=0;j<a.length;j++){
						if(i==0)
						n1[j][1]=Integer.parseInt(a[j]);
						else if(i==1)
						n2[j][1]=Integer.parseInt(a[j]);
						else if(i==2)
						n3[j][1]=Integer.parseInt(a[j]);
						}
					}
				dr.close();
			}
			catch(IOException e1){
				System.out.println("error");
			}
			for(int i=0;i<7;i++){
				n1[i][0]=Integer.parseInt(br.readLine());
				n1[i][2]=(n1[i][0]-n1[i][1]);
			}
			for(int i=0;i<7;i++){
				System.out.println(w1[i]+"�t�B:"+n1[i][2]+"�t��:"+(n1[i][2]*mt1[i]));
				sum1+=(n1[i][2]*mt1[i]);
			}
			System.out.println("�t�B�`��:"+sum1);
			for(int i=0;i<9;i++){
				n2[i][0]=Integer.parseInt(br.readLine());
				n2[i][2]=n2[i][0]-n2[i][1];
			}
			for(int i=0;i<9;i++){
				System.out.println(w2[i]+"�t�B:"+n2[i][2]+"�t��:"+(n2[i][2]*mt2[i]));
				sum2+=(n2[i][2]*mt2[i]);
			}
			System.out.println("�t�B�`��:"+sum2);
			for(int i=0;i<12;i++){
				n3[i][0]=Integer.parseInt(br.readLine());
				n3[i][2]=n3[i][0]-n3[i][1];
			}
			for(int i=0;i<12;i++){
				System.out.println(w3[i]+"�t�B:"+n3[i][2]+"�t��:"+(n3[i][2]*mt3[i]));
				sum3+=(n3[i][2]*mt3[i]);
			}
			System.out.println("�t�B�`��:"+sum3);

	}
}