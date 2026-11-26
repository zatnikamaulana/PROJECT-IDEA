package dao;

import Model.User;

public class UserDao {
    public static void save(User user){
        String query = "Insert into user (name,sandi) values('"+user.getName()+"','"+user.getSandi()+"','false')";
        DbOperations.setDataDelete(query,"Registrasi berhasil!!");

    }
}
