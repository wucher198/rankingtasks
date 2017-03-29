package pl.myjava.other;

public class RoundUp5 {
	public static void main(String[] args) {
		for (int in = 0; in < 100; in++){
			int res = in % 5;
			System.out.println(( res < 3) ? res : (res += 5-res));
		}
	}
	
	static int roundUp5(int in){
        int res = in % 5;
        return ( res < 3) ? res : (res+=5-res);
    }
}
