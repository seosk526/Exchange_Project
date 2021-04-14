package firstprj;

public class Characters {
		String name;
		int age;
		double offensepower;
		double defensepower; 
		
		/* private�� int �տ� �θ� main �Լ����� ���� ���� ����� 
		static�� ������ .�� ������ ���밡�� */
				
		public Characters(String name, int age, double offensepower, double defensepower) {
			this.name = name;
			this.age = age;
			this.offensepower = offensepower;
			this.defensepower = defensepower;	
		}
		public Characters(String name) {
			this.name = name;
		}
		
		public Characters(int age, double offensepower) {
			this.age = age;
			this.offensepower = offensepower;			
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getOffensepower() {
			return offensepower;
		}

		public void setOffensepower(double offensepower) {
			this.offensepower = offensepower;
		}

		public double getDefensepower() {
			return defensepower;
		}

		public void setDefensepower(double defensepower) {
			this.defensepower = defensepower;
		}

		
		public void printCharacter() {
			System.out.println(name + "/" + age + "/" + offensepower + "/" + defensepower);
		}
	}

