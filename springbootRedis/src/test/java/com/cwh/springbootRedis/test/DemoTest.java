package com.cwh.springbootRedis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cwh.springbootRedis.dao.RedisDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

	 public static Logger logger= LoggerFactory.getLogger(DemoTest.class);
	    @Test
	    public void contextLoads() {
	    }

	    @Autowired
	    RedisDao redisDao;
	    @Test
	    public void testRedis(){
	        redisDao.setKey("name","cwh");
	        redisDao.setKey("age","25");
	        logger.info(redisDao.getValue("name"));
	        logger.info(redisDao.getValue("age"));
	    }
}
