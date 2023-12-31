package com.codegym.haichanbank.service.CardService;

import com.codegym.haichanbank.model.Cards;
import com.codegym.haichanbank.model.Customer;
import com.codegym.haichanbank.repository.CardsRepository;
import com.codegym.haichanbank.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService{
    @Autowired
    private CardsRepository cardsRepository;

    @Autowired

    private CustomerRepository customerRepository;
    private String email;



    public Iterable<Cards> findAll() {
        return cardsRepository.findAll();
    }

    public Optional<Cards> findById(int id) {
        return cardsRepository.findById(id);
    }


    public Cards save(Cards cards) {
        return cardsRepository.save(cards);
    }


    public void remove(int id) {

    }


    public List<Cards> getCardDetails(String email) {

        List<Customer> customers = customerRepository.findByEmail(email);
        if (customers != null && !customers.isEmpty()) {
            List<Cards> cards = cardsRepository.findByCustomerId(customers.get(0).getId());
            if (cards != null ) {
                return cards;
            }
        }
        return null;
    }
}
