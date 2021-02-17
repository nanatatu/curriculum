package bean;
//社員情報データ
public class EmployeeBean {
	private String Id;
	private String PassWord;
	private String Name;
	private String Comment;
	private String Login_Time;

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getLogin_Time() {
		return Login_Time;
	}
	public void setLogin_Time(String login_Time) {
		Login_Time = login_Time;
	}


}
