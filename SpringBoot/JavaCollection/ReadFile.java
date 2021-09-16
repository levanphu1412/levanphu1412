import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    List<Person> listPerson = new ArrayList<Person>();

    public void readData() {
        
        try (FileReader reader = new FileReader("MOCK_DATA.json")) {
            listPerson = new Gson().fromJson(reader, new TypeToken<List<Person>>() {
            }.getType());
            // for(Person person : listPerson) {
            //     System.out.println(person);
            // }
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }
    
    }
}