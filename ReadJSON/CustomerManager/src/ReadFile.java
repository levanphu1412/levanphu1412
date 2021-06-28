import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadFile {

    //Cách 1
    public void getData(){
        //ArrayList<Customer> listCustomer = new ArrayList<>();
        JSONParser parser = new JSONParser();


        try(FileReader reader = new FileReader("customer.json")){

            //Read JSON file
            Object obj = parser.parse(reader);
 
            JSONArray customerList = (JSONArray) obj;
            //System.out.println(customerList);

            //Iterate over employee array
            customerList.forEach( cus -> parseCustomerObject( (JSONObject) cus ) );
             
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseCustomerObject(JSONObject jsonObject){

        long id = (long) jsonObject.get("id");

        String first_name = (String) jsonObject.get("first_name");

        String last_name = (String) jsonObject.get("last_name");

        String email = (String) jsonObject.get("email");

        String mobile = (String) jsonObject.get("mobile");

        String address = (String) jsonObject.get("address");
        
        System.out.println(id + " - " +first_name+" - " + last_name 
                        + " - " + email + " - " + mobile + " - " + address);
    }


    //Cách 2: Sử dụng Gson
    public void getCustomers(){
        List<Customer> listCustomers;
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("customer.json")){

            listCustomers = new Gson().fromJson(reader, new TypeToken<List<Customer>>() {}.getType());
            for (Customer customer : listCustomers) {
                System.out.println(customer);
            }

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // List<Customer> list = new ArrayList<>();
        // JSONParser parser = new JSONParser();
        // //JSONArray listCustomer;

        // try(FileReader reader = new FileReader("customer.json")){
        //     Object obj = parser.parse(reader);
            
        //     //JSONObject jsonObject = (JSONObject) obj;
        //     listCustomer = new JSONArray();
        //     long id = (long) jsonObject.get("id");

        //     String first_name = (String) jsonObject.get("first_name");
    
        //     String last_name = (String) jsonObject.get("last_name");
    
        //     String email = (String) jsonObject.get("email");
    
        //     String mobile = (String) jsonObject.get("mobile");
    
        //     String address = (String) jsonObject.get("address");
  

        //     list.add(new Customer(id, first_name, last_name, email, mobile, address));

        //     //listCustomer.addAll(list);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } catch (ParseException e) {
        //     e.printStackTrace();
        // }
        // return listCustomer;
    }
    
    public void getPerson() {
        List<Person> listPerson;
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("person.json")) {
            listPerson = new Gson().fromJson(reader, new TypeToken<List<Person>>() {}.getType());
            for(Person person : listPerson) {
                System.out.println(person);
            }
            reader.close();

            Map<String, Integer> countPeopleByCountry = new HashMap<>();
            for (int i = 0; i < listPerson.size(); i++) {
                if(countPeopleByCountry.get(listPerson.get(i).getCountry()) == null){
                    countPeopleByCountry.put(listPerson.get(i).getCountry(), 1);
                }else{
                    int a = countPeopleByCountry.get(listPerson.get(i).getCountry()) + 1;
                    countPeopleByCountry.put(listPerson.get(i).getCountry(), countPeopleByCountry.get(listPerson.get(i).getCountry())+1);
                }
            }
            System.out.println(countPeopleByCountry);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
       
    }

}
