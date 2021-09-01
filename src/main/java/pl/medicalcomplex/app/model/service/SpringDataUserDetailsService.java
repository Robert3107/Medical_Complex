package pl.medicalcomplex.app.model.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.medicalcomplex.app.model.entity.User;
import pl.medicalcomplex.app.model.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class SpringDataUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByFirstName(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.getRoles().forEach(role ->
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getName())));
        return new org.springframework.security.core.userdetails.User(
                user.getFirstName(), user.getPassword(), grantedAuthorities);
    }
}
