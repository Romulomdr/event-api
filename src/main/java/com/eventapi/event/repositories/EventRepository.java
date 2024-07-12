package com.eventapi.event.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventapi.event.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, UUID>{

}
