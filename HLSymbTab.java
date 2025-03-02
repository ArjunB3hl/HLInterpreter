import java.util.ArrayList;

public class HLSymbTab {
    // Static variable to track the current symbol table ID
    private int tableId;

    // List of symbol table entries
    private ArrayList<HLSymbTabEntry> symbEntries;



    public HLSymbTab(int tableID) {
        this.tableId = tableID;
        this.symbEntries = new ArrayList<>();
    }

    public int getTableId() {
        return tableId;
    }

   


    // Add a new entry to the symbol table
    public void addEntry(HLSymbTabEntry entry) {
        symbEntries.add(entry);
    }

    // Retrieve all entries in this symbol table
    public ArrayList<HLSymbTabEntry> getEntries() {
        return symbEntries;
    }

    // Find an entry by key
    public HLSymbTabEntry findEntry(int key) {
        for (HLSymbTabEntry entry : symbEntries) {
            if (entry.getKey() == key) {
                return entry;
            }
        }
        return null; // Not found
    }
    
    // Retrieve the latest entry in the symbol table
    public HLSymbTabEntry getLatestEntry() {
        if (!symbEntries.isEmpty()) {
            return symbEntries.get(symbEntries.size() - 1); // Return the last element in the list
        }
        return null; // Return null if the list is empty
}

    

}
