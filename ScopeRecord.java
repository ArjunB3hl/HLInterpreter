import java.util.ArrayList;



    // Internal class to store scope records
public class ScopeRecord {
        private HLSymbTab symbTab; // Symbol table for the scope
        private int scopeId; 
        private int key;
        private int params;

        public ScopeRecord(HLSymbTab symbTab, int scopeId, int key, int params) {
            this.symbTab = symbTab;
            this.scopeId = scopeId;
            this.key = key;
            this.params = params;
        }

        public HLSymbTab getSymbTab() {
            return this.symbTab;
        }
        
        public int getKey() {
            return this.key;
        }
        
        
        public int getScopeId() {
            return this.scopeId;
        }
        
        public int getParams() {
            return this.params;
        }


    }

