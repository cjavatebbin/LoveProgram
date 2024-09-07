
/**
 * Takes a String and replaces the first occurrence of "hate" with "love".
 * 
 * @author Terence Wu
 * @version 9/7/2024
 */
public class Love {
    
    public String loveNotHate(String str) {

        int index = str.indexOf("hate");
        if(index==-1)
            return str;
        else
            return str.substring(0,index)+"love"+str.substring(index+4);
    }
}
