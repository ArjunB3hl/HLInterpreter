import java.util.ArrayDeque;

public class Scope {
    // Stack to manage active scopes
    private static ArrayDeque<HLSymbTab> scopeStack = new ArrayDeque<>();

    // Push a new scope onto the stack
    public static void pushScope(HLSymbTab symbTab) {
        scopeStack.push(symbTab);
    }

    // Pop the topmost scope from the stack
    public static void popScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
        } else {
            throw new IllegalStateException("Cannot pop scope: No active scopes.");
        }
    }

    // Get the current scope
    public static HLSymbTab currentScope() {
        if (scopeStack.isEmpty()) {
            throw new IllegalStateException("No active scope.");
        }
        return scopeStack.peek();
    }

    // Initialize the global scope
    public static void pushGlobal() {
        HLSymbTab globalTable = new HLSymbTab(0); // Create a new symbol table
        pushScope(globalTable); // Push it onto the scope stack
    }
    
    
     public static void print( ){
     
      System.out.println("Entering the scope stack " );
            for(HLSymbTab table: scopeStack) {
               System.out.println("This is a symbol table" );
              
                for( HLSymbTabEntry entry: table.getEntries()){
     
     
                             System.out.println("entry : key " + entry.getKey() + " scope " + entry.getScope() + " params " + entry.getParamSize());
     
                               }
                                System.out.println();
    
    
                                  }
    
    
    
    }
}
