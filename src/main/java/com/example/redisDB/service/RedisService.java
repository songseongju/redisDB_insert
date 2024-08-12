package com.example.redisDB.service;

import com.example.redisDB.repo.UserRedisRepositroy;
import com.example.redisDB.vo.RedisVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class RedisService {
    private final UserRedisRepositroy repository;
    @Transactional
    public RedisVo addUser(RedisVo user) {
        RedisVo save = repository.save(user);
        Optional<RedisVo> result = repository.findById(save.getId());
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Database has no Data");
        }
    }
}