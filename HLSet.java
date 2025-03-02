


import java.util.*;
/**
 * Implements HLSet objects
 */

public class HLSet extends HLObject {

    // Instance Variables

    private TreeSet<Integer> value = null;
    private int len = 0;
    private Iterator<Integer> iter;

    // Class variables

    public static HLSet empty = new HLSet();

    // Constructors

    public HLSet() {
        value = new TreeSet<>();
    }

    public HLSet(TreeSet<Integer> lst) {
        value = new TreeSet<>(lst);
        len = value.size();
    }

    public HLSet(Collection<Integer> lst) {
        value = new TreeSet<>(lst);
        len = value.size();
    }

    public HLSet(HLNumber firstelem, HLNumber lastelem) {
        value = new TreeSet<>();
        if (firstelem.getValue() <= lastelem.getValue()) {
            for (int i = firstelem.getValue(); i <= lastelem.getValue(); i++) {
                value.add(i);
            }
        }
        len = value.size();
    }

    // Overridden HLObject Methods

    @Override
    public HLObject deepclone() {
        return new HLSet(new TreeSet<>(this.value));
    }

     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        iter = value.iterator();
        while (iter.hasNext()) {
            sb.append(iter.next());
            if (iter.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }


    @Override
    public Boolean isSame(HLObject other) {
        if (other instanceof HLSet) {
            HLSet otherSet = (HLSet) other;
            return this.value.equals(otherSet.value);  // Set equality
        }
        return false;
    }

   
    public Boolean isGreatThan(HLObject other) {
        if (other instanceof HLSet) {
            HLSet otherSet = (HLSet) other;
            return this.value.containsAll(otherSet.value) && !this.value.equals(otherSet.value); // Proper subset
        }
        return false;
    }
    
    
    @Override
    public Boolean isLessThan(HLObject other) {
        if (other instanceof HLSet) {
            HLSet otherSet = (HLSet) other;
            return otherSet.value.containsAll(this.value) && !this.value.equals(otherSet.value); // Proper superset
        }
        return false;
    }

    public HLSet add(HLObject operand) {
        if (operand instanceof HLSet) {
            HLSet otherSet = (HLSet) operand;
            TreeSet<Integer> resultSet = new TreeSet<>(this.value);
            resultSet.addAll(otherSet.value);
            return new HLSet(resultSet);
        }
        throw new IllegalArgumentException("Operand must be of type HLSet");
    }

    public HLSet sub(HLObject operand) {
        if (operand instanceof HLSet) {
            HLSet otherSet = (HLSet) operand;
            TreeSet<Integer> resultSet = new TreeSet<>(this.value);
            resultSet.removeAll(otherSet.value);
            return new HLSet(resultSet);
        }
        throw new IllegalArgumentException("Operand must be of type HLSet");
    }

    public HLSet mul(HLObject operand) {
        if (operand instanceof HLSet) {
            HLSet otherSet = (HLSet) operand;
            TreeSet<Integer> resultSet = new TreeSet<>(this.value);
            resultSet.retainAll(otherSet.value);
            return new HLSet(resultSet);
        }
        throw new IllegalArgumentException("Operand must be of type HLSet");
    }
    
    public HLNumber mod(HLObject operand)
    {
    return null;
    }

  public HLNumber div(HLObject operand)
    {
    return null;
    }

    public HLNumber card() {
        return new HLNumber(this.value.size());
    }

    // Division and Modulus operations are invalid for sets and hence omitted.

    // Other Methods

    public boolean isEmpty() {
        return this.value.isEmpty();
    }

    public boolean contains(HLNumber num) {
        return this.value.contains(num.getValue());
    }

    public TreeSet<Integer> get() {
        return new TreeSet<>(this.value);
    }

    // Helper Methods
    
    public HLSet negate() {
    TreeSet<Integer> negatedSet = new TreeSet<>();
    for (int value : this.value) {
        negatedSet.add(-value); // Add the negative of each value to the new set
    }
    return new HLSet(negatedSet); // Return a new HLSet with the negated values
}


}

