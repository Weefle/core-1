package src.ares.core.currency.type;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import src.ares.core.common.crafted.CraftedItemStack;
import src.ares.core.currency.CurrencyMaterial;
import src.ares.core.currency.CurrencyType;
import src.ares.core.currency.ICurrency;

public class GoldCurrency implements Cloneable, ICurrency
{
	private String name = CurrencyType.GOLD.toString();
	private Material material = CurrencyMaterial.GOLD;

	private int amount;

	public GoldCurrency()
	{
		this(0);
	}

	public GoldCurrency(int amount)
	{
		this.amount = amount;
	}

	@Override
	public int getAmount()
	{
		return amount;
	}

	@Override
	public ItemStack getDisplay()
	{
		return new CraftedItemStack(material, name).glow().build();
	}

	@Override
	public String getFormatted()
	{
		if (amount > 0)
			return amount + " " + name;
		else
			return "Free";
	}

	@Override
	public Material getMaterial()
	{
		return material;
	}

	@Override
	public String getName()
	{
		return name;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}
}
