package edu.miu.cs.cs425.fairfieldlibraryapp;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.Address;
import edu.miu.cs.cs425.fairfieldlibraryapp.model.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FairfieldlibrarywebappApplication {

	public static void main(String[] args) {
		System.out.println("Hello, FairfieldLibrary webapp...");
		SpringApplication.run(FairfieldlibrarywebappApplication.class, args);

//		List<Publisher> publishers = Arrays.asList(
//				new Publisher(null, "Facebook", new Address(null, "3000 N 4TH ST", "FAIRFIELD", "Iowa", "52556", null)),
//				new Publisher(null, "Netflix", new Address(null, "5000 S 4TH ST", "FAIRFIELD", "Iowa", "52556", null)),
//				new Publisher(null, "Google", new Address(null, "1600 Amphitheatre Parkway", "Mountain View", "California", "94043", null)),
//				new Publisher(null, "Amazon", new Address(null, "410 Terry Ave N", "Seattle", "Washington", "98109", null)),
//				new Publisher(null, "Apple", new Address(null, "1 Apple Park Way", "Cupertino", "California", "95014", null)),
//				new Publisher(null, "Microsoft", new Address(null, "One Microsoft Way", "Redmond", "Washington", "98052", null)),
//				new Publisher(null, "Twitter", new Address(null, "1355 Market St", "San Francisco", "California", "94103", null)),
//				new Publisher(null, "LinkedIn", new Address(null, "1000 W Maude Ave", "Sunnyvale", "California", "94085", null)),
//				new Publisher(null, "Tesla", new Address(null, "3500 Deer Creek Road", "Palo Alto", "California", "94304", null)),
//				new Publisher(null, "Adobe", new Address(null, "345 Park Ave", "San Jose", "California", "95110", null))
//		);
//
//		// Print out the sample data


	}
}
