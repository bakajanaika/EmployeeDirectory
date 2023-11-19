package kg.mega.employeedirectory.models.enums;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    ADMIN(Set.of(Permission.ADMIN_WRITE, Permission.ADMIN_EDIT)),
    DISABLED(Set.of(Permission.ADMIN_DISABLED)),
    SUPER_ADMIN(Set.of(Permission.SUPER_ADMIN, Permission.ADMIN_WRITE, Permission.ADMIN_EDIT));

    private final Set<Permission> permissions;
    Role(Set<Permission> permissions) {
        this.permissions = permissions;

    }
    public Set<Permission> getPermissions() {
        return permissions;
    }
    public Set<SimpleGrantedAuthority> getAuthorities(){
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}

