import java.util.*;

public class IdentifierToken extends Token {
    /**
     * nameTable contains all the names of all identifiers in HL
     */
    private static ArrayList<String> nameTable = new ArrayList<String>();

    /**
     * typeTable contains the types ('kind') of all identifiers in HL
     */
    private static ArrayList<Integer> typeTable = new ArrayList<>();

    /**
     * Returns the name of the identifier with the specified key
     * @param key int key of identifier
     * @return the name of the identifier with the specified key
     */  
    public static String getName(int key) {
        return nameTable.get(key);
    }

    /**
     * Returns the name of the identifier with the specified key
     * @param key Integer key of identifier
     * @return the name of the identifier with the specified key
     */      
    public static String getName(Integer key) {
        return nameTable.get(key.intValue());
    }

    /**
     * Returns the type ('kind') of the identifier with the specified key
     * @param key int key of identifier
     * @return the type ('kind') of the identifier
     */
    public static int getType(int key) {
        return typeTable.get(key);
    }

    /**
     * Returns the type ('kind') of the identifier with the specified key
     * @param key Integer key of identifier
     * @return the type ('kind') of the identifier
     */
    public static int getType(Integer key) {
        return typeTable.get(key.intValue());
    }

    /**
     * Returns the number of names of identifiers in HL
     * @return the number of names of identifiers in HL
     */      
    public static int totalIdentifiers() {
        return nameTable.size();
    }

    /**
     * A unique key is stored for each identifier name to be used later in symbol tables
     */ 
    public int key;

    /**
     * The key is also stored as an Integer to be stored in ASTIdentifier nodes
     */ 
    public Integer Key;

    /**
     * Creates a new IdentifierToken with the specified name.
     * If not already there, name is added to nameTable.
     * This will keep a key into nameTable for its name.
     * For C and B learning objectives, this method should trigger a static call to
     * something like HLSymbTab.newIdName(key)
     * @param type the token type
     * @param name name of the identifier (just scanned)
     * @return a new IdentifierToken with the specified name
     */      
    public IdentifierToken(int type, String name) {
        this.kind = type;
        this.image = name;

        // Find if name is already in the table
        int idx = nameTable.indexOf(name);
        if (idx == -1) {
            // New identifier
            idx = nameTable.size();
            nameTable.add(name);
            typeTable.add(type); // Add the type to typeTable
        }

        this.key = idx;
        this.Key = Integer.valueOf(idx);
    }

    /**
     * Returns String name of identifier
     * @return String name of identifier
     */     
    public String toString() {
        return image;
    }

    /**
     * Retrieves key of identifier to be stored in ASTIdentifier nodes
     * @return Integer key of identifier
     */     
    public Integer getValue() {
        return Key;
    }

    /**
     * Retrieves key of identifier
     * @return int key of identifier
     */  
    public int getKey() {
        return key;
    }
}
