import java.util.*;    
import java.io.*;  
  
class TeamM{    
    public static void main(String[] args)throws IOException{    
		String sentence = "Teemo rides a thin line between chipper compatriot and unrepentant killer , but there's no one else I'd rather have as a friend.";   
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );     
        String word = br.readLine();        
        int p = 0;    
        p = sentence.indexOf( word );  
		if( p > 0 )  {
			System.out.print("Teemo�b�� ");
		   
			int num = ++p;
			String money="�s���L�Ѹv��m�èh�B�եa�U��";  
			int i=0,j=0,k=0,c=0,count=0;  
			c=num;  
			for(k=0;c>0;k++){  
				c=c/10;  
			}  
			int[] numarray=new int [k+1];  
			for(j=k;j>0;j--){  
				numarray[j]=num%10;  
				num=num/10;  
			}  
			c=k;  
			k=k-1;  
			for(i=0;i<c;i++,k--){  
				if(i>0&&numarray[i]!=0&&numarray[i+1]!=0){  
					while(count!=0){  
						System.out.print("�s");  
						count=0;  
					}  
					System.out.print(money.charAt(numarray[i+1]));  
					switch(k){  
						case 1:  
						case 5:  
						case 9:  
							System.out.print("�B");  
							break;  
						case 2:  
						case 6:  
							System.out.print("��");  
							break;  
						case 3:  
						case 7:  
							System.out.print("�a");  
							break;  
						case 4:  
							System.out.print("�U");  
							break;   
						case 8:  
							System.out.print("��");  
							break;  
						default:  
							break;  
					}  
				}  
				else if(i==0){  
					System.out.print(money.charAt(numarray[i+1]));  
					switch(k){  
						case 1:  
						case 5:  
						case 9:  
							System.out.print("�B");  
							break;  
						case 2:  
						case 6:  
							System.out.print("��");  
							break;  
						case 3:  
						case 7:  
							System.out.print("�a");  
							break;  
						case 4:  
							System.out.print("�U");  
							break;   
						case 8:  
							System.out.print("��");  
							break;  
						default:  
							break;  
					}  
				}  
				else if(i>0&&numarray[i+1]!=0){  
					while(count!=0){  
						System.out.print("�s");  
						count=0;  
					}  
					System.out.print(money.charAt(numarray[i+1]));  
					switch(k){  
						case 1:  
						case 5:  
						case 9:  
							System.out.print("�B");  
							break;  
						case 2:  
						case 6:  
							System.out.print("��");  
							break;  
						case 3:  
						case 7:  
							System.out.print("�a");  
							break;  
						case 4:  
							System.out.print("�U");  
							break;   
						case 8:  
							System.out.print("��");  
							break;  
						default:  
							break;  
					}  
				}  
				else if(i>0&&numarray[i]==0)  
					count++;  
			}
			System.out.print(" �Ӧ�m");
		}
		else   
            System.out.println("Teemo is not here");   
    }    
}  