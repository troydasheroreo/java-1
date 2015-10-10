import java.net.*;
import java.util.Map;
import com.google.gson.Gson;
import java.io.IOException;
import skilstak.c;
import java.io.*;

public class fooget {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://pokeapi.co/api/v1/pokemon/" + args[0]);
        URLConnection conn = url.openConnection();
        Map data = new Gson().fromJson(new InputStreamReader(conn.getInputStream()), Map.class);
        System.out.println(args[0] + "'s " + args[1] + " is/are ") ;
        System.out.println(data.get(args[1]));

    }

}
