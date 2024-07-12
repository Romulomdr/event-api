package com.eventapi.event.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventapi.event.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{

}
