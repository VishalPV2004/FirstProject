package prog;
import java.util.*;
public class project {

	public static void main(String[] args) {
	/*	System.out.println("Number System Converter");
		System.err.println("**Step1: Enter the base of the number which is to be converted**");
		System.err.println("**Step2 : Enter the number corresponding to the input base**");
		System.err.println("**Step3 : Enter the output base to which it should be converted**");
		Hello all*
		*/
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter input base : ");
		int io=in.nextInt();
		
		if (io==2) {
			System.out.println("You have choosen Binary conversion");
			System.err.println("Use only 1s and 0s");
			System.out.print("Enter the Binary number : ");
			String bina=in.next();
			
				
				
			int binary=Integer.parseInt(bina);
			
			System.out.print("Enter the base : ");
			int base = in.nextInt();	
			int rem=0,sum=0,k=0;
			int dec=1,ans=0;
			char[] ch= {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			int supp=0;
			String hexa="";
			if (base==10)
			{
			while (binary!=0)
			{
				rem=binary%10;
				sum=sum+(int)(rem*(Math.pow(2, k)));
				binary/=10;
				k++;
			}
			System.out.println("Decimal number : "+sum);
			}
			else if (base==8)
			{
				while (binary!=0)
				{
					rem=binary%10;
					sum=sum+(int)(rem*(Math.pow(2, k)));
					k++;
					binary/=10;
				}
				
				while (sum!=0)
				{
					ans=ans+((sum%8)*dec);
					dec=dec*10;
					sum=sum/8;
				}
				System.out.print("Octal number : "+ans);
			}
			
			else if (base==16)
			{
				while (binary!=0)
				{
					rem=binary%10;
					sum=sum+(int)(rem*(Math.pow(2, k)));
					k++;
					binary/=10;
				}
				
				
				while(sum!=0)
				{
					supp=sum%16;
					hexa=hexa+ch[supp-1];
					sum=sum/16;
				}
				System.out.print("HexaDecimal number : "+hexa);
			}
			else
				System.err.println("Invalid base for output");
		}
		
		else if(io==8) 
		{
			System.out.println("You have choosen Octal conversion");
			System.out.print("Enter the Octal number : ");
			String octal=in.next();
			int octa=0,form=0;
			int i=0,rem=0,sum=0,org=0;
			System.out.print("Enter the base : ");
			int base=in.nextInt();
			String supp="";
			char[] ch= {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			if (base==2)
			{
				while(i<octal.length())
				{
					char c =octal.charAt(i);
					switch (c)
					{
					case '0':{
						supp+="000";
						break;
					}
					case '1':{
						supp+="001";
						break;
					}
					case '2':{
						supp+="010";
						break;
					}
					case '3':{
						supp+="011";
						break;
					}
					case '4':{
						supp+="100";
						break;
					}
					case '5':{
						supp+="101";
						break;
					}
					case '6':{
						supp+="110";
						break;
					}
					case '7':{
						supp+="111";
						break;
					}
					default:{
						System.err.println("Invalid Number");
						break;
					}
				}
					i++;
			}
				System.out.print("Binary value : "+supp);

		}
			else if (base==10) 
			{
			octa=Integer.parseInt(octal);
	        while (octa!=0)
	        {
	        	rem=octa%10;
	        	sum+=(int)(rem*Math.pow(8,i));
	        	i++;
	        	octa/=10;
	        }
	        System.out.print("Decimal form : "+sum);
					}
			
			else if (base==16)
			{
				System.out.print("HexaDecimal value : ");
				octa=Integer.parseInt(octal);
				while (octa!=0)
				{
					rem=octa%10;
					sum+=(int)(rem*Math.pow(8, i));
					org=sum;
					i++;
					octa=octa/10;
	            }
				
				while (org>0)
				{
					form=org%16;
					supp=ch[form-1]+supp;
					org/=16;
				}
				System.out.print(supp);
			}
			else 
				System.err.print("Invalid base for output");

		}
		
		else if (io==10)
		{
			System.out.println("You have choosen Decimal Conversion");
			int decimal;
			char[] ch= {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			System.out.print("Enter the Decimal number : ");
			decimal=in.nextInt();
			String bin="";
			int rem=0;
			int base;
			System.out.println("Enter the base : ");
			base=in.nextInt();
			
			if (base==2) {
				System.out.print("Binary : ");
				 while(decimal>0)
				 {
					 rem=decimal%2;
					 bin=rem+bin;
					 decimal=decimal/2;
				 }
				 System.out.print(bin);
	         	}
			else if (base==8)
			{
				System.out.print("Octal : ");
				while (decimal!=0)
				{
					rem=decimal%8;
					bin=rem+bin;
					decimal/=8;
				}
				System.out.println(bin);
			}
			
			else if (base==16)
			{
				System.out.print("HexaDecimal : ");
				while (decimal>0)
				{
					rem=decimal%16;
					bin=ch[rem-1]+bin;
					decimal/=16;
				}
				System.out.println(bin);
			}
			
			else
			{
				System.err.println("Invalid Base for output");
			}
		}
		
		else if(io==16)
		{
			System.out.println("You have choosen HexaDecimal conversion");
			System.out.print("Enter the HexaDecimal number : ");
			String hex=in.next();
			String seq="0123456789ABCDEF";
			hex=hex.toUpperCase();
			int val=0,rem=0;
			String ans="";
			System.out.print("Enter the base : ");
			int base=in.nextInt();
			if (base==10)
			{
			for (int i=0;i<hex.length();i++)
			{
				char c=hex.charAt(i);
				int d =seq.indexOf(c);
				val=(val*16)+d;
			}
			System.out.print("Decimal form : "+val);
			}
			
			else if (base==8)
			{
				for (int i=0;i<hex.length();i++)
				{
					char c=hex.charAt(i);
					int d =seq.indexOf(c);
					val=(val*16)+d;
				}
				while (val!=0)
				{
					rem=val%8;
					ans=rem+ans;
					val=val/8;
				}
				System.out.print("Octal form : "+ans);
			}
			
			else if (base==2)
			{
				for (int i=0;i<hex.length();i++)
				{
					char c=hex.charAt(i);
					int d =seq.indexOf(c);
					val=(val*16)+d;
				}
				while (val!=0)
				{
					rem=val%2;
					ans=rem+ans;
					val/=2;
				}
				System.out.println("Binary form : "+ans);
			}
			
			else
				System.err.println("Invalid base for output");
		}
		else
			System.err.println("Invalid base for input");

	}
}


	


