package practice;

public class PersonalList{
	String firstName;
	String lastName;
	String age;
	String gender;
	String address;


	//こんそーる出力メソッド
	public void showList(){
		
		System.out.println("会員情報はこちらです。");
		System.out.println("姓："+ firstName);
		System.out.println("名前："+ lastName);
		System.out.println("年齢："+ age);
		System.out.println("性別："+ gender);
		System.out.println("住所："+ address+ "\n");
		
	}

	//設定メソッド
	public void setList(String firstName,String lastName,String age,String gender,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	
	}

}
