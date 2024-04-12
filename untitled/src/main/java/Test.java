import java.util.*;

public class Test {

    public  static  void main(String args[]){
        String data ="Pneumonoultramicroscopicsilicovolcanoconiosis";
        char[] dataSet = data.toCharArray();
        LinkedHashMap<Character,Integer> stringIntegerHashMap = new LinkedHashMap<Character,Integer>();
        for(char temp : dataSet){
            if(stringIntegerHashMap.containsKey(temp)){
                stringIntegerHashMap.put(temp,stringIntegerHashMap.get(temp)+1);
            }else {
                stringIntegerHashMap.put(temp,1);
            }


        }

        Set<Character> keySet = stringIntegerHashMap.keySet();
        for(char tem : keySet){
            System.out.println(tem+  "-->"+ stringIntegerHashMap.get(tem));
        }
//        for (char temp : dataSet){
//
//            System.out.println( temp +" "+  stringIntegerHashMap.get(temp));
//        }

    }
}
