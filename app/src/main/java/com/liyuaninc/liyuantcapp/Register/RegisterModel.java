package com.liyuaninc.liyuantcapp.Register;

/**
 * Created by candy on 15/05/2017.
 */

public interface RegisterModel {

    void register(String email, String password, String username);

    boolean isExisted(String email);
}
