package liga.medical.personservice.core.controller;

import liga.medical.dto.annotations.DbLog;
import liga.medical.personservice.core.model.Contact;
import liga.medical.personservice.core.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    @DbLog
    public List<Contact> getAllContacts() {
        return contactService.getContacts();
    }

    @PostMapping
    @DbLog
    public Integer insertContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

}
