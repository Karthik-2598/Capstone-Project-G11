package Shop_For_Home_G11_File.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import Shop_For_Home_G11_File.entity.User;
import Shop_For_Home_G11_File.entity.WishList;
import Shop_For_Home_G11_File.repository.WishListCustomRepository;
import Shop_For_Home_G11_File.repository.WishlistRepository;


@Service
@Transactional
public class WishListService {

    private final WishlistRepository wishListRepository;
    
    @Autowired
    private WishListCustomRepository wishListCustomRepository;
    
    
    public WishListService(WishlistRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public WishList createWishlist(WishList wishList) {
    	return wishListRepository.save(wishList);
    }

    public List<WishList> readWishList(Long userId) {
		return null;
       // return wishListRepository.findAllByUserIdOrderByCreatedDateDesc(userId);
    }

	public Boolean deleteWishlist(User users, String productId) {
		return wishListCustomRepository.deleteWishlist(users,productId);
	}

	public Page<WishList> findByBuyerEmail(Long id, PageRequest request) {
		return wishListRepository.findAllByUserId(id, request);
	}
}
