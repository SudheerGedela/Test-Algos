package gson;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Project: Test-Algos
 * Package: gson
 * <p>
 * User: vamshi
 * Date: 5/3/18
 * Time: 5:59 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestGson {

    static public void main(String...args){
        Gson gson = new Gson();

//        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        String json = "{\"page\":1,\"per_page\":10,\"total\":50,\"total_pages\":0,\"data\":[1,2,3]}";

        Auto auto = gson.fromJson(json,Auto.class );

        System.out.println(auto.getTotal());
        System.out.println(Arrays.toString(auto.getData()));

    }

}

@Getter
@Setter
class Auto{
    private int page;
    private int perPage;
    private int total;
    private int totalPages;
    private String[]data;
}
