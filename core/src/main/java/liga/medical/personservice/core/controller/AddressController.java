package liga.medical.personservice.core.controller;

import liga.medical.dto.annotations.DbLog;
import liga.medical.personservice.core.model.Address;
import liga.medical.personservice.core.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    @DbLog
    public List<Address> getAddress() {
        return addressService.getAddress();
    }

    @PostMapping
    @DbLog
    public int addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }
}
