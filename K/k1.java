import java.util.*;

class ctf{
	double c,f=0;
	void CF(double C){
		c=C;
		System.out.println("攝氏"+c+"轉華氏是:"+((c*9/5)+32)+"度f"+"\n\n");
	}
}

class ftc{
	double c=0,f;
	void FC(double F){
		f=F;
		System.out.println("華氏"+f+"轉攝氏是:"+((f-32)*5/9)+"度c"+"\n\n");
	}	
}

public class k1{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int a=0,t=0;
		System.out.println("輸入1:攝氏轉華氏"+"\n"+"輸入2:華氏轉攝氏"+"\n"+"輸入-1離開");
		a=sc.nextInt();
		while(a!=-1){
			if(a==1){
				System.out.print("請輸入攝氏度數:");
				t=sc.nextInt();
				ctf C1;
				C1=new ctf();
				C1.CF(t);
			}
			else if(a==2){
				System.out.print("請輸入華氏度數:");
				t=sc.nextInt();
				ftc F1;
				F1=new ftc();
				F1.FC(t);
			}
			else
				System.out.println("請輸入''1''或''2''!"+"\n\n");
			System.out.println("輸入1:攝氏轉華氏"+"\n"+"輸入2:華氏轉攝氏"+"\n"+"輸入-1離開");
			a=sc.nextInt();
		}
		
	}	
	
}