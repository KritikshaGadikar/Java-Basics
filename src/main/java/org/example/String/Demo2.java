package org.example.String;


// Uphill now we have look about the types so we have mutable one so this will achieve with the help of string buffer, and we will look this now
public class Demo2 {
    public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("navin");                    // this is string buffer here we can change anything  and there are many methods also we will try some
        sb.append("reddy");
        sb.insert(5, "java");
        System.out.println(sb);
    }
}

// this is tread safe but string builder is not thread safe