package com.mobusher;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mobusher.dao.MedicineRepo;
import com.mobusher.dao.StoreRepo;
import com.mobusher.model.Medicine;
import com.mobusher.model.Store;

@SpringBootApplication
//implements CommandLineRunner
public class OnlineSearchApplication {
	
//	@Autowired
//    private MedicineRepo tagRepository;
//    @Autowired
//    private StoreRepo postRepository;
    public static void main(String[] args) {
        SpringApplication.run(OnlineSearchApplication.class, args);
    }
//    @Override
//    public void run(String... args) throws Exception {
//        // Cleanup the tables
//        postRepository.findAll();
//        tagRepository.findAll();
//        
//        Store post = new Store("Pharmacy","Street Address","City","State", 11230,"USA","WS","WS","Y","N");
//        // Create two tags
//        Medicine tag1 = new Medicine("Aspirin","OTC",10);
//        Medicine tag2 = new Medicine("Advill","OTC",30);
//        
//        // Add tag references in the post
//        post.getMedicines().add(tag1);
//        post.getMedicines().add(tag2);
//        // Add post reference in the tags
//        tag1.getStores().add(post);
//        tag2.getStores().add(post);
//        postRepository.save(post);
//       
//    }
}