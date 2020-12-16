package exercise;

public class Employee {
	
	//empId: 社員番号
	private int empId;
	
	//name 氏名
	private String name;
	
	//コンストラクタ: 引数なし
	public Employee() {
		
	}
	
	//コンストラクタ: 引数あり
		//@param empId
		//@param name
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//社員情報をコンソールへ出力するメソッド
	
	public void printEmployeeInfo() {
		System.out.println("社員番号	:" + this.empId);
		System.out.println("氏名		:" + this.name);
	}

}
