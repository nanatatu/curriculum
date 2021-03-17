package chapte5;

class Employee {
	int id;

	void setId(int i) {
		id = i;
	}
	int getId() {
		return id;
	}
}

public class InstanseMain {

	public static void main(String[] args) {
		Employee a = new Employee();	//Aさん用オブジェクトを作成
		a.setId(100);	//IDをセットする

		Employee b = new Employee();	//Bさん用オブジェクトを作成
		b.setId(200);	//IDをセットする

		System.out.println("Aさん:" + a.getId());	//IDの表示
		System.out.println("Bさん:" + b.getId());

	}

}
