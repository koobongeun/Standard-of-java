package ch06;

class Tv3 {
	String color;
	boolean power;
	int channel; // 멤버변수
	
	void power() {power = !power;}
	void channeldown() {--channel;}
	void channelup() {++channel;} // 메서드
}
public class TvTest03 {
	public static void main(String arg[]) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3(); // 객체 생성
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 채널이"+ t1.channel +"로 바뀌었습니다.");
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
	}

}
