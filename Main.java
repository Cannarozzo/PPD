import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String... args) throws NumberFormatException, IOException {

		int n = 0, primos = 0, primosEspeciais = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		n = 1 << Integer.parseInt(input.readLine());

		boolean[] crivo = new boolean[n];

		for (int i = 2; i < crivo.length; i++) {
			crivo[i] = true;
		}

		for (int i = 2; i < crivo.length; i++) {
			if (crivo[i] == true) {
				primos++;
				if (i % 4 != 3) {
					primosEspeciais++;
				}
				for (int j = i * 2; j < n; j += i) {
					crivo[j] = false;
				}
			}
		}
		System.out.printf("%d %d", primos, primosEspeciais);
	}

}
