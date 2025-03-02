
import java.util.ArrayList;
public class HLSymbTabEntry {
    private int key;   // Unique identifier key
    private int type;  // Type of the identifier (e.g., IDNUM, IDSET, etc.)
    private int scope; // Reference to the symbol table using the static variable
    private SimpleNode body; // Body node of the function or construct
    private ArrayList<Integer> param; // Keys of parameters

    public HLSymbTabEntry(int key, int type) {
        this.key = key;
        this.type = type;
        this.scope = -1;
        this.body = null; // Default to null
        this.param = new ArrayList<>();
    }

    public int getKey() {
        return key;
    }

    public int getType() {
        return type;
    }
    
    
    public int getScope() {
        return scope;
    }

    public SimpleNode getBody() {
        return body;
    }
    

    
    public void setBody(SimpleNode body) {
        this.body = body;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public ArrayList<Integer> getParam() {
        return param;
    }
    
    public int getParamSize() {
        return param.size();
    }
    
    

    public void addParam(Integer newParam) {
        if (!param.contains(newParam)) { // Ensure no duplicates
            param.add(newParam);
        }
    
    
}
}