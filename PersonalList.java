package practice;

public class PersonalList{
	String firstName;
	String lastName;
	String age;
	String gender;
	String address;


	//���񂻁[��o�̓��\�b�h
	public void showList(){
		
		System.out.println("������͂�����ł��B");
		System.out.println("���F"+ firstName);
		System.out.println("���O�F"+ lastName);
		System.out.println("�N��F"+ age);
		System.out.println("���ʁF"+ gender);
		System.out.println("�Z���F"+ address+ "\n");
		
	}

	//�ݒ胁�\�b�h
	public void setList(String firstName,String lastName,String age,String gender,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	
	}

}
