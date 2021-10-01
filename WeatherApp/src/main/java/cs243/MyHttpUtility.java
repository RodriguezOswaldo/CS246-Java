package cs243;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MyHttpUtility {

    public String readHTTP(String url){
        try{
            URL urlObj = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
            BufferedReader r = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            StringBuilder data = new StringBuilder();
            String line;
            do{
                line = r.readLine();
                if (line != null){
                    data.append(line);
                }

            }while (line != null);

            return  data.toString();

        } catch (IOException e) {
            System.out.println("Error Reading HTTP DataL " + e);
            return null;
//            e.printStackTrace();
        }
    }
}
