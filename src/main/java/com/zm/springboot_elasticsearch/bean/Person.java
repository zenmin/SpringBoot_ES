package com.zm.springboot_elasticsearch.bean;

import io.searchbox.annotations.JestId;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Describle This Class Is
 * @Author ZengMin
 * @Date 2018/7/27 20:44
 */
@Document(indexName = "data",type = "person")
public class Person {
    @JestId //指定Elasticsearch的ID    没有这个保存不了
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
