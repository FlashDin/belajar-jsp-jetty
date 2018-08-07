package org.eclipse.jetty.belajar.main;


import org.eclipse.jetty.belajar.dao.ProfileDAO;
import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.dao.impl.ProfileDAOImpl;
import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.Profile;
import org.eclipse.jetty.belajar.entity.User;

import java.util.ArrayList;
import java.util.List;

public class MainCRUD {

    private static UserDAO userDAO = (UserDAO) new UserDAOImpl();
    private static User user = new User();
    private static List<User> users = new ArrayList<>();

    private static ProfileDAO profileDAO = (ProfileDAO) new ProfileDAOImpl();
    private static Profile profile = new Profile();
    private static List<Profile> profiles = new ArrayList<>();

    public static void main(String[] args) {
        int result = 0;
//        user.setId(1);
//        user.setUsername("User2");
//        user.setPassword("Password2");
//        userDAO.save(user);
//        userDAO.update(user);

//        result = userDAO.delete(user);
//        if (result > 0) {
//            System.out.println("Data dihapus update");
//        } else {
//            System.out.println("Gagal dihapus data");
//        }

//        user = userDAO.findById(user);
//        System.out.println(user.getId() + ", " + user.getUsername() + ", " + user.getPassword());

//        users = userDAO.findAll();
//        for (User dataProfile : users) {
//            System.out.println(dataProfile.getId() + ", " + dataProfile.getUsername() + ", " + dataProfile.getPassword());
//        }

//        profile.setId(1);
//        profile.setNamaLengkap("Complete Name 2");
//        profile.setAlamat("Alamat 2");
//        profile.setUmur(20);
//        profile.setJk("Pria");
//        profileDAO.save(profile);
//        profileDAO.update(profile);

//        result = profileDAO.delete(profile);
//        if (result > 0) {
//            System.out.println("Data dihapus update");
//        } else {
//            System.out.println("Gagal dihapus data");
//        }
//
//        profile = profileDAO.findById(profile);
//        System.out.println(profile.getId() + ", " + profile.getNamaLengkap() + ", " + profile.getAlamat() + ", " + profile.getUmur() + ", " + profile.getJk());

        profiles = profileDAO.findAll();
        for (Profile dataProfile : profiles) {
            System.out.println(dataProfile.getId() + ", " + dataProfile.getNamaLengkap() + ", " + dataProfile.getAlamat() + ", " + dataProfile.getUmur() + ", " + dataProfile.getJk());
        }
    }

}
