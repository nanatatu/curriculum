
public class Trainee extends JavaCurriculumTrainee {

	public Trainee(String name) {
		super(name);
		
	}

	@Override
	public void doJavaCurriculum() {
		System.out.println("わたくし" + super.getName() + "はJavaカリキュラムをこなします");
		
	}

}
