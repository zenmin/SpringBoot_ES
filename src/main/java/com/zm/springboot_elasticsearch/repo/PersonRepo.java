package com.zm.springboot_elasticsearch.repo;

import com.zm.springboot_elasticsearch.bean.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Describle This Class Is
 * @Author ZengMin
 * @Date 2018/7/28 11:30
 */
public interface PersonRepo extends ElasticsearchRepository<Person,Integer> {

}
