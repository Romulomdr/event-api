package com.eventapi.event.domain.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eventapi.event.domain.event.Event;
import com.eventapi.event.domain.event.EventRequestDTO;

@Service
public class EventService {

	public Event creatEvent(EventRequestDTO data) {
		String imgUrl = null;
		
		if(data.image() != null) {
			imgUrl = this.uploadImg(data.image());
		}
		Event newEvent = new Event();
		newEvent.setTitle(data.title());
		newEvent.setDescription(data.description());
		newEvent.setEventUrl(data.eventUrl());
		newEvent.setDate(new Date(data.date()));
		newEvent.setImgUrl(imgUrl);
		return newEvent;
	}
	
	public String uploadImg(MultipartFile file) {
		
		
		return "";
	}
}
