
public class BradeKnight extends AblityOfEnemy {
	
	public BradeKnight(String attackName) {
		super.attackName = attackName;
	}

	@Override
	
	protected void useAbility() {
		System.out.println(super.attackName);
	}

}