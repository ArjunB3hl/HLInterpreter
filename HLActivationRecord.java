import java.util.ArrayList;

public class HLActivationRecord {
    private ArrayList<KeyValue> record = new ArrayList<>();
    private int scopeId; // The ID of the active scope
    private HLSymbTab table;
   

    public HLActivationRecord(int scopeId) {
        this.scopeId = scopeId;
        if(scopeId == 0){
        
        this.addSymbTab(Scope.currentScope());
        
        
        }
    }
    
    public void addSymbTab(HLSymbTab table) {
        this.table = table;
    }
    
    public void addKeyValue(KeyValue keyValue) {
        record.add(keyValue);
    }
    
     public Object findValue(int key) {
        for(KeyValue keyValue: record){
            if(key == keyValue.getKey()){
             return keyValue.getValue();
            
            
            }
        
        }
        
        return null;
    }
    
    public ArrayList<KeyValue> getKeyValues(){
    
    return record;
    
    }
    
    public void setValue(int key, Object Value) {
        for(KeyValue keyValue: record){
            if(key == keyValue.getKey()){
              keyValue.setValue(Value);
            
            
            }
        
        }
    }
    

    public int getScopeId() {
        return this.scopeId;
    }
    
    public HLSymbTab getSymbTab() {
        return this.table;
    }

   
}
