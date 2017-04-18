package dungeon.model;

public abstract class Item
{
	private Boolean isTemp;
	private String name;
	private int increase;
	private int dropChance;
	
	public Item(Boolean isTemp, String name, int increase, int dropChance)
	{
		this.isTemp = isTemp;
		this.name = name;
		this.increase = increase;
		this.dropChance = dropChance;
	}

	public Boolean getIsTemp()
	{
		return isTemp;
	}

	public void setIsTemp(Boolean isTemp)
	{
		this.isTemp = isTemp;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getIncrease()
	{
		return increase;
	}

	public void setIncrease(int increase)
	{
		this.increase = increase;
	}

	public int getDropChance()
	{
		return dropChance;
	}

	public void setDropChance(int dropChance)
	{
		this.dropChance = dropChance;
	}
}
