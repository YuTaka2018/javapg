package practice;


public class PersonalInfo {
	public static void main(String[] args) { 
		PersonalList personallist = new PersonalList();
		personallist.setList("高橋", "ひろし", "にじゅうよん", "男", "東京都江戸川区");
		personallist.showList();
		personallist.setList("松野", "あきこ", "にじゅうよん", "女", "東京都新宿区");
		personallist.showList();
		personallist.setList("吉田", "かずひろ", "にじゅうよん", "男", "東京都足立区");
		personallist.showList();
	}

}
