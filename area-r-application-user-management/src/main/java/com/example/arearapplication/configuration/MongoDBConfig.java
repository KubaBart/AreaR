package com.example.arearapplication.configuration;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDBConfig {
    private MongoTemplate mongoTemplate;
    public MongoDBConfig(MongoTemplate mongoTemplate)
    {
        this.mongoTemplate = mongoTemplate;
    }
}
