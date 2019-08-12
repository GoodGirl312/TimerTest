package com.example.timer;


import com.example.timer.entity.Person;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.timer")
public class TimerApplication {

    public static void main(String[] args) {

        List<Map<String, Object>> maps = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 22);
        maps.add(map);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "李四");
        map2.put("age", 23);
        maps.add(map2);


        try {
            List<Object>  people = ListMapToListObject(maps, Person.class);
            for (Object obj:people) {
                Person person=(Person)obj;
                System.out.println(person.getAge()+person.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        Object obj = beanClass.newInstance();
        BeanUtils.populate(obj, map);

        return obj;
    }

    public static List<Object> ListMapToListObject(List<Map<String, Object>> maps, Class<?> beanClass) throws Exception {

        if (maps == null) {
            return null;
        }
        List<Object> list=new ArrayList<>();
        for (Map<String, Object> map : maps) {
            Object obj= beanClass.newInstance();
            BeanUtils.populate(obj, map);
            list.add(obj);
        }
        return list;
    }
}
