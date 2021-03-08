public class Power{
	public static void main(String...args){
		int base=3;
		int exp=5;
		int res=1;
		for(int i=exp;i>0;--i)
		{
			res= res*base;
		}
		System.out.println(base+" to the power "+exp+" is "+res);
	}
}