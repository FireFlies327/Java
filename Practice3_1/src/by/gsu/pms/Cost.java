package by.gsu.pms;

public class Cost implements Comparable<Cost> {
    private int rate;

    public Cost() {
    }

    public Cost(int value) {
        this.rate = value;
    }

    public Cost(int rubs, int coins) {
        this(rubs + 100 * coins);
    }

    public Cost(Cost byn) {
        this(byn.rate);
    }

    public int getRubs() {
        return rate / 100;
    }

    public int getCoins() {
        return rate % 100;
    }

    public Cost add(Cost byn) {
        rate += byn.rate;
        return this;
    }

    public Cost sub(Cost byn) {
        rate -= byn.rate;
        return this;
    }

    public Cost mul(int k) {
        rate *=k;
        return this;
    }

    public enum RoundMethod {
        FLOOR {
            double roundFunction(double d) {
                return Math.floor(d);
            }
        }, CEILING {
            double roundFunction(double d) {
                return Math.ceil(d);
            }
        };

        private int pow10 (int d) {
            int dInPow10 = 1;
            if (d > 0)
                dInPow10 = 10 * d;
            return dInPow10;
        }

        abstract double roundFunction(double value);

        private int round(double roundedValue, RoundMethod roundMethod, int d) {
            int tenPow = (int) roundMethod.pow10(d);
            int result = (int) roundMethod.roundFunction(roundedValue / tenPow) * tenPow;
            return result;
        }
    }

    public Cost mul(double k, RoundMethod roundMethod, int d){
        rate = roundMethod.round(rate * k, roundMethod, d);
        return this;
    }

    public Cost round(RoundMethod roundMethod, int d){
        rate = roundMethod.round(rate, roundMethod, d);
        return this;
    }

    public String toString() {
        return rate / 100 + "." + rate % 100 / 10 + rate % 10 % 10;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cost byn = (Cost) obj;
        return rate == byn.rate;
    }

    public int compareTo(Cost byn) {
        return Integer.compare(this.rate, byn.rate);
    }
}