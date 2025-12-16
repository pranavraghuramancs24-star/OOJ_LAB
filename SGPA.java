import java.util.*;
class SGPA
{
    public static int credits(int score)
    {
        int points;
        if(score>90)
        {
            points=10;
        }
        else if(score>=80)
        {
            points=9;
        }
        else if(score>=70)
        {
            points=8;
        }
        else if(score>=60)
        {
            points=7;
        }
        else if(score>=50)
        {
            points=6;
        }
        else
        {
            points=0;
        }
        return points;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int creditsum=0;
        int pointsum=0;
        float SGPA;
        System.out.println("enter the name and the usn");
        String name=sc.nextLine();
        String usn=sc.nextLine();
        System.out.println("enter the number of subjects");
        int a=sc.nextInt();
        int cred[]=new int[a];
        int marks[]=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("enter the sub"+i+"credits");
            cred[i]=sc.nextInt();
            creditsum+=cred[i];
            System.out.println("enter the marks obtained");
            marks[i]=sc.nextInt();
            pointsum+=credits(marks[i])*cred[i];
        }
        SGPA=pointsum/creditsum;
        System.out.println("SGPA="+SGPA);
    }
}
