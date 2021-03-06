package formula;

/**
 * 문제 : 1부터 n까지 더하는 공식
 * 단순한 반복문으로 1씩 더하는게 아닌 공식을 알아본다.
 */
public class SumFormula {

    public int sumFormula(int n) {
        if (n % 2 == 0) {
            return (n + 1) * (n / 2);
        } else {
            return n * ((n - 1) / 2) + n;
        }
    }

    public int sumFormulaRec(int n) {
        if (n == 1) return 1;

        if (n % 2 == 0) {
            return (n + 1) * (n / 2);
        } else {
            return sumFormulaRec(n - 1) + n;
        }
    }
}
