package practice;


public class PersonalInfo {
	public static void main(String[] args) { 
		PersonalList personallist = new PersonalList();
		personallist.setList("‚‹´", "‚Ğ‚ë‚µ", "‚É‚¶‚ã‚¤‚æ‚ñ", "’j", "“Œ‹“s]ŒËì‹æ");
		personallist.showList();
		personallist.setList("¼–ì", "‚ ‚«‚±", "‚É‚¶‚ã‚¤‚æ‚ñ", "—", "“Œ‹“sVh‹æ");
		personallist.showList();
		personallist.setList("‹g“c", "‚©‚¸‚Ğ‚ë", "‚É‚¶‚ã‚¤‚æ‚ñ", "’j", "“Œ‹“s‘«—§‹æ");
		personallist.showList();
	}

}
