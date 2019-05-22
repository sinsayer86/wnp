package cafe.jjdev.wnp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cafe.jjdev.wnp.mapper.NovelCategoryMapper;
import cafe.jjdev.wnp.vo.NovelCategory;

@Service
@Transactional
public class NovelCategoryService {
	@Autowired NovelCategoryMapper novelCategoryMapper;
	
	// 소설 카테고리 get
	public List<NovelCategory> getNovelCategory(){
		return novelCategoryMapper.selectNovelCategory();
	}
}
