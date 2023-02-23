public class MixedFraction extends Fraction {
    private int whole;

    public MixedFraction() {
        super();
        whole = 1;
    }

    public MixedFraction(int whole, int numerator, int denominator) {
        super(numerator, denominator);
        this.whole = whole;

    }

    public int getWhole() {
        return whole;
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public Fraction convertToImproper() {
        Fraction b = new Fraction();
        b.setNumerator((whole * super.getDenominator()) + super.getNumerator());
        b.setDenominator(super.getDenominator());

        return b;
    }

    public String toString() {
        return whole + " " + super.getNumerator() + "/" + super.getDenominator();

    }

}
