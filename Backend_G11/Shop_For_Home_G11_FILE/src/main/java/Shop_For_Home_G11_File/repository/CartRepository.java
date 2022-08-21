package Shop_For_Home_G11_File.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Shop_For_Home_G11_File.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
