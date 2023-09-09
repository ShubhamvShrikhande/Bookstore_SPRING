package com.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book.dto.BookDetailsDTO;
import com.book.model.BookDetails;

@Service
public interface IBookDetailsService {
	List<BookDetails> showAllBooks(String token);

	BookDetails getBookById(String token, int bookId);

	BookDetails addBook(String token, BookDetailsDTO bookDto);

	void deleteBook(String token, int bookId);

	BookDetails updateBook(String token, int bookId, BookDetailsDTO bookdto);

	BookDetails updateBookQuantity(String token, int bookId, int bookQuantity);

	BookDetails updateBookPrice(String token, int bookId, int bookPrice);

}