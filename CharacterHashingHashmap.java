import java.util.*;

public class CharacterHashingHashmap{
    public static void main(String[] args) {
        
        String str = "aabccd";

        HashMap<Character ,Integer> freq = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + "->"+entry.getValue());
        }
    }}
