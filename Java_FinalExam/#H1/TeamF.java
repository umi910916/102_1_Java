//��������1,����2,�A������2�ɡA���J�X��

import java.io.*;

public class TeamF {
	public static void main(String[] args) throws IOException{
	        BufferedReader br =   
	                new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bug.txt")));
	        int[]buy=new int[10];
	        int[]sale=new int[10];
	        int id0=0;
	        int id1=0;
	        int id2=0;
	        int a=0;
	        int totalsale=0;
	        int totalbuy=0;
	        int op=0;
	        while(op!=-1){
	        	System.out.println("1.��	2.�R   3.�`�M   4.���� ");
		        System.out.print("Input choose : ");
		        String str0 = br.readLine();
		        id0=Integer.parseInt(str0);
	        switch(id0){
	        	case 1:
	        		System.out.println("1.����    2.����    3.�ѥ]��");
	        		System.out.print("Input sale: ");
	        		String str1 = br.readLine();
	    	        id1=Integer.parseInt(str1);
	    	        switch(id1){
	    	        case 1:
	    	        	System.out.println("�@���ʽ�X��: ");
	    	        	String str2 = br.readLine();
		    	        a=Integer.parseInt(str2);
		    	        sale[0]=a+sale[0];
		    	        sale[1]=a*200+sale[1];
		    	        totalsale=sale[1]+totalsale;
		    	        break;
	    	        case 2:
	    	        	System.out.println("�@��@�ʤ���X��: ");
	    	        	String str3 = br.readLine();
		    	        a=Integer.parseInt(str3);
		    	        sale[2]=a+sale[2];
		    	        sale[3]=a*150+sale[3];
		    	        totalsale=sale[3]+totalsale;
		    	        break;
	    	        case 3:
	    	        	System.out.println("�@��@�ʽ�X��: ");
	    	        	String str4 = br.readLine();
		    	        a=Integer.parseInt(str4);
		    	        sale[4]=a+sale[4];
		    	        sale[5]=a*100+sale[5];
		    	        totalsale=sale[5]+totalsale;
		    	        break;
	    	        }
	    	        break;
	        	case 2:
	        		System.out.println("1.����    2.�f����");
	        		System.out.print("Input buy: ");
	        		String str5 = br.readLine();
	    	        id2=Integer.parseInt(str5);
	        		switch(id2){
	        		case 1:
	        			System.out.println("�@�]�Ǩե�R�X�]: ");
	        			String str6 = br.readLine();
		    	        a=Integer.parseInt(str6);
		    	        buy[0]=a+buy[0];
		    	        buy[1]=a*250+buy[1];
		    	        totalbuy=buy[1]+totalbuy;
		    	        break;
	        		case 2:
	        			System.out.println("�@�]��B�R�X�]: ");
	        			String str7 = br.readLine();
		    	        a=Integer.parseInt(str7);
		    	        buy[2]=a+buy[2];
		    	        buy[3]=a*50+buy[3];
		    	        totalbuy=buy[3]+totalbuy;
		    	        break;
	        		}
	        		break;
	        	case 3:
	        		System.out.println("�ثe��:"+totalsale+"��   �ثe�R:"+totalbuy+"��");
	        		break;
	        	case 4:
	        		op=-1;
	        		break;
	        }
	       }
	       System.out.println("��: ");
	       System.out.println("		����:"+sale[0]+"��   �@"+sale[1]+"��");
	       System.out.println("		����:"+sale[2]+"��   �@"+sale[3]+"��");
	       System.out.println("		�ѥ]��:"+sale[4]+"��   �@"+sale[5]+"��");
	       System.out.println("�R: ");
	       System.out.println("		����:"+buy[0]+"�]   �@"+buy[1]+"��");
	       System.out.println("		�f����:"+buy[2]+"�]   �@"+buy[3]+"��");
	       System.out.println("���J�`�M:"+totalsale+"��");
	       System.out.println("��X�`�M:"+totalbuy+"��");
	       a=totalsale-totalbuy;
	       System.out.println("�b�|�Q��:"+a+"��");
	       pw.println("��: ");
	       pw.println("		����:"+sale[0]+"��   �@"+sale[1]+"��");
	       pw.println("		����:"+sale[2]+"��   �@"+sale[3]+"��");
	       pw.println("		�ѥ]��:"+sale[4]+"��   �@"+sale[5]+"��");
	       pw.println("�R: ");
	       pw.println("		����:"+buy[0]+"�]   �@"+buy[1]+"��");
	       pw.println("		�f����:"+buy[2]+"�]   �@"+buy[3]+"��");
	       pw.println("���J�`�M:"+totalsale+"��");
	       pw.println("��X�`�M:"+totalbuy+"��");
	       pw.println("�b�|�Q��:"+a+"��");
	       pw.close();
	}

}