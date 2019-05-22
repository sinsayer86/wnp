package cafe.jjdev.wnp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cafe.jjdev.wnp.vo.NovelCategory;

@Mapper
public interface NovelCategoryMapper {
	public List<NovelCategory> selectNovelCategory(); //소설 카테고리 select
}
