import java.util.ArrayList;

public class LocalScope {
    // Static array to hold scope objects (HLSymbTab and scope ID)
    private static ArrayList<ScopeRecord> scopes = new ArrayList<>();

    /**
     * Add a new scope record to the list.
     *
     * @param symbTab The symbol table associated with the scope.
     * @param scopeId The ID of the scope.
     */
    public static void addScope(HLSymbTab symbTab, int scopeId, int key, int params) {
        scopes.add(new ScopeRecord(symbTab, scopeId, key, params));
    }

    /**
     * Retrieve a symbol table by scope ID.
     *
     * @param scopeId The ID of the desired scope.
     * @return The associated HLSymbTab object, or null if not found.
     */
    public static HLSymbTab getSymbolTableByScope( int scopeId, int key, int params) {
        for (ScopeRecord record : scopes) {
            if (record.getScopeId() == scopeId) {
                if (record.getKey() == key) {
                    if (record.getParams() == params) {
                          
                          
                           return record.getSymbTab();
            
            
                }
              }
            }
        }
        return null; // Not found
    }
    
    
    public static void print( ){
    
    for(ScopeRecord record: scopes) {
     
     HLSymbTab table = record.getSymbTab();
     System.out.println("We have a table with " + table.getTableId());
     System.out.println();
   
    
    
    }
    
    
    
    }
  
    
  
}
