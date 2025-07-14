package com.oregoom.srp.refractor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import com.oregoom.srp.refractor.*;

public class BookFilePersistence extends BookPersistence {

    public void save(Book book) {
        String bookFilePath =
                Book.BOOK_DIRECTORY_PATH + "/" + book.getTitle() + "_"
                        + new Date().getTime();
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(bookFilePath));
            List<Page> Pages = book.getPages();
            for (Page page : Pages) {
                writer.write("---- Page " + page.getNumber() + " ----");
                writer.newLine();
                writer.write(page.getContent());
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            throw new BookPersistenceException();
        }

    }

}