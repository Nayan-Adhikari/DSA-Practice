package String;

public class ReverseOrderWord {
    String s;
    String[] words = s.trim().split("\\s+");

    StringBuilder reverse = new StringBuilder();
    for(int i = words.length - 1;i>=0;i--){
        reverse.append(words[i]);

        if(i != 0){
            reverse.append(" ");
        }
    }

    return reverse.toString();
}
