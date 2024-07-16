package com.eventapi.event.domain.event;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String State, Boolean remote, String eventUrl, MultipartFile image) {

}
