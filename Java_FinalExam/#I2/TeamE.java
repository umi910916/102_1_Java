// % ������ܡA�D�عϤ��èS������

import java.util.*;

public class TeamE{
	public static void main(String[] args){
		System.out.println("�O�_�n�W�Ǹ��?");
		System.out.print("1.�O   2.�_:");
		String Demo = "Taiwanese people believe that ghosts leave the underworld for one month every year.To ensure that these ghosts are happy and do not bother them, Taiwanese people observe certain traditions during Ghost Month. This festival takes place in July on the lunar calendar. Ghost Month is a time when families pray for the ghosts of their ancestors. They will also leave food out to feed any hungry ghosts that might wander by Taiwanese people will also burn specially printed ghost money to makesure.";
		String[] Before =new  String[Demo.length()];
		String[] After= new String[Demo.length()];
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0,hh,flag=0;
		for(int aaa=0;aaa<Demo.length();aaa++)
			Before[aaa]=Demo.charAt(aaa)+"";
		while(!(a==2 && b==1)){
			if(a==2){
				System.out.println("�����W��?");
				System.out.println("1.�O   2.�_:");
				b=sc.nextInt();
			}
			else {	
				for(int i=0;i<Demo.length();i++){
					After[i]=Before[i];
					hh = (i*100/Demo.length());
					System.out.println(hh+"%");
					
				}
				System.out.print("100% �W�ǧ���");
				break;
			}
			if(b==2){
				System.out.println("�O�_�n�W�Ǹ��?");
				System.out.print("1.�O   2.�_:");
				a = sc.nextInt();
			}
			
			
		}
	}
}




