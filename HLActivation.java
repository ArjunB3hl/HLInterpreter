import java.util.ArrayDeque;
import java.util.ArrayList;

public class HLActivation {
    // Activation stack to manage active scopes
    private static ArrayDeque<HLActivationRecord> activationStack = new ArrayDeque<>();
    

    /**
     * Initialize a new scope with a given scope ID.
     *
     * @param scopeId The ID of the new scope.
     */
    public static void pushScope(int scopeId) {
        HLActivationRecord record = new HLActivationRecord(scopeId);
        activationStack.push(record);
        
    }
    
    

    /**
     * Pop the topmost scope from the activation stack.
     */
    public static void popScope() {
        if (activationStack.isEmpty()) {
            throw new IllegalStateException("Cannot pop scope: No active scopes.");
        }
        
        activationStack.pop();
    }
    /**
     * Get the current active scope.
     *
     * @return The topmost activation record ArrayList from the stack.
     */
    public static HLActivationRecord currentScope() {
        if (activationStack.isEmpty()) {
            throw new IllegalStateException("No active scopes.");
        }
        return activationStack.peek();
    }
    
    
    public static  ArrayDeque<HLActivationRecord> getStack() {
       
        return activationStack;
    }
     
    
}