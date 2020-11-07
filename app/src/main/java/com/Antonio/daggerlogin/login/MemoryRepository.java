package com.Antonio.daggerlogin.login;

public class MemoryRepository implements LoginRepository {
    private User user;
    @Override
    public void saveUser(User user) {
        if (user == null){
            user = getUser();
        }else{
            this.user = user;
        }
    }

    @Override
    public User getUser() {
        if (user == null){
            user = new User("Antonio", "Banderas");
            user.setId(0);
        }
        return user;
    }
}
