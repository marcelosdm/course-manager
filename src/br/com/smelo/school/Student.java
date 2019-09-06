package br.com.smelo.school;

public class Student {
	

	
	private String name;
	private int registry;
	
	public Student(String name, int registry) {
		if(name == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.registry = registry;
	}

	public String getName() {
		return name;
	}

	public int getRegistry() {
		return registry;
	}

	@Override
	public String toString() {
		return "[Student: " + this.name + " | registry: " + this.registry + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + registry;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (registry != other.registry)
			return false;
		return true;
	}

}
