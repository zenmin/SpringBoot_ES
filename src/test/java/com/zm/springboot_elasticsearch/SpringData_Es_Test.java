package com.zm.springboot_elasticsearch;

import com.zm.springboot_elasticsearch.bean.Person;
import com.zm.springboot_elasticsearch.repo.PersonRepo;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringData_Es_Test {

    @Autowired
    PersonRepo personRepo;

    @Test
    public void contextLoads() {
        Person p = new Person();
        p.setSex("男");
        p.setName("zmzm");
        p.setAge(12);
        p.setId(1);
        personRepo.index(p);
    }
}
