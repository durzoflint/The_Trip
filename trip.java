import java.io.*;
class trip
{
	public static void main(String arghh[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("question.txt"));
		String s="";
		while((s=br.readLine())!=null)
		{
			int cc=0,ss=0,bb=0,count=0;
			int n=Integer.parseInt(s);
			if(n==0)
			break;
			int a[]=new int[n];
			int b[]=new int [n];
			int c[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=(int)(Double.parseDouble(br.readLine()))*100;
				ss=ss+a[i];
			}
			ss=ss/n;
			for(int i=0;i<n;i++)
			{
				if(a[i]>ss)
				b[bb++]=a[i];
				else if(a[i]<ss)
				c[cc++]=a[i];
			}
			cc=0;
			for(int i=0;i<bb;i++)
			{
				while(b[i]>ss+1&&c[cc]<=ss)
				{
					b[i]-=1;
					c[cc]+=1;
					count++;
				}
				if((c[cc]==ss||c[cc]==ss-1)&&cc<c.length)
				cc++;
			}
			System.out.println((double)(++count)/100);
		}
	}
}