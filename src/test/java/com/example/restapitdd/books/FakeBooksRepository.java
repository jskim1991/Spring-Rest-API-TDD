package com.example.restapitdd.books;

import com.example.restapitdd.books.Book;
import com.example.restapitdd.books.BooksRepository;
import com.example.restapitdd.books.NewBook;

import java.util.ArrayList;
import java.util.List;

public class FakeBooksRepository implements BooksRepository {
    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book getById(long id) {
        return books.get((int) (id - 1));
    }

    @Override
    public Book create(NewBook newBook) {
        Book createdBook = new Book((long) books.size() + 1, newBook.getName(), newBook.getAuthor());
        books.add(createdBook);

        return createdBook;
    }
}
