/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import panel.Book;


public class BookCollection {

    private final Book[] scienceBooks;
    private final ArrayList<Book> programmingBooks;
    private final Queue<Book> historyBooks;
    private final HashMap<Integer, Book> techBooks;

    public BookCollection() {
        this.scienceBooks = new Book[]{
            new Book("Brief History of Time", "Stephen Hawking", "/img/brief-history-of-time.png"),
            new Book("Cosmos", "Carl Sagon", "/img/cosmos.png")
        };

        this.programmingBooks = new ArrayList<>();
        this.programmingBooks.add(new Book("Effective Java", "Joshua Bloch", "/img/effective-java.png"));
        this.programmingBooks.add(new Book("Clean Code", "Robert Martin", "/img/clean-code.png"));

        this.historyBooks = new LinkedList<>();
        this.historyBooks.add(new Book("Sapiens", "Yuval Noah Harari", "/img/sapiens.png"));
        this.historyBooks.add(new Book("Guns, Germs and Steel", "Jared Diamond", "/img/guns-germs-and-steel.png"));

        this.techBooks = new HashMap<>();
        this.techBooks.put(1, new Book("AI: A Modern Approach", "Russell & Norving", "/img/ai.png"));
        this.techBooks.put(2, new Book("Deep Learning", "Ian Goodfellow", "/img/deep-learning.png"));
    }

    private class ArrayIterator implements Iterator {

        private final Book[] books;
        private int index;

        public ArrayIterator(Book[] books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }

    }

    private class ArrayListIterator implements Iterator {

        private final ArrayList<Book> books;
        private int index;

        public ArrayListIterator(ArrayList<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            return books.get(index++);
        }
    }

    private class QueueIterator implements Iterator {

        private final LinkedList<Book> books;
        private int index;

        public QueueIterator(Queue<Book> books) {
            this.books = (LinkedList<Book>)books;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            return books.get(index++);
        }

    }

    private class HashMapIterator implements Iterator {

        private final Book[] books;
        private int index;

        public HashMapIterator(HashMap<Integer, Book> hashMapData) {
            books = hashMapData.values().toArray(new Book[0]);
        }

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }
    
    public Iterator getIterator(String category){
        switch (category) {
            case "Science":
                return new ArrayIterator(scienceBooks);
            case "Programming":
                return new ArrayListIterator(programmingBooks);
            case "History":
                return new QueueIterator(historyBooks);
            case "Technology":
                return new HashMapIterator(techBooks);
            default:
                return null;
        }
    }
}
