package com.zm.springboot_elasticsearch;

import com.zm.springboot_elasticsearch.bean.Person;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JestTest {

    @Autowired
    JestClient jestClient;

    @Test
    public void contextLoads() {
        Person p = new Person();
        p.setId(1);
        p.setAge(22);
        p.setName("zm");
        p.setSex("男");

        //构建一个索引功能              //实体     //索引库      //索引
        Index index = new Index.Builder(p).index("boot").type("person").build();
        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void search(){
        //查询表达式
        String match = "{\n" +
                "    \"query\": {\n" +
                "        \"match\": {\n" +
                "            \"id\": \"1\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        //创建一个搜索的Builder
        Search build = new Search.Builder(match).addIndex("boot").addType("person").build();
        try {
            SearchResult execute = jestClient.execute(build);
            System.out.println(execute.getJsonString());
            System.out.println(execute.getHits(Person.class).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
