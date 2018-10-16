public class IntegerSet {
    private boolean[] integerSet = new boolean[100];

    public IntegerSet() {

    }

    boolean[] getIntegerset() {
        return this.integerSet;
    }

    public static IntegerSet union(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            result.integerSet[i] = firstSet.integerSet[i] || secondSet.integerSet[i];
        }
        return result;
    }

    public static IntegerSet intersection(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            result.integerSet[i] = firstSet.integerSet[i] && secondSet.integerSet[i];
        }
        return result;
    }

    public static IntegerSet difference(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            if (firstSet.integerSet[i] && firstSet.integerSet[i] != secondSet.integerSet[i]) {
                result.integerSet[i] = firstSet.integerSet[i];
            }
        }
        return result;
    }

    public void insertElement(int element) {
        if (element < this.integerSet.length && element >= 0) {
            this.integerSet[element] = true;
        }
    }

    public void deleteElement(int element) {
        if (element < this.integerSet.length && element >= 0) {
            this.integerSet[element] = false;
        }
    }

    public String toString(){
        String result = "Integer {";
        for(int i = 0; i< this.integerSet.length; i++){
            if(this.integerSet[i]) {
                result = result + (i+1) + " ";
            }
        }
        result = result.substring(0,result.length()-1);
        result += "}";


        return result;
    }

    public boolean isEqualTo(IntegerSet inputSet){
        for(int i = 0; i < this.integerSet.length; i++){
            if(this.integerSet[i] != inputSet.getIntegerset()[i]){
                return false;
            }
        }
        return true;
    }
}
