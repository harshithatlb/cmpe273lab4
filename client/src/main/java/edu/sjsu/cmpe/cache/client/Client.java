package edu.sjsu.cmpe.cache.client;
import com.google.common.base.Charsets;
import com.google.common.hash.HashFunction;
import com.google.common.hash.*;
import com.google.common.hash.HashCode;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Client {
	
    public static void main(String[] args) throws Exception {
        
	System.out.println("Starting Cache Client...");
	CacheServiceInterface cache = new DistributedCacheService("http://localhost:3000","http://localhost:3001","http://localhost:3002");
	cache.put(1,"a");
	System.out.println("now getting 'a' from server");
	String val = cache.get(1);
	System.out.println("get(1) :"+val);
}
}
