package com.example.Hostel.booking.Repository;

import java.util.Optional;

import com.example.Hostel.booking.model.Role;
import com.example.Hostel.booking.model.RoleName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(Role roleName);

	Optional<Role> findByName(RoleName roleUser);
}