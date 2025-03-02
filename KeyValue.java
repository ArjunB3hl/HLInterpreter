class KeyValue {
    private int key;
    private Object value;

    public KeyValue(int key, Object value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }


    public void setValue(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return value;
    }
}