package com.tensquare;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.HashMap;
import java.util.Map;

public class MongoTest {
	public static void main(String[] args) {
		MongoClient client=new MongoClient("192.168.33.128");
		MongoDatabase spitdb = client.getDatabase("spitdb");
		MongoCollection<Document> spit = spitdb.getCollection("spit");
		//BasicDBObject bon=new BasicDBObject("userid","1013");
		/*BasicDBObject bon = new BasicDBObject("visits", new BasicDBObject("$gt", 1000));
		FindIterable<Document> documents = collection.find(bon);
		for (Document document : documents) {
			System.out.println("内容:"+document.getString("content"));
			System.out.println("用户id:"+document.getString("userid"));
			System.out.println("访问量:"+document.getInteger("visits"));
		}*/
		Map<String,Object>map=new HashMap<String, Object>();
		map.put("_id",5);
		map.put("content","我高兴坏了！");
		map.put("userid","9999");
		map.put("visits","123");
		map.put("visits","123");
		Document document=new Document(map);
		spit.insertOne(document);
		client.close();
	}
}
