package net.pr.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.pr.shoppingbackend.dao.CategoryDAO;
import net.pr.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> cat=new ArrayList<>();
	
	static {
		Category cate=new Category();
		
		//adding first category
		
		cate.setId(1);
		cate.setName("Mobile");
		cate.setDescription("this is decription of mobile");
		cate.setImageURL("CAT_1.png");
		
		cat.add(cate);
		
		//adding 2nd category
		
		cate=new Category();
		cate.setId(2);
		cate.setName("TV");
		cate.setDescription("this is decription of TV");
		cate.setImageURL("CAT_2.png");
		
		cat.add(cate);
		
		//adding 3rd category
		
		cate=new Category();
		cate.setId(3);
		cate.setName("Laptop");
		cate.setDescription("this is decription of Laptop");
		cate.setImageURL("CAT_3.png");
		
		cat.add(cate);
	
	}
	
		
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return cat;
	}

}
