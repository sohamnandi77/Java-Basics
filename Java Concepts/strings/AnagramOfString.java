package strings;
// noob Solution -- O(n^2)
public class AnagramOfString {
    public static void main(String[] args){
    // anagram is basically -- silent and listens (same count and length)
    String str1 = "acb";
    String str2 = "abcdc";

    boolean isAnagram = false;
    boolean visted[] = new boolean[str2.length()];
    
    if(str1.length() == str2.length()){
        for(int i = 0; i <str2.length(); i++){
            char c = str1.charAt(i);
            isAnagram = false;
            for(int j = 0; j <str2.length(); j++){
            if(str2.charAt(j) == c && !visted[j]){
                isAnagram = true;
                visted[j] = true;
                break;
            }
        }
            if(!isAnagram){
                break;
            }
        }
    }
        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not An Anagram");
        }
        
    }
}
