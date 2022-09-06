package service;

import enitity.User;

import java.util.Random;


public interface UserService {
    int add_user = new Random().ints(1, 1, 11).findFirst().getAsInt(); ;
    }

