import java.util.Scanner;
class CommandLine {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String str,s;
		str=args[0];

		s=str.substring(0,1).toUpperCase()+str.substring(1);
		if(s.equals(str)){
			System.out.println("Enter First letter in LoweCase");
		}
		else{
			System.out.println(str);
		}
	}
}
