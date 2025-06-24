package sound;

import java.io.Serializable;

public class SoundVO implements Serializable{
	private int soundNo;
	private String title;
	private String author;
	private int countLikes;
	private int countHaveUsers;
	private int price;
	
	public SoundVO(int soundNo, String title, String author, int countLikes, int countHaveUser, int price) {
		this.soundNo = soundNo;
		this.title = title;
		this.author = author;
		this.countLikes = countLikes;
		this.countHaveUsers = countHaveUser;
		this.price = price;
	}
	
	public SoundVO(String title, String author, int price) {
		this(0, title, author, 0, 0, price);
	}

	public int getSoundNo() {
		return soundNo;
	}

	public void setSoundNo(int soundNo) {
		this.soundNo = soundNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCountLikes() {
		return countLikes;
	}

	public void setCountLikes(int cntLikes) {
		this.countLikes = cntLikes;
	}

	public int getCountHaveUsers() {
		return countHaveUsers;
	}

	public void setCountHaveUsers(int cntHaveUsers) {
		this.countHaveUsers = cntHaveUsers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + soundNo + ". " + title + "-" + author + " / 좋아요 수 :" + countLikes + " / 보유 수 : " + countHaveUsers + "/ 구매 비용: " + price + "]";
	}
	
	
}
