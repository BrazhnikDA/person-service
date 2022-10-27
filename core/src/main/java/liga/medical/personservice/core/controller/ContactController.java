package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Contact;
import liga.medical.personservice.core.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getContacts();
    }

    @PostMapping
    public Integer insertContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

}
