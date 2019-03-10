public class Change {
    
    private char fromCharacter; 
    private char toCharacter; 
    
    public Change(char fromCharacter, char toCharacter) {
        // creates an object that makes changes from character fromCharacter to toCharacter
        this.fromCharacter = fromCharacter; 
        this.toCharacter = toCharacter; 
    }
    
    public String change(String characterString) {
        // returns the changed version of the given character string
        return characterString.replace(this.fromCharacter, this.toCharacter);
    }
}
