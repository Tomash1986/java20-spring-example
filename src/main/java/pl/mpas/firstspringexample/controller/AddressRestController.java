package pl.mpas.firstspringexample.controller;


import org.springframework.web.bind.annotation.*;
import pl.mpas.firstspringexample.domain.Address;
import pl.mpas.firstspringexample.service.AdressService;

@RestController
@RequestMapping("/address")
public class AddressRestController {

    private AdressService addressService;

    public AddressRestController(AdressService addressService) {
        this.addressService = addressService;
    }

    // /address/my-address
    @PostMapping("/my-address")
    public Address getMyAddress() {
        return new Address("Warszawa", "unknown",
                "22-222");
    }
    //../address/save?
    @GetMapping("/save")
    public Address saveNewAddres(@RequestParam("city") String city
            ,@RequestParam("street") String street
            ,@RequestParam("postalCode") String postalCode){

        Address toSave=new Address(city,street,postalCode);
        return addressService.saveNewAddress(toSave);

    }
}
