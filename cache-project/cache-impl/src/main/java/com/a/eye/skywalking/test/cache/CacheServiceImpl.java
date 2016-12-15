package com.a.eye.skywalking.test.cache;

import com.a.eye.skywalking.test.cache.h2.H2ServiceManager;
import com.a.eye.skywalking.test.cache.jedis.JedisServiceManager;
import com.a.eye.skywalking.test.cache.util.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xin on 2016/12/13.
 */
public class CacheServiceImpl implements CacheService {

    @Autowired
    private JedisServiceManager manager;

    @Autowired
    private H2ServiceManager h2ServiceManager;


    public String findCache(String key) {
        String value = manager.find(key);
        if (value != null)
            return value;

        return h2ServiceManager.find(key);
    }

    @Override
    public void updateCache(String key, String cacheValue) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(cacheValue)) {
            return;
        }

        manager.updateCache(key, cacheValue);
        h2ServiceManager.updateCache(key, cacheValue);
    }
}
