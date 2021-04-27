import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		int n = 0, primos = 0, primosEspeciais = 0;
		Scanner s = new Scanner(System.in);
		n = 1 << s.nextInt();
		List<Boolean> crivo = new ArrayList<Boolean>();

		crivo.add(false);
		crivo.add(false);
		for (int i = 2; i < n; i++) {
			crivo.add(true);
		}

		for (int i = 2; i < crivo.size(); i++) {
			if (crivo.get(i) == true) {
				primos++;
				if (i % 4 != 3) {
					primosEspeciais++;
				}
				for (int j = i * 2; j < n; j += i) {
					crivo.set(j, false);
				}
			}
		}
		System.out.println(primos + " " + primosEspeciais);

	}
}
