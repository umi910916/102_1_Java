//���B�p����~

import java.util.*;
public class TeamK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,total=0,out=0,in=0,k=0,kk=0;
        int[] num1=new int[80];
        int[] num2=new int[80];
        int[] test1=new int[80];
        int[] test2=new int[80];
        String[] n1=new String[80];
        String[] n2=new String[80];
        String[] s1= {"","����","����","�ѥ]��"};
        String[] s2= {"","����","�f����"};
        int[] a1={0,250,100,200};
        int[] a2={0,250,50};
        System.out.println("1.��    2.�R    3.�`�M  4.����"+"\n"+"Input choose:");
        a=sc.nextInt();
        while(a<4){
            if(a==1){
                System.out.println("1.����  2.����  3.�ѥ]��"+"\n"+"Input sale:");
                b=sc.nextInt();
                if(b==1){
                    System.out.println("�@���ʤ���X��:");
                    c=sc.nextInt();
                    n1[k]=s1[b];
                    num1[k]=a1[b]*c;
                    k++;
                    test1[1]+=test1[1]+c;
                }
                else if(b == 2)
                {
                    System.out.println("�@��@�ʽ�X��:");
                    c=sc.nextInt();
                    n1[k]=s1[b];
                    num1[k]=a1[b]*c;
                    k++;
                    test1[2]+=test1[2]+c;
                }
                else if(b == 3)
                {
                    System.out.println("�@���ʽ�X��:");
                    c=sc.nextInt();
                    n1[k]=s1[b];
                    num1[k]=a1[b]*c;
                    k++;
                    test1[3]+=test1[3]+c;
                }
            }
            else if(a==2){
                System.out.println("1.����  2.�f����"+"\n"+"Input buy:");
                b=sc.nextInt();
                if(b==1){
                   System.out.println("�@�]��ʤ��R�X�]:"); 
                   c=sc.nextInt();
                   n2[kk]=s2[b];
                   num2[kk]=a2[b]*c;
                   kk++;
                   test2[1]+=test2[1]+c;
                }
                if(b==2){
                   System.out.println("�@�]���Q�R�X�]:"); 
                   c=sc.nextInt();
                   n2[kk]=s2[b];
                   num2[kk]=a2[b]*c;
                   kk++;
                   test2[2]+=test2[2]+c;
                }
            }
            else if(a==3){
                for(int w=0;w<k;w++){
                    num1[k+1]+=num1[w];
                }
                for(int w=0;w<kk;w++){
                    num2[kk+1]+=num2[w];
                }
                System.out.println("�ثe��: "+num1[k+1]+"�� �ثe�R:"+num2[kk+1]+"��");
            }
            System.out.println("1.��    2.�R    3.�`�M  4.����"+"\n"+"Input choose:");
            a=sc.nextInt();
        }
        for(int w=0;w<k;w++){
                    num1[k+1]+=num1[w];
                }
                for(int w=0;w<kk;w++){
                    num2[kk+1]+=num2[w];
                }
        System.out.println("��:"+"\n"+"     ����"+test1[1]+"��"+"       ����"+test1[2]+"��"+"       �ѥ]��"+test1[3]+"��");
        System.out.println("�R:"+"\n"+"     ����"+test2[1]+"�]"+"       �a�ʸ�"+test2[1]+"�]");
        System.out.println("���J�`�X:"+num1[k+1]+"��"+"\n"+"��X�`�M"+num2[kk+1]+"��"+"\n"+"�b�ȧQ��:"+(num1[k+1]-num2[kk+1])+"��");
    }
}