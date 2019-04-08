package com.hnust.hua.algorithm;

import java.util.HashMap;
import java.util.Map;

/**  环路检测算法，用于数据库死锁检测
 * Created by Administrator on 2019/3/26.
 */
public class Test10 {

    public static void main(String[] args) {

        Map<Integer,Integer> decMap = new HashMap<>();

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(3,2);
        map.put(2,1);
        map.put(4,6);
        map.put(5,8);
        map.put(10,11);
        map.put(11,10);

        map.forEach((key,value)->{
            decMap.put(key,test(key,key,map));
        });

        for (Map.Entry<Integer,Integer> entry:decMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static Integer test(Integer id, Integer block, Map<Integer,Integer> map){
        Integer b = map.get(id);
        if (map.containsKey(b)){
            if (b.equals(block)){
                return 1;
            }else {
                return test(id,b,map);
            }
        }else {
            return 0;
        }
    }
}
