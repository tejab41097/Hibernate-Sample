package com.tejas.starter.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tejas.starter.Topic.Topic;

public interface TopicRepo extends CrudRepository<Topic, String> {

}
