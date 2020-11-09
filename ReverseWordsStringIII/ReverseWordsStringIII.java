package ReverseWordsStringIII;

public class ReverseWordsStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] splitWords = s.split(" ");
        
        for(int k = 0; k < splitWords.length; k++) {
            char[] charWords = splitWords[k].toCharArray();
            
            int i = 0, j = charWords.length - 1;
            
            while(i < j) {
                char temp = charWords[i];
                charWords[i++] = charWords[j];
                charWords[j--] = temp;
            }
            
            for(i = 0; i < charWords.length; i++) {
                sb.append(charWords[i]);
            }
            
            if(k < splitWords.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
