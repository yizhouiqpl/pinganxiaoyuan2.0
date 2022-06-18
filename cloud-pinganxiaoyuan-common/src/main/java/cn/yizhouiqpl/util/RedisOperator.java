//package cn.yizhouiqpl.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Component;
//import redis.clients.jedis.Jedis;
//
//import java.util.Map;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
///**
// * @Author: yizhouiqpl
// * @Date: 2022/06/13/23:47
// */
//@Component
//public class RedisOperator {
//
//    @Autowired
//    private StringRedisTemplate redisTemplate;
//
//    /**
//     * 实现命令，TTL key以秒为单位，返回给定key的剩余生存时间（TTL，time to live
//     * @param key
//     * @return
//     */
//    public long ttl(String key) {
//        return redisTemplate.getExpire(key);
//    }
//
//    /**
//     * 实现命令：expire 设置过期时间，单位秒
//     * @param key
//     * @param timeout
//     */
//    public void expire(String key, long timeout) {
//        redisTemplate.expire(key, timeout, TimeUnit.SECONDS);
//    }
//
//
//    /**
//     * 实现命令： INCR key，增加key一次
//     * @param key
//     * @param delta
//     * @return
//     */
//    public long incr(String key, long delta) {
//        return redisTemplate.opsForValue().increment(key, delta);
//    }
//
//    /**
//     * 实现命令：KEYS pattern，就是让所有符合给定模式pattern 的key
//     * @param pattern
//     * @return
//     */
//    public Set<String> keys(String pattern) {
//        return redisTemplate.keys(pattern);
//    }
//
//    /**
//     * 实现命令：DEL key，删除一个key
//     * @param key
//     */
//    public void del(String key) {
//        redisTemplate.delete(key);
//    }
//
//    /**
//     * 实现命令：SET key value,设置一个key-value（将字符串值 value关联到key）
//     * @param key
//     * @param value
//     */
//    public void set(String key, String value) {
//        redisTemplate.opsForValue().set(key, value);
//    }
//
//    /**
//     * 实现命令：SET key value EX seconds,设置key-value和超时时间（秒）
//     * @param key
//     * @param value
//     * @param timeout
//     */
//    public void set(String key, String value, long timeout) {
//        redisTemplate.opsForValue().set(key, value, timeout,TimeUnit.SECONDS);
//    }
//
//    /**
//     * 实现命令：GET key,返回所关联的字符串值
//     * @param key
//     * @return
//     */
//    public String get(String key) {
//        return redisTemplate.opsForValue().get(key);
//    }
//
//    /**
//     * 实现命令：HSET key field value， 将哈希表key中的域 field的值 设为value
//     * @param key
//     * @param field
//     * @param value
//     */
//    public void hset(String key, String field, Object value) {
//        redisTemplate.opsForHash().put(key, field, value);
//    }
//
//    /**
//     * 实现命令：HGET key field，返回哈希表key中给定域field的值
//     * @param key
//     * @param field
//     * @return
//     */
//    public String hget(String key, String field) {
//        return (String)redisTemplate.opsForHash().get(key, field);
//    }
//
//    /**
//     * 实现命令：HDEL KEY field [field ...] 删除哈希表key中的一个或多个指定域一，不存在的域 将被 忽略
//     * @param key
//     * @param fields
//     */
//    public void hdel(String key, Object... fields) {
//        redisTemplate.opsForHash().delete(key, fields);
//    }
//
//    /**
//     * 实现命令：HGETALL key,返回哈希表key中，所有的域和值
//     * @param key
//     * @return
//     */
//    public Map<Object, Object> hgetall(String key) {
//        return redisTemplate.opsForHash().entries(key);
//    }
//
//    /**
//     * 实现命令：LPUSH KEY VALUE 将一个值 value插入到列表key的表头
//     * @param key
//     * @param value
//     * @return 执行LPUSH命令后，列表的长度
//     */
//    public long lpush(String key, String value) {
//        return redisTemplate.opsForList().leftPush(key, value);
//    }
//
//    /**
//     * 实例命令：LPOP key，移除并返回列表key 的头元素
//     * @param key
//     * @return 列表key的头元素
//     */
//    public String lpop(String key) {
//        return (String)redisTemplate.opsForList().leftPop(key);
//    }
//
//    /**
//     * 实现命令： RPUSH key value，将一个值value插入到列表key的表尾（最右边）
//     * @param key
//     * @return 执行LPUSH命令后，列表的长度
//     */
//    public long rpush(String key, String value) {
//        return redisTemplate.opsForList().rightPush(key, value);
//    }
//
////    public static void main(String[] args) {
////        Jedis jedis = new Jedis("192.168.254.91");
////
////        System.out.println(jedis.ping());
////    }
//
//}
//
