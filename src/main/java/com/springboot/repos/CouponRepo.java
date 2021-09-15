package com.springboot.repos;

import com.springboot.model.Coupon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CouponRepo extends JpaRepository<Coupon,Long> {

    Coupon findByCode(String code);
}
