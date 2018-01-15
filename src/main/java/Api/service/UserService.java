package Api.service;

import Api.model.User;
import Api.persistence.DaoHolder;
import Api.persistence.UserDao;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserService extends BaseService<User> {

    private final UserDao userDao;

    @Inject
    public UserService()
    {
        this.userDao = DaoHolder.userDao;
    }

    public User getUser(int id){
        return userDao.findById(id);
    }

    public void createUser(User user){
        userDao.create(user);
    }
}
