class Euler_2
{
public static void main(String[] args) 
{
int fp=0;
int sum=0;
int f1=1,f11=0;
int[] array=new int[40];
for(int i=0;i<40;i++)
{
fp=f1+f11;
f11=f1;
f1=fp;
System.out.print(" "+fp);
array[i]=fp;
}
System.out.print("end of series. ");
for(int i=0;i<array.length;i++)
{
	if(array[i]%2==0)
	{
      sum=sum+array[i];
	}

}
System.out.println(sum);
	
}
}