import java.util.*;
public class TeamK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,d=0,k=0,total=0;
        int[] dol=new int[80];
        int[] num=new int[80];
        String[] n=new String[80];
        String[] s1= {"","�C����","�ᷦ��","���R��","�Ťߵ�"};
        String[] s2= {"","����","�ަ�","����","�Ϧ�"};
        String[] s3= {"","����","���l","�D��","�p��"};
        String[] s4= {"","�h��","���s�G","��K","���K��"};
        int[] a1={0,20,25,40,20};
        int[] a2={0,200,150,100,100};
        int[] a3={0,160,200,150,100};
        int[] a4={0,100,60,90,150};
        System.out.print("���1.����2.�׫~3.���A4.���G5.����:");
        a=sc.nextInt();
        while(a<5){//��ܫ~���j��
            if(a==1){
                System.out.println("���:"+"\n"+"1.�C����20��"+"\n"+"2.�ᷦ��25��"+"\n"+"3.���R��40��"+"\n"+"4.�Ťߵ�20��"+"\n"+"5.��^");
                System.out.println("���X:");
                c=sc.nextInt();
                while(c<5){//��ܳ�~�j��
                    System.out.println("�ƶq:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s1[c];
                            dol[k]=a1[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("���X:");
                    c=sc.nextInt();
                }
            }
            else if(a == 2){
                System.out.println("���:"+"\n"+"1.����200��"+"\n"+"2.�ަ�150��"+"\n"+"3.����100��"+"\n"+"4.�Ϧ�100��"+"\n"+"5.��^");
                System.out.println("���X:");
                c=sc.nextInt();
                while(c<5){//��ܳ�~�j��
                    System.out.println("�ƶq:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s2[c];
                            dol[k]=a2[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("���X:");
                    c=sc.nextInt();
                }
            }
            else if(a==3){
                System.out.println("���:"+"\n"+"1.����160��"+"\n"+"2.���l200��"+"\n"+"3.�D��150��"+"\n"+"4.�p��100��"+"\n"+"5.��^");
                System.out.println("���X:");
                c=sc.nextInt();
                while(c<5){//��ܳ�~�j��
                    System.out.println("�ƶq:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s3[c];
                            dol[k]=a3[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("���X:");
                    c=sc.nextInt();
                }
            }
            else if(a==4){
                System.out.println("���:"+"\n"+"1.�h��100��"+"\n"+"2.���s�G60��"+"\n"+"3.��K90��"+"\n"+"4.���K��150��"+"\n"+"5.��^");
                System.out.println("���X:");
                c=sc.nextInt();
                while(c<5){//��ܳ�~�j��
                    System.out.println("�ƶq:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s4[c];
                            dol[k]=a4[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("���X:");
                    c=sc.nextInt();
                }
            }
            System.out.print("���1.����2.�׫~3.���A4.���G5.����:");
            a=sc.nextInt();
        }
        for(int y=0;y<k;y++){
              System.out.println(n[y]+dol[y]+"��*"+num[y]);
              total+=dol[y]*num[y];
        }
        System.out.println("�`�B:"+total);
    }
}