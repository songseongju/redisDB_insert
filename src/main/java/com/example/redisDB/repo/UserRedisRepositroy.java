package com.example.redisDB.repo;


import com.example.redisDB.vo.RedisVo;
import org.springframework.data.repository.CrudRepository;

public interface UserRedisRepositroy extends CrudRepository<RedisVo, String> {
}