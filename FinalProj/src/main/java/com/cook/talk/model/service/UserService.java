/*
 * package com.cook.talk.model.service;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * import org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.cook.talk.model.VO.UserVO; import com.cook.talk.model.dto.UserDTO;
 * import com.cook.talk.repository.UserRepository; import
 * com.fasterxml.classmate.MemberResolver;
 * 
 * import lombok.AllArgsConstructor;
 * 
 * @Service
 * 
 * @AllArgsConstructor public class UserService implements UserDetailsService {
 * 
 * 
 * 
 * private UserRepository userRepository;
 * 
 * @Transactional public Long joinUser(UserVO userVO) { // 비밀번호 암호화
 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
 * UserVO.setPassword(passwordEncoder.encode(UserVO.getPassword())); return
 * UserRepository.save(UserVO.toEntity()).getId(); }
 * 
 * @Override public UserDetails loadUserByUsername(String userEmail) throws
 * UsernameNotFoundException{ Optional<UserVO> userEntityWrapper=
 * UserRepository.findByEmail(userEmail); UserVO userVO= userVOWrapper.get();
 * List<GrantedAuthority> authorities=new ArrayList<>() ;
 * if(("admin@example.com").equals(userEmail)) { authorities.add(new
 * SimpleGrantedAuthority(Role.ADMIN.getValue())); }else { authorities.add(new
 * SimpleGrantedAuthority(Role.MEMBER.getValue()));
 * 
 * } return new User(userVO.getEmial(),userVO.getPassword(),authorities); }
 * 
 * }
 */