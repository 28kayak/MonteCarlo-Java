import java.util.Random;
public class MonteCarloMethod
{
	public static void main(String[] args) {
	    int N = 0; // 顧客数
	    int lambda = 10; 
	    int mu = 2; 
	    int arrival = 0;
	    int rejection = 0;

	    Random r = new Random();    
	    while (arrival < 10000) { // イベント発生
	        if (N == 0) { // 確実にArrival
	            arrival++;
	            N++;
	            continue;
	        }
	        double p = r.nextDouble();
	        if (p > (double) lambda / (lambda + mu)) { 
	            // Departure
	            N--;
	            continue;
	        }
	        arrival++;
	        if (N == 5) { // キューが満杯なのでブロック
	            rejection++;
	        } else {
	            N++;
	        }
	    }
	    System.out.println((double) rejection / arrival);
	}

}
