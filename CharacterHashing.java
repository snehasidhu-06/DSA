public class CharacterHashing{
    public static void main(String[] args){
// Brute force
        String str = "aabccd";

        int[] freq = new int[26];

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            freq[ch-'a']++;
        }

        for(int i = 0;i<26;i++){

            if (freq[i]>0){
                char ch = (char)(i + 'a');
                System.out.println(ch + "->" + freq[i]);
            }

        }


    }
}
