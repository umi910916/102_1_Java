import java.io.*;    
    public class TeamF {  
         public static void main(String[] args) throws IOException{    
                
                BufferedReader br =    
                    new BufferedReader(new InputStreamReader(System.in));         
                
//�P�_��m                
                String strk="killer";
                String str ="Teemo rides a thin line between chipper compatriot and unrepentant killer , but there's no one else I'd rather have as a friend.";   
                String str1 = br.readLine();   
                  
                int l = str.length();     //������  
                char s[] = new char[l+1];  
                int k = str1.length();  //�j���r�����  
                char t[] = new char[k+1];  
                
                
                  
                int i;  
                int j;  
                
                
                  
                                  
                for(i=1;i<=l;i++){  
                    s[i]=str.charAt(i-1);  
                    if(s[i]=='.'){  
                        s[i]=' ';  
                    }  
                }  
                for(i=0;i<k;i++){  
                    t[i]=str1.charAt(i);  
                }      
                  
                s[0]=' ';  
                t[k]=' ';                
                
                int a = 0;  
                int b = 0;  //������m
                int c = 0;  //�ۦP�r���ƥ�
                int Word = 0; //���G��r��                
                
                for(i=0;i<l;i++){  	
                    if(s[i]==' '){  
                          
                        if(s[i+1]==t[0]){  //����r�}�Y�O�_�@��
                            c++;  
                            b=i+1;  
                            a=i+2;  //�ĤG�Ӧr��
                        }  
                    }  
                      
                    if(c==1){     //�}�Y�@��   
                        for(j=1;j<=k;j++){
                            if(t[j]==s[a]){  //���U�@�Ӧr��
                                c++;  
                                a++;  
                            }  
                            else{   //���@�˫h�O���k�s�A�~����
                                c=0;  
                                b=0;  
                                break;  
                            }  
                        }  
                    }  
          
                    if(c!=0){  
                        Word++;                                                                    
                        c=0;
                	}                    
                
         		}  
                
                for(i=0;i<k;i++){                     
                    if(strk.charAt(i)!=t[i]){
                    	b=0;
                    	Word=0;
                    }
                } 
                
                if(Word==0){  
                    System.out.println("Teemo is not here.");   
                }   
                               
//�ഫ                

        		

                int num = b; 
                
                String[] str2 = {"�s","��","�L","?","�v","��","��","�m","��","�h",} ; 
                String[] str3 = {"","�B","��","�a"} ;
                String[] str4= {"","�U","��","��"} ;
                
                i=0;
                int[] n = new int[11];
                j=1;

                
                while(num>0){
                	i++;
                	n[i]=num%10;
                	num=num/10;
                	
                }
                
                
                int s2;		//str3
                int s3;		//str4
                
                s2=i%4;
                s3=i/4+1;
                
            	if(s2==0){
            		s2=4;
            		s3--;
            	} 
            	
                if(b!=0){  
                	System.out.print("Teemo�b��    "); 
            	}
            	
            	
                for(j=i;j>0;j--){
                	if(n[j]!=0){
                		System.out.print(str2[n[j]]);
                		System.out.print(str3[s2-1]);
                	}        
                	if(n[j]==0){
                		if(n[j-1]!=0 && s2!=1){
                			System.out.print(str2[n[j]]);
                		}
                		
                	}
                	
                	if(s2==1){
                		System.out.print(str4[s3-1]);
                		s3--;
                	} 
                	
                	s2--;
                	
                	if(s2==0){
                		s2=4;
                	}
                	
                }
                
                if(b!=0){  
                	System.out.println("   �Ӧ�m"); 
            	}
                
               
        		//System.out.println();   
                
            
         }  
    }