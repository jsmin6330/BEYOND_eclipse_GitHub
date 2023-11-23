package day02_00_input;

public class MainInputTest_args { 
	public static void main(String[] args) { 
		System.out.print("string, int = ");
		
		if(args.length <= 0) {
			System.out.println("데이터 입력 하세요.");
			return; //제어권 넘김
		} //데이터가 있을려면 이클립스에서는 Run > Configurations > Arguments에서 데이터 입력해야함
		//이클립스에서 args는 반복적으로 고정값을 넣고 싶을 때 쓰면 좋음
		
		String name = args[0];
		// int num = args[1]; //String을 int에 넣었기 때문에 오류
		int num = Integer.parseInt(args[1]);
		
		System.out.println(name +  " "+ num);
	}
}
