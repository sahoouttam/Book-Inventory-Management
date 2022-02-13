package com.example.BookInventoryManagement.Business;

import com.example.BookInventoryManagement.Persistence.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BookUserDetailsService implements UserDetailsService {
    
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findById(name).orElseThrow(() -> new UsernameNotFoundException("user not found"));
        return new BookUserDetails(user);
    }
}
