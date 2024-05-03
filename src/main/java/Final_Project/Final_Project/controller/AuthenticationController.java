package Final_Project.Final_Project.controller;


import Final_Project.Final_Project.model.Customer;
import Final_Project.Final_Project.repository.CustomerRepository;
import Final_Project.Final_Project.security.TokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    CustomerRepository customerRepository;

    public AuthenticationController(AuthenticationManager authenticationManager, TokenService tokenService, CustomerRepository customerRepository) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
        this.customerRepository = customerRepository;
    }

    @PostMapping("/signup")
    public void signup(@RequestBody Customer customer) {
        try {

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encodedPassword = encoder.encode(customer.getPassword());
            customer.setPassword(encodedPassword);
            customerRepository.save(customer);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/signin")
    public String login(@RequestBody Customer customer){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(customer.getUsername(), customer.getPassword()));
        return tokenService.generateToken(authentication);
    }
}
