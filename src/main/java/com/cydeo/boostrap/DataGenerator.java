package com.cydeo.boostrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DataGenerator implements CommandLineRunner {


    private final RoleService roleService;
    private final UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {


        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Menager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");


        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John","Kesy",
                "John@cydeo.com","Abc1",true,"7459689789",managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Maja","Stamenkovic",
                "Maja@cydeo.com","1231",true,"7459688769",managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Martina","Stamenkovic",
                "Mace@cydeo.com","cccc1",true,"745963452",managerRole, Gender.FEMALE);
        UserDTO user4 = new UserDTO("Strahinja","Maslovaric",
                "Strale@cydeo.com","12asc1",true,"7459683432",managerRole, Gender.MALE);
        UserDTO user5 = new UserDTO("Srdjan","Kesy",
                "John@cydeo.com","Absss1",true,"7459623532",managerRole, Gender.MALE);
        UserDTO user6 = new UserDTO("Nikola","Kesicf",
                "John@cydeo.com","Absdf1",true,"7459523532",managerRole, Gender.MALE);
        UserDTO user7 = new UserDTO("Ljiljana","Stamenkovic",
                "John@cydeo.com","Ab5641",true,"7459184532",managerRole, Gender.FEMALE);
        UserDTO user8 = new UserDTO("Andjela","Taskovic",
                "John@cydeo.com","A00oi1",true,"7459000532",managerRole, Gender.FEMALE);


        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);



    }
}
