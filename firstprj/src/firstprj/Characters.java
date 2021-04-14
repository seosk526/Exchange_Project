package firstprj;

public class Characters {
		String name;
		int age;
		double offensepower;
		double defensepower; 
		
		/* private을 int 앞에 두면 main 함수에서 쉽게 접근 어려움 
		static을 넣으면 .만 눌러도 적용가능 */
				
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

