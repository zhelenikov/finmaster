package ru.obn.pz.finmaster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController("/")
public class CustomController {

    private static final List<String> tickets = Stream.of("GZPR, SBER, ALRO").collect(Collectors.toList());

    @GetMapping
    public String test() {
        return "Я работаю, не мешай!";
    }

    @GetMapping("tickets")
    public List<String> getAllTicket() {
        return tickets;
    }
}
