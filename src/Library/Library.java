package Library;

import java.util.*;

/**
 * Created by Elizaveta Naimark on 13.09.2016.
 */
public class Library {
    Map<Book, Integer> books = new TreeMap<>();
    Map<User, Set<Book>> takenBooks = new HashMap<>();
    Map<Book, Queue<User>> booksQueue = new HashMap<>();

    public Collection<Book> getAllBooks(){
        return books.keySet();
    }

    public Collection<Book> getFreeBooks(){
        List<Book> freeBooks = new ArrayList<>();

        for (Book book : books.keySet()){
            if(isBookAvailable(book)){
                freeBooks.add(book);
            }
        }

        return freeBooks;
    }

    public void addBook(Book book){
        books.putIfAbsent(book, 0); //To avoid NPE
        Integer count = books.get(book);
        books.put(book,count + 1);
    }

    public void addBook(Book book, int count){
        books.putIfAbsent(book, 0); //To avoid NPE
        Integer current = books.get(book);
        books.put(book,current + count);
    }

    //TODO check to not stand in Queue more than once
    public void addUserToQueue(User user, Book book){
        booksQueue.putIfAbsent(book, new LinkedList<User>()); //To avoid NPE
        booksQueue.get(book).add(user);
    }

    public boolean isBookWanted(Book book){
        return booksQueue.get(book) != null && !booksQueue.get(book).isEmpty();
    }

    public boolean isBookAvailable(Book book){
        return books.get(book) != null && books.get(book) > 0;
    }

    public boolean isBookTakenByUser(User user, Book book){
        return takenBooks.get(user) != null && takenBooks.get(user).contains(book);
    }

    public boolean takeBook(User user, Book book){
        if(!(isBookAvailable(book))){
            return false;
        }
        if(isBookTakenByUser(user, book)){
            return false;
        }
        Integer count = books.get(book);
        books.put(book, count - 1);

        takenBooks.putIfAbsent(user, new HashSet<Book>()); //To avoid NPE
        takenBooks.get(user).add(book);

        return true;
    }

    public boolean takeBook(User user, Book book, boolean isQueueRequired){
        boolean result = takeBook(user, book);
        if(result) return result;
        if(!isQueueRequired) return result;
        addUserToQueue(user, book);
        return true;
    }

    public void returnBook(User user, Book book){
        if(!(isBookTakenByUser(user, book))) return;
        takenBooks.get(user).remove(book);
        addBook(book);

        if(!isBookWanted(book)) return;
        User waitingUser = booksQueue.get(book).poll();
        takeBook(waitingUser, book);
    }

}
