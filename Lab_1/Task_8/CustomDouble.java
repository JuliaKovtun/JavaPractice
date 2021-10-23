package Task_8;

import Task_7.User;

public class CustomDouble {
    private int i;
    private double d;

    public CustomDouble (final int i, final double d) {
        this.i = i;
        if(d >= 0.0 && d < 1)
            this.d = d;
        else
            this.d = d % 1;
    }

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
        if(d >= 0.0 && d < 1)
            this.d = d;
        else
            this.d = d % 1;
    }

    public CustomDouble plus(final CustomDouble c) {
        return new CustomDouble(i + c.i, d + c.d);
    }

    public CustomDouble minus(final CustomDouble c) { return new CustomDouble(i - c.i, d - c.d); }

    public boolean moreThan(final CustomDouble c) {
        return (i > c.i && d > c.d) ||
                (i > c.i && d >= c.d) ||
                (i >= c.i && d > c.d);
    }

    public boolean lessThan(final CustomDouble c) {
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
