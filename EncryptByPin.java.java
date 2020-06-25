package minorassignment;
import java.util.Scanner;
import java.lang.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,m,rev=0;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter your message to be encrypted");
		String k,o="",po="";
		k=sc.nextLine();
	//	System.out.println(k);
		System.out.println("Enter how many digits");
int n=sc.nextInt();
System.out.println("Enter four numbers with "+n+" digits");
long a=sc.nextLong();
long b=sc.nextLong();
long c=sc.nextLong();
long d=sc.nextLong();

	for(int i=1;i<=n;i++)
	{   
		int e=(int)a%10;
		 a=a/10;
		int f=(int)b%10;
		b=b/10;
		int g=(int)c%10;
		c=c/10;
		int h=(int)d%10;
		d=d/10;
		if(e<=f&&e<=g&&e<=h)
			sum=(sum*10)+e;
		else if(f<=e&&f<=g&&f<=h)
			sum=(sum*10)+f;
		else if(g<=e&&g<=f&&g<=h)
			sum=(sum*10)+g;
		else if(h<=e&&h<=g&&h<=f)
			sum=(sum*10)+h;
	}
	while(sum>0)
	{
		m=sum%10;
		rev=rev*10+m;
		sum=sum/10;
	}//Pin is generated now
	int z=k.length();
	for(int j=0;j<z;j++)
	{   
		char p=k.charAt(j);
		if(p!=' ')
		o=o+Character.toLowerCase(p);
		
	}
//System.out.println(o);
String x=""+rev;
//System.out.println(x);
int y=0;
for(int t=0;t<o.length();t++,y++)
{
if(y==(x.length()))
	y=0;
char ch1=o.charAt(t);//v
char ch2=x.charAt(y);//5
int tmp=(int)ch2;//5+48
tmp=tmp-48;//5
ch1=(char)((int)ch1+tmp);//123
if(ch1>122)
{  
	ch1=(char)((int)ch1-122);//1
	ch1=(char)((int)ch1+96);//97
}po=po+ch1;
}
po=po.toUpperCase();
System.out.println("Encrypted msg:"+po);}

}
