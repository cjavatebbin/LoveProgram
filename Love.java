
/**
 * Takes a string and replaces the first occurence of "hate" with "love", leaving the string untouched if "hate" doesn't appear.
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
