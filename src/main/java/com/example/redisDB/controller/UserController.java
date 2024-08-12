package com.example.redisDB.controller;

import com.example.redisDB.service.RedisService;
import com.example.redisDB.vo.RedisVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/redis")
public class UserController {

    private final RedisService serivce;

    @PostMapping("/create")
    public ResponseEntity<?> addUser(@RequestBody RedisVo user) {
//        log.info("Controller Request: {}", user);
        RedisVo result = serivce.addUser(user);
//        log.info("Controller result: {}", result);
        return ResponseEntity.ok(result);
    }
}