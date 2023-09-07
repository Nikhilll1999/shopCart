package com.nctech.shopCart.services;

import com.nctech.shopCart.dto.Login;
import java.util.List;

public interface LoginServices  {
  void save (Login login);
  void update(Login login);
  List<Login> findAll();
  Login findById(Integer id);
  void delete(Integer id);
}
