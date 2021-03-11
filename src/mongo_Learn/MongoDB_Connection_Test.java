package mongo_learn;
import com.mongodb.client.MongoCollection;
import com.mongodb.MongoClient;
import org.bson.Document;
import com.mongodb.MongoCredential;
public class MongoDB_Connection_Test {

	public static void main(String[] args) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		System.out.println("HEyy : " + mongo);
		
		MongoCredential credential; 
	      credential = MongoCredential.createCredential("vivek", "EmployeeDB", 
	         "vivek123".toCharArray());
		
		MongoDatabase database = mongo.getDatabase("EmployeeDB");
		//database.createCollection("test_collection");
		MongoCollection<Document> collection = database.getCollection("test_collection");
		System.out.println("Collection test_collection selected successfully");
		Document document = new Document("title", "MongoDB")
		.append("description", "database")
		.append("likes", 100)
		.append("url", "http://www.tutorialspoint.com/mongodb/")
		.append("by", "tutorials point");
		System.out.println("MongoDB: "+ database);
		
		collection.insertOne(document);
		mongo.close();
	}

}
