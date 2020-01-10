package com.tejas.starter.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.starter.Repository.TopicRepo;
import com.tejas.starter.Topic.Topic;

@Service
public class TopicService {
	@Autowired
	private TopicRepo topicRepo;	
	private static List<Topic> topics= new ArrayList<Topic>(Arrays.asList(new Topic("1","hi","afdsgh"),new Topic("2","helo","sdfghjk"),new Topic("3","hey","wsertyui")));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<Topic>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public static void updateTopic(Topic topic) {
		String id = topic.getId();
		for (int i=0;i<topics.size();i++) {
			if(id.equals(topics.get(i).getId())){
				topics.set(i, topic);
				return;
			}			
		}
		
	}

	public static void deleteTopic(String id) {
		for (int i=0;i<topics.size();i++) {
			if(id.equals(topics.get(i).getId())){
				topics.remove(i);
				return;
			}			
		}
	}
}
