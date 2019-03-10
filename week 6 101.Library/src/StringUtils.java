public class StringUtils {
    
    // class prevents search from being case sensitive 
    public static boolean included(String word, String searched) {
        // checks if word contains 'searched' String
        // If either of the strings is null, returns false
        String newSearched = word.toUpperCase().trim();
        String newWord = searched.toUpperCase();
        if(newWord.contains(newSearched)) {
            return true;
        } 
        return false;
    }   
}
