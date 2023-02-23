public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 2;
    }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n) {
        numerator = n;

    }

    public void setDenominator(int d) {
        denominator = d;

    }

    public Fraction Simplify() {
        int gcf = GCF(numerator, denominator);
        Fraction result = new Fraction((numerator /= gcf), (denominator /= gcf));
        return result;

    }

    public String toString() {
        return numerator + "/" + denominator;

    }

    public MixedFraction convertToMixed() {
        MixedFraction b = new MixedFraction();
        b.setNumerator(numerator % denominator);
        b.setDenominator(denominator);
        b.setWhole(numerator / denominator);

        return b;
    }

    public static int GCF(int a, int b) {
        int GCF = 0;
        int tmp = 0;
        if (b >= a) {
            tmp = b;
            b = a;
            a = tmp;
        }
        int count = a;
        while (GCF == 0) {
            if (a % count == 0) {
                if (b % count == 0) {
                    GCF = count;
                }
            }
            count--;

        }
        return GCF;

    }

}
