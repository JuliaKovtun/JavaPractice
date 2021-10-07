package Task_8;

import Task_7.User;

public class CustomDouble {
    private int i;
    private double d;

    public CustomDouble (final int i, final double d) {this.i = i; this.d = d;}

    public int getI() {
        return i;
    }

    public void setI(final int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(final double d) {
        this.d = d;
    }

    public CustomDouble plus(CustomDouble c) {
        return new CustomDouble(i + c.i, d + c.d);
    }

    public CustomDouble minus(CustomDouble c) { return new CustomDouble(i - c.i, d - c.d); }

    public boolean moreThan(CustomDouble c) {
        return (i > c.i && d > c.d) ||
                (i > c.i && d >= c.d) ||
                (i >= c.i && d > c.d);
    }

    public boolean lessThan(CustomDouble c) {
        return (i < c.i && d < c.d) ||
                (i < c.i && d <= c.d) ||
                (i <= c.i && d < c.d);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final CustomDouble custom = (CustomDouble) o;

        return i == custom.i &&
                d == custom.d;
    }

    @Override
    public int hashCode() {
        return 17 * this.getI() +
                17 * this.getI();
    }

    public double toDouble() {
//        double num = i + d;
        return (double)i+d;
    }
}
