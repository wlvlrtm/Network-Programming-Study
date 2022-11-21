package Ex7;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Example7a {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "http://www.google.com/search?q=흥부 놀부";
        String urla = URLEncoder.encode(str, "UTF-8");
        System.out.println(urla);

        String urlb = "http://www.google.com/search?q=" + URLEncoder.encode("흥부 놀부", "UTF-8");
        System.out.println(urlb);
        
        String t = URLDecoder.decode(urlb, "UTF-8");
        System.out.println(t);
    }
}
