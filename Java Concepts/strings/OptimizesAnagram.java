package strings;

public class OptimizesAnagram {
    public static void main(String[] args) {

        String a = "acdrrb";
        String b = "abcdrb";
        int al[] = new int[256];
        // int bl[] = new int[256];
        boolean isAnagram = true;


        for(char c: a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index = (int) c;
            // bl[index]++;
            al[index]--;
        }

        for(int i = 0; i < 256; i++){
            if(al[i] != 0 /*bl[i]*/){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not An Anagram");
        }
    }
}
