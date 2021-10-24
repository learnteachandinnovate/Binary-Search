package template_I;

public class SquareRoot {
	public static void main(String[] args) {
		SqrtSolution s = new SqrtSolution();
		int target = 225;
		System.out.println(s.mySqrt(target));
	}
}

class SqrtSolution {
	public int mySqrt(int x) {
		int start = 1, end = x;
		while (start <= end) {
			// To avoid start + end overflow
			int mid = start + (end - start) / 2;

			if (mid == x / mid) {
				return mid;
			} else if (mid < x / mid) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return end;
	}
}
