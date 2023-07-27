package com.dataminds.generalis.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id", callSuper = false)
@Entity
@Table(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private String id;

//    @Convert(converter = Role.UserTypeConverter.class)
//    @Column(name = "role")
//    private Role role;

    @Column(name = "Mail", nullable = false, unique = true)
    private String email;

    @Column(name = "Firstname", nullable = false)
    private String firstname;

    @Column(name = "Lastname", nullable = false)
    private String lastname;

    @Column(name = "Password", length = 128)
    private String password;

    @Column(name = "CreatedUser", nullable = true)
    private String createdUser;

    @CreationTimestamp
    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "ChangedAt")
    private LocalDateTime changedAt;

    @DateTimeFormat
    @Column(name = "LastLogin")
    private LocalDateTime lastLogin;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive = true;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name="user_role",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")}
    )
    private List<Role> role = new ArrayList<>();

    public User(String email, String password, String firstName, String lastName) {
        super();
        this.email = email;
        this.password = password;
        this.firstname = firstName;
        this.lastname = lastName;
    }
}
