import java.math.*;

/**
 * Implements HLNumber
 */

public class HLNumber extends HLObject implements Comparable<HLNumber> {

    // Instance Variables
    private int value;

    // Class variables
    public static HLNumber zero = new HLNumber(0);

    // Constructors
    public HLNumber(int value) {
        this.value = value;
    }

    public HLNumber(Integer num) {
        this.value = num != null ? num : 0;
    }

    // Overridden compareTo
    @Override
    public int compareTo(HLNumber to) {
        if (this.value == to.value) {
            return 0;
        } else if (this.value < to.value) {
            return -1;
        } else {
            return 1;
        }
    }

    // Overridden HLObject Methods

    @Override
    public HLObject deepclone() {
        return new HLNumber(this.value);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @Override
    public Boolean isSame(HLObject other) {
        if (other instanceof HLNumber) {
            HLNumber otherNum = (HLNumber) other;
            return this.value == otherNum.value;
        }
        return false;
    }

    @Override
    public Boolean isLessThan(HLObject other) {
        if (other instanceof HLNumber) {
            HLNumber otherNum = (HLNumber) other;
            return this.value < otherNum.value;
        }
        return false;
    }
    
 
    public Boolean isGreatThan(HLObject other) {
        if (other instanceof HLNumber) {
            HLNumber otherNum = (HLNumber) other;
            return this.value > otherNum.value;
        }
        return false;
    }

    public HLNumber negate() {
        return new HLNumber(-this.value);
    }

    public HLNumber add(HLObject operand) {
        if (operand instanceof HLNumber) {
            HLNumber other = (HLNumber) operand;
            return new HLNumber(this.value + other.value);
        }
        throw new IllegalArgumentException("Operand must be of type HLNumber");
    }

    public HLNumber sub(HLObject operand) {
        if (operand instanceof HLNumber) {
            HLNumber other = (HLNumber) operand;
            return new HLNumber(this.value - other.value);
        }
        throw new IllegalArgumentException("Operand must be of type HLNumber");
    }

    public HLNumber mul(HLObject operand) {
        if (operand instanceof HLNumber) {
            HLNumber other = (HLNumber) operand;
            return new HLNumber(this.value * other.value);
        }
        throw new IllegalArgumentException("Operand must be of type HLNumber");
    }

    public HLNumber mod(HLObject operand) {
        if (operand instanceof HLNumber) {
            HLNumber other = (HLNumber) operand;
            return new HLNumber(this.value % other.value);
        }
        throw new IllegalArgumentException("Operand must be of type HLNumber");
    }

    public HLNumber div(HLObject operand) {
        if (operand instanceof HLNumber) {
            HLNumber other = (HLNumber) operand;
            if (other.value == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return new HLNumber(this.value / other.value);
        }
        throw new IllegalArgumentException("Operand must be of type HLNumber");
    }

    public HLNumber card() {
        return new HLNumber(Math.abs(this.value));
    }

    // Other Methods

    // Helper Methods

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
