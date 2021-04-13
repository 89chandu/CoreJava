package dsaQuestions;

public class GCD {

	public static void main(String[] args) {

        
    System.out.println(gcd (15,27));
	}
	
	static int gcd (int a,int b) {
		if(b==0) 
			return a;
			
			return gcd (b,a%b);
		}
	}

//System.out.println(fastPower(3,5));
//
//static int fastPower(int a,int b) {
//	
//	int res =1;
//	
//}
//	
//	while (b>0) {
//		
//		if ((b&1)!=0) {
//			
//			res =res*a;
//		}
//		a=a*a;
//		b=b>>1;
//	}
//
//return res;
// 
//}


