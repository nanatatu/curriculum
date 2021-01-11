
public class PlasmaWisp extends AblityOfEnemy {
	
	public PlasmaWisp(String attackName) {
		super.attackName = attackName;
	}
	@Override
	protected void useAbility() {
		System.out.println(super.attackName);
		
	}

}
