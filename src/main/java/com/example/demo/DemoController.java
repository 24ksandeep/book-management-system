package com.example.demo;

import com.example.demo.entity.Books;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class DemoController {
    @Autowired
    private BookService bookService;

    @GetMapping("/home")
    public String home(Model theModel) {
        List<Books> books = bookService.getAllBooks();
        theModel.addAttribute("bookList", books);
        return "home";
    }

    @GetMapping("/addBook")
    public String addBook(Model model){
        model.addAttribute("book",new Books());
        return "addBook";
    }

    @PostMapping("/book/save")
    public String saveBook(@ModelAttribute("book") Books book) {
        bookService.saveBook(book);
        return "redirect:/home";
    }

    @GetMapping("/plain-login")
    public String login() {
        return "plain-login";
    }
    @GetMapping("/book/read/{id}")
    public String readBook(@PathVariable("id") Long id,Model model){
        Books book = bookService.findById(id);
        model.addAttribute("book",book);
        return "readBook";
    }
    @GetMapping("/book/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        bookService.deleteBookById(id);
        return "redirect:/home";
    }
}