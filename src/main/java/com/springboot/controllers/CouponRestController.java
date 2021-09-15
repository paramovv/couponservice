package com.springboot.controllers;

import com.springboot.model.Coupon;
import com.springboot.repos.CouponRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/api")
public class CouponRestController {
    @Autowired
    CouponRepo repo;

    @PostMapping("/coupons")
    public Coupon createCoupon(@RequestBody Coupon coupon){
        return repo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
        public Coupon getCouponByCode(@PathVariable("code") String code){
        log.warn("/coupons/{code}");
            return repo.findByCode(code);

    }
    @RequestMapping("/")
    public String home() {
        log.warn(" showRegistrationForm");
        return "home.html";
    }
}
