package testgit.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray array = new JSONArray();
        HashMap hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        array.add(hashMap);
        List<HashMap> hashMaps = array.toJavaList(HashMap.class);
        System.out.println(array.toString());
        for (HashMap map : hashMaps) {
            for (Object o : map.keySet()) {
                System.out.println(map.get(o));
            }
        }
    }
}
