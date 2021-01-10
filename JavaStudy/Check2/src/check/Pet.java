package check;

public class Pet {
	
//	クラスPetのプライベート変数定義
    private String name;
    private String masterName;
    
//  値にnameとmasternamを持つペットメソッド
    public Pet(String name, String masterName) {
    	
//	プライベート変数name,masternameを代入
        this.name = name;
        this.masterName = masterName;
    }

//	getter
    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

//	introduceメソッド
    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

//	Petクラスを継承するRobotPetクラス、引数は親クラスPetを継承
class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

//	RobotPetのintroduceメソッド
    public void introduce() {
    	
//Petの変数はプライベート変数だから、ゲッターを用いる
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}