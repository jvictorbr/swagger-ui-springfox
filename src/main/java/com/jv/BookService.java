package com.jv;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookService {
	
	@RequestMapping(path="/api/book/{isbn}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getInfo(@PathVariable("isbn") Long isbn) { 
		
		Book book = new Book();
		book.setIsbn(isbn);
		book.setTitle("Dummy_"+isbn);
		book.setAuthor("The Author");
		book.setEdition("Uncut");
		book.setYear(1970);
		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
		
	}

}
