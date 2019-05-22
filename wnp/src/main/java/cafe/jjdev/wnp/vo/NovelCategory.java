package cafe.jjdev.wnp.vo;

public class NovelCategory {
	
	private int novelCategoryNo;
	private String novelCategoryName;
	
	public int getNovelCategoryNo() {
		return novelCategoryNo;
	}
	public void setNovelCategoryNo(int novelCategoryNo) {
		this.novelCategoryNo = novelCategoryNo;
	}
	public String getNovelCategoryName() {
		return novelCategoryName;
	}
	public void setNovelCategoryName(String novelCategoryName) {
		this.novelCategoryName = novelCategoryName;
	}
	
	@Override
	public String toString() {
		return "NovelCategory [novelCategoryNo=" + novelCategoryNo + ", novelCategoryName=" + novelCategoryName + "]";
	}
}
