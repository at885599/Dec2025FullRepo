
public abstract class Character {
	private String name;
	protected int max_health;
	protected int health=10;
	public Character(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public abstract void examine();
}
